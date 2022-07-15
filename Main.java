package bus;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Press 1 for Signup" +
                "\nPress 2 for Login" +
                "\nPress 3 for Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        SignupLogin signupLogin = new SignupLogin();
        BusOperations busOperations = new BusOperations();
        busOperations.addBus("KL10AA0001", "Kerala", "Kasarkod", "Trivandrum", 1000,5);
        busOperations.addBus("TN09AB0002", "TamilNadu", "Coimbatore", "Chennai", 1500,3);
        busOperations.addBus("KA11AC0003", "Karnataka", "Mysore", "Bangalore", 1300,1);
        busOperations.addBus("HY08AA0004", "Hyderabad", "Telengana", "Vishakpatnam", 900,2);
        busOperations.addBus("KL10AB0001", "Kairalees", "Kasarkod", "Trivandrum", 900,4);
        busOperations.addBus("KL11AB0001", "Kerala", "Kasarkod", "Trivandrum", 1100,3);

        while (choice != 3) {
            if (choice == 1) {
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter Phone number");
                int number = scanner.nextInt();
                System.out.println("Enter Email");
                String email = scanner.next();
                System.out.println("Enter Street");
                String street = scanner.next();
                System.out.println("Enter City");
                String city = scanner.next();
                System.out.println("Enter State");
                String state = scanner.next();
                System.out.println("Enter Password");
                String password = scanner.next();
                System.out.println(signupLogin.signup(name, number, email, street, city, state, password));
                System.out.println("Press 1 for  Signup" +
                        "\nPress 2 for Login" +
                        "\nPress 3 for Exit");


                choice = scanner.nextInt();
            }
            if (choice == 2) {
                System.out.println("Enter Email");
                String email = scanner.next();

                System.out.println("Enter Password");
                String password = scanner.next();

                String Log = signupLogin.login(email, password);
                System.out.println(Log);

                if (Log == "Login succesfull") {
                    System.out.println("Press 4 to check bus" +
                            "\nPress 5 to change password" +
                            "\nPress 6 to go back");
                    int busDetail = scanner.nextInt();
                    while (busDetail != 6) {

                        if (busDetail == 4) {
                            System.out.println("Enter source");
                            String source = scanner.next();
                            System.out.println("Enter destination");
                            String destination = scanner.next();
                            List result = BusOperations.searchBus(source, destination);
                            System.out.println(result);
                            if(!result.isEmpty()) {
                                System.out.println("press \'b\' for booking and \'a\' to go back");
                                String book = scanner.next();
                                if (book.equals("b")) {
                                    Scanner scanner1 = new Scanner(System.in);
                                    System.out.println("Enter Operators name which you want to book");
                                    String operator = scanner1.nextLine();
                                    BusOperations.busBooking(operator);
                                }
                            }
                        }
                        if (busDetail == 5) {
                            System.out.println("Enter new password");
                            String pass = scanner.next();
                            System.out.println(signupLogin.changePassword(email, pass));
                        }
                        System.out.println("Press 4 to check bus" +
                                "\nPress 5 to change password" +
                                "\nPress 6 to go back");
                        busDetail = scanner.nextInt();

                    }

                }
                System.out.println("Press 1 for Signup" +
                        "\nPress 2 for Login" +
                        "\nPress 3 for Exit");
                choice = scanner.nextInt();
            }
        }
    }
}
