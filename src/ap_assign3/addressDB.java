//Mohammad Zohaib Abbas, 17L-6305, 8A, l175305@lhr.nu.edu.pk
//This code handles the Back End of the Address Book Application

package ap_assign3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mzohaib
 */
public class addressDB {
    private static String jdbcDriver = "com.mysql.jdbc.Driver";
    private static String dbName = "AddressRecord";
    private static addressDB db_instance = new addressDB();
    private Statement s;
    private Connection conn;

    // Establish Database Connection and Create relevant database and table to store AddressInformation if they don't exist
    private addressDB() { 
       try{
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=arianagrande");
            s = conn.createStatement();
            int Result = s.executeUpdate("CREATE DATABASE IF NOT EXISTS "+dbName);
            
            String AddressTable = "CREATE TABLE IF NOT EXISTS AddressRecord.Address (" 
            + "CNIC varchar(50) NOT NULL,"
            + "Name varchar(50) NOT NULL,"  
            + "Addr varchar(200) NOT NULL," 
            + "Gender varchar(15) NOT NULL,"
            + "Phone varchar(50) NOT NULL," 
            + "PRIMARY KEY (CNIC));";  
            
            boolean flag = s.execute(AddressTable);
            
        } catch(Exception e){
            System.out.println("Error! "+e);
       }
    }
    
   //Singleton Design Pattern Implemented to ensure one instance of addressDB 
   public static addressDB getInstance(){
      return db_instance;
   }
   
   //insert Address Information in DB
   public boolean insertAddress(AddressInformation a){
       
       boolean flag=true;
       
       try{
            String SQL="SELECT * FROM AddressRecord.Address WHERE CNIC='"+String.valueOf(a.getNic())+"'";
                         ResultSet rs=s.executeQuery(SQL);

                         if(!rs.next()){ // if the Address is not already in the database , then insert

                             String sql="INSERT INTO AddressRecord.Address (CNIC,Name,Addr,Gender,Phone)"
                                     + " VALUES (?,?,?,?,?)";

                             PreparedStatement statement=conn.prepareStatement(sql);
                             statement.setString(1,String.valueOf(a.getNic()));
                             statement.setString(2,a.getName());
                             statement.setString(3,a.getAddress());
                             if(a.getGender()){
                                statement.setString(4,"Male"); 
                             }
                             else{
                                statement.setString(4,"Female");
                             }
                             statement.setString(5, String.valueOf(a.getPhone()));

                             int row = statement.executeUpdate();

                             if(row >0) {
                                 System.out.println("A new Address inserted in database Successfully");
                             }
                         } 
                         else{
                             System.err.println("Error! An Address with this Phone Number already exists in Database");
                             flag=false;
                         }
       }catch(SQLException e){
           flag=false;
            System.out.println("Error! "+e);
       }
     return flag;
   }
   
   //Delete Address Information From DB
   boolean deleteAddress(String nic){
            try{
            
                if(conn!=null){
                    
                        String sql="DELETE FROM AddressRecord.Address WHERE CNIC=?";

                        PreparedStatement statement=conn.prepareStatement(sql);
                        
                        statement.setString(1,nic);

                        int row = statement.executeUpdate();

                        if(row >0) {
                            System.out.println("A row deleted from database Successfully");
                            return true;
                        }
                  }
            
        } catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
            return false;
    }
   
   //Update Address Information in DB
   public boolean updateAddressInfo(AddressInformation a){
            try{
            
            if(conn!=null){
                
                        String sql="UPDATE AddressRecord.Address SET Name=?, Addr=?, Gender=?, Phone=? WHERE CNIC=?";

                        PreparedStatement statement=conn.prepareStatement(sql);

                        statement.setString(1,a.getName());
                        statement.setString(2,a.getAddress());
                        if(a.getGender()){
                            statement.setString(3,"Male");
                        }
                        else{
                            statement.setString(3,"Female");
                        }
                        statement.setString(4,String.valueOf(a.getPhone()));
                        statement.setString(5,String.valueOf(a.getNic()));
                        
                        int row = statement.executeUpdate();

                        if(row >0) {
                            System.out.println("Updated Successfully!");
                            return true;
                        }
                  }
            
        } catch(SQLException ex){
            System.out.println("Update Failed!");
            ex.printStackTrace();
            return false;
        }
      return false;
    }
   
   //Search an Address Information in DB
   public AddressInformation searchAddressInfo(String nic, String namestr){
        
            try{
            
            if(conn!=null){
                
                    Statement stat= conn.createStatement();
                    String SQL="";
                    if(namestr.isEmpty()){
                        SQL="SELECT * FROM AddressRecord.Address WHERE CNIC='"+nic+"'";
                    }
                    else{
                        SQL="SELECT * FROM AddressRecord.Address WHERE Name='"+namestr+"'";
                    }
                    ResultSet rs=stat.executeQuery(SQL);
                    
                   while(rs.next()){ 
                       
                       nic=rs.getString(1);
                       String name=rs.getString(2);
                       String addr=rs.getString(3);
                       String gen=rs.getString(4);
                       String pnum=rs.getString(5);
                       
                       AddressInformation a=null;
                       if(gen.toLowerCase().equals("male")){
                           a=new AddressInformation(name, addr,Long.parseLong(pnum), true, Long.parseLong(nic));
                       }
                       else{
                           a=new AddressInformation(name, addr,Long.parseLong(pnum), false, Long.parseLong(nic));
                       }
                       return a;

                    }
                  }

        } catch(SQLException ex){
            ex.printStackTrace();
        }
       return null;
    }
   
}
