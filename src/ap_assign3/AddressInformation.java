//Mohammad Zohaib Abbas, 17L-6305, 8A, l175305@lhr.nu.edu.pk
//This code contains Class AddressInformation

package ap_assign3;

/**
 *
 * @author mzohaib
 */
public class AddressInformation {
    private String name;
    private long phone;
    private boolean gender;
    private String address;
    private long nic;

    public AddressInformation(String n, String a, long p, Boolean g, long cnic){
        name=n;
        address=a;
        phone=p;
        gender=g;
        nic=cnic;
    }
    public void setName(String n){
        name=n;
    }
    public void setNic(long n){
        nic=n;
    }
    public void setAddress(String a){
        address=a;
    }
    public void setPhone(Long p){
        phone=p;
    }
    public void setGender(boolean g){
        gender=g;
    }
    public String getName(){
        return name;
    }
    public long getNic(){
        return nic;
    }
    public long getPhone(){
        return phone;
    }
    public Boolean getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
}
