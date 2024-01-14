import java.util.Scanner;

public class HotelManagement {
    DataBase dataBase = new DataBase();
    public void ShowMainMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("===================>Welcome to the Hotel Management System<===================");
        System.out.println("\t1-Book a Room: ");
        System.out.println("\t2-Reservation Information: ");
        System.out.println("\t3-Exit: ");

        int choice = input.nextInt();
        HotelTransaction transaction = new HotelTransaction();

        switch (choice) {
            case 1:
                transaction.transactionMenu();
                break;

            case 2:
                checkCustomerReservation();
                break;

            default:
                break;
        }
    }
    public void checkCustomerReservation()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your customer ID:");
        String customerID = input.nextLine();
            if (dataBase.getCustomer(customerID)) {
                System.out.println("Id,HotelName,Bill($),Days");
                System.out.println("Your booking information !");
            }
         else {
            System.out.println("Invalid login credentials.");
        }
    }
    public void RegisterToData(String customerId, String hotelName , int amount , int days)
    {
        Customer customer = new Customer(customerId,hotelName,amount,days);
        if (DataBase.addCustomer(customer)) {
            System.out.println("Registration Done successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }
}