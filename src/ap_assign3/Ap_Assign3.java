//Mohammad Zohaib Abbas, 17L-6305, 8A, l175305@lhr.nu.edu.pk
//This code handles the Front End of the Address Book Application

package ap_assign3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;
/**
 *
 * @author mzohaib
 */
public class Ap_Assign3 {

    public Ap_Assign3(){
        JFrame jFrame=new JFrame();
        JPanel jPanel=new JPanel();
        JPanel jPanel2=new JPanel();
        JPanel jPanel3=new JPanel();
        
        //Create JFrame according to screen size, i.e Responsive
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 3/5;
        int width = screenSize.width * 2/5;
        jFrame.setPreferredSize(new Dimension(width, height));
        jFrame.setBackground(Color.decode("#00203777"));
        
        jPanel2.setBorder(new EmptyBorder(50,30,0,30)); // heading panel
        jPanel2.setBackground(Color.decode("#00203777"));

        JButton addBtn, delBtn, updBtn, srcBtn, newBtn;
        
        jPanel2.setLayout( new GridLayout( 0, 5 ) );
        
        //Create Buttons for New, Add, Delete, Update, and Search Functionalities
        newBtn=new JButton("NEW");
        newBtn.setPreferredSize(new Dimension(100,50));
        newBtn.setFont(new Font("Courier", Font.PLAIN,16));
        newBtn.setForeground(Color.decode("#00203777"));
        JPanel newPanel=new JPanel();
        newPanel.setPreferredSize(new Dimension(50,60));
        newPanel.setBackground(Color.decode("#00203777"));
        newBtn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                newBtn.setForeground(Color.decode("#4691D2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newBtn.setForeground(Color.decode("#00203777"));
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        newPanel.add(newBtn);
        jPanel2.add(newPanel);
        
        addBtn=new JButton("ADD");
        addBtn.setPreferredSize(new Dimension(100,50));
        addBtn.setForeground(Color.decode("#00203777"));
        addBtn.setFont(new Font("Courier", Font.PLAIN,16));
        
        addBtn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                addBtn.setForeground(Color.decode("#4691D2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addBtn.setForeground(Color.decode("#00203777"));
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        JPanel addPanel=new JPanel();
        addPanel.setPreferredSize(new Dimension(50,60));
        addPanel.setBackground(Color.decode("#00203777"));
        addPanel.add(addBtn);
        jPanel2.add(addPanel);
        
        delBtn=new JButton("DELETE");
        delBtn.setPreferredSize(new Dimension(100,50));
        delBtn.setForeground(Color.decode("#00203777"));
        delBtn.setFont(new Font("Courier", Font.PLAIN,16));
        delBtn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                delBtn.setForeground(Color.decode("#4691D2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                delBtn.setForeground(Color.decode("#00203777"));
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        JPanel delPanel=new JPanel();
        delPanel.setPreferredSize(new Dimension(50,60));
        delPanel.setBackground(Color.decode("#00203777"));
        delPanel.add(delBtn);
        jPanel2.add(delPanel);
        
        updBtn=new JButton("UPDATE");
        updBtn.setPreferredSize(new Dimension(100,50));
        updBtn.setForeground(Color.decode("#00203777"));
        updBtn.setFont(new Font("Courier", Font.PLAIN,16));
        updBtn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                updBtn.setForeground(Color.decode("#4691D2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                updBtn.setForeground(Color.decode("#00203777"));
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        JPanel updPanel=new JPanel();
        updPanel.setPreferredSize(new Dimension(50,60));
        updPanel.setBackground(Color.decode("#00203777"));
        updPanel.add(updBtn);
        jPanel2.add(updPanel);
        
        srcBtn=new JButton("SEARCH");
        srcBtn.setPreferredSize(new Dimension(100,50));
        srcBtn.setFont(new Font("Courier", Font.PLAIN,16));
        srcBtn.setForeground(Color.decode("#00203777"));
        JPanel srcPanel=new JPanel();
        srcPanel.setPreferredSize(new Dimension(50,60));
        srcPanel.setBackground(Color.decode("#00203777"));
        srcBtn.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                srcBtn.setForeground(Color.decode("#4691D2"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                srcBtn.setForeground(Color.decode("#00203777"));
            }

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        srcPanel.add(srcBtn);
        jPanel2.add(srcPanel);
        
        //Create Appropriate Labels and TextFields in order to make an Address Book Application
        JLabel nicLabel=new JLabel("CNIC");
        nicLabel.setForeground(Color.decode("#BFFFFF"));
        nicLabel.setFont(new Font("Courier", Font.PLAIN, 20));

        JLabel nameLabel=new JLabel("Name");
        nameLabel.setForeground(Color.decode("#BFFFFF"));
        nameLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        
        JLabel addressLabel=new JLabel("Address");
        addressLabel.setForeground(Color.decode("#BFFFFF"));
        addressLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        
        JLabel genderLabel=new JLabel("Gender");
        genderLabel.setForeground(Color.decode("#BFFFFF"));
        genderLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        
        JLabel phoneLabel=new JLabel("Phone");
        phoneLabel.setForeground(Color.decode("#BFFFFF"));
        phoneLabel.setFont(new Font("Courier", Font.PLAIN, 20));
        
        JTextField nicField=new JTextField();
        nicField.setSize(40, 5);
        
        JTextField nameField=new JTextField();
        nameField.setSize(40, 5);
        
        JTextField addField=new JTextField();
        addField.setSize(40, 5);
        
        JTextField phoneField=new JTextField();
        phoneField.setSize(40, 20);
        
        jPanel.setBorder(new EmptyBorder(40,50,0,50));
        jPanel.setBackground(Color.decode("#00203777"));
        
        jPanel.add(nicLabel); jPanel.add(nicField);
        jPanel.add(nameLabel); jPanel.add(nameField);
        jPanel.add(addressLabel); jPanel.add(addField);
        jPanel.add(phoneLabel); jPanel.add(phoneField);

        jPanel.setLayout(new GridLayout(4,2,-200,10));

        
        jPanel3.setBorder(new EmptyBorder(25,50,70,0)); // bottom panel
        jPanel3.setBackground(Color.decode("#00203777"));
        jPanel3.add(genderLabel);
        JRadioButton r1=new JRadioButton(" MALE");    
        JRadioButton r2=new JRadioButton(" FEMALE"); 
        r1.setFont(new Font("Courier", Font.PLAIN, 15));
        r1.setForeground(Color.decode("#AADFFF"));
        r2.setFont(new Font("Courier", Font.PLAIN, 15));
        r2.setForeground(Color.decode("#AADFFF"));
        r1.setBounds(75,50,100,30);    
        r2.setBounds(75,150,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        jPanel3.add(r1);
        jPanel3.add(r2);
        bg.add(r1);
        bg.add(r2);
        jPanel3.setLayout(new GridLayout(1,3,0,0));
        
        //Implement On CLick Functionalities of All Buttons that have been created in the Application
        newBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            nicField.setText("");
            nameField.setText("");
            addField.setText("");
            phoneField.setText("");
            bg.clearSelection();
            
        }});
        
        srcBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            AddressInformation a=null;
            if(nicField.getText().isEmpty()&&nameField.getText().isEmpty()){
                JOptionPane.showMessageDialog(jFrame, "Kindly Enter CNIC or Name and then Press Search");
            }
            else{
                if(nameField.getText().isEmpty()){
                    a=addressDB.getInstance().searchAddressInfo(nicField.getText(),"");
                }
                else if(nicField.getText().isEmpty()){
                    a=addressDB.getInstance().searchAddressInfo("",nameField.getText());
                }
                if(a!=null){
                    nicField.setText(String.valueOf(a.getNic()));
                    nameField.setText(a.getName());
                    addField.setText(a.getAddress());
                    phoneField.setText(String.valueOf(a.getPhone()));
                    if(a.getGender()){
                        r2.setSelected(false);
                        r1.setSelected(true);
                    }
                    else{
                        r1.setSelected(false);
                        r2.setSelected(true);
                    }
                }
                else{
                   
                    JOptionPane.showMessageDialog(jFrame, "Error Finding Address Information!");
                    return;
                }
                
            }
        }});
        
        updBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            if(nicField.getText().isEmpty()){
                JOptionPane.showMessageDialog(jFrame, "To Update an Address Information, Kindly Enter the CNIC and Press Search\nOnce the information appears on screen, Edit the Values and Press Update");
            }
            else{
                AddressInformation a=addressDB.getInstance().searchAddressInfo(nicField.getText(),"");
                if(a!=null){
                    try{
                        AddressInformation updatedAddressInformation=new AddressInformation(nameField.getText(),addField.getText(),Long.parseLong(phoneField.getText()),r1.isSelected(),Long.parseLong(nicField.getText()));
                        boolean flag=addressDB.getInstance().updateAddressInfo(updatedAddressInformation);
                        if(flag){
                            
                            JOptionPane.showMessageDialog(jFrame, "Record Updated Successfully");
                        }
                        else{
                            
                            JOptionPane.showMessageDialog(jFrame, "Error! Record Could Not Be Updated");
                        }
                    }catch(NumberFormatException nfe){
                        
                        JOptionPane.showMessageDialog(jFrame, "Error! Invalid CNIC or Phone Number Entered");
                    }
                }
                else{
                    
                    JOptionPane.showMessageDialog(jFrame, "Error Finding Address Information!");
                    return;
                }
                
            }
        }});
        
        delBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            if(nicField.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(jFrame, "To Delete an Address Information, Kindly Enter the CNIC Number associated with that Address and then Press Delete");
            }
            else{
               try{
                    Long.parseLong(nicField.getText());
                    boolean flag=addressDB.getInstance().deleteAddress(nicField.getText());
                    if(flag){
                        JOptionPane.showMessageDialog(jFrame, "Address Associated with CNIC '"+nicField.getText()+"'"+" Deleted successfully!");
                    }
                     
                 }catch(NumberFormatException ne){
                     JOptionPane.showMessageDialog(jFrame, "Error! CNIC and Phone Number Fields Should Only Contain Numbers");
                     return;
                 } 
            }
                nicField.setText("");
                nameField.setText("");
                addField.setText("");
                phoneField.setText("");
                r1.setSelected(false);
                r2.setSelected(false);
        } });
        
        addBtn.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
                long num1=0, num2=0;
                 if(nicField.getText().isEmpty()||nameField.getText().isEmpty()||addField.getText().isEmpty()||phoneField.getText().isEmpty()){
                     
                     JOptionPane.showMessageDialog(jFrame, "Kindly Fill All Text Fields!");
                     return;
                 }
                 if(!r1.isSelected()&&!r2.isSelected()){
                     
                     JOptionPane.showMessageDialog(jFrame, "Kindly Select Your Gender");
                     return;
                 }
                 if(phoneField.getText().length()>15){
                     
                     JOptionPane.showMessageDialog(jFrame, "Invalid Phone Number Entered!");
                     return;
                 }
                 if(nicField.getText().length()>15){
                     
                     JOptionPane.showMessageDialog(jFrame, "Invalid CNIC Number Entered!");
                     return;
                 }
                 try{
                     num1=Long.parseLong(phoneField.getText());
                     num2=Long.parseLong(nicField.getText());
                 }catch(NumberFormatException ne){
                     
                     JOptionPane.showMessageDialog(jFrame, "Error! CNIC and Phone Number Fields Should Only Contain Numbers");
                     return;
                 }
                 
                AddressInformation a=new AddressInformation(nameField.getText(), addField.getText(), num1,r1.isSelected(),num2);
                boolean flag=addressDB.getInstance().insertAddress(a);
                if(flag){
                    System.out.println("Address Inserted!");
                    JOptionPane.showMessageDialog(jFrame, "Address Information Inserted Successfully!");
                }
                else{
                    JOptionPane.showMessageDialog(jFrame, "Error! Address Insertion Unsuccessful");
                }
            }  
        }); 
        
        jFrame.add(jPanel,BorderLayout.CENTER);
        jFrame.add(jPanel2,BorderLayout.PAGE_START);
        jFrame.add(jPanel3,BorderLayout.SOUTH);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Address Book");
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new Ap_Assign3();
    }
    
}
