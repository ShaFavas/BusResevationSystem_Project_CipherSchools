package bus;

import java.util.ArrayList;
import java.util.List;

public class SignupLogin {

    //This list contains all the user details

    List<User> userList = new ArrayList<>();

    //Collecting informations for the SignUp form

    public String signup(String name, long phone, String email, String street, String city, String state, String password){
        for ( User user : userList){
            if(user.getContact().getEmail().equals(email)){
                return "Signup unsuccessfull...Email already exists.";
            }
        }

        Contact contact = new Contact(name,phone,email);
        Address address = new Address(street,city,state);
        User user = new User(contact,address,password);
        userList.add(user);
        return "Signup successfull";

    }

    //Collecting informations for the Login form

    public String login(String email, String password){

        for (User user : userList) {
            if (!email.equals(user.getContact().getEmail())) {
                return "user email incorrect";
            }
            if (!password.equals(user.getPassword())) {
                return "password incorrect";
            }
            return "Login successfull";
        }
        return " ";
    }
    public String changePassword(String em, String pass){
        for (User user : userList){
            if (em.equals(user.getContact().getEmail())){
                user.setPassword(pass);
                return "Password changed successfully";
            }
        }
        return " ";
    }

}
