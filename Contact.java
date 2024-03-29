package bus;

public class Contact {

    private String name;
    private long phone;
    private String email;

    public Contact(){

    }

    //constructor

    public Contact(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
