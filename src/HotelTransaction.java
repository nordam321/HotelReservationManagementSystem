import java.util.Scanner;

public class HotelTransaction{


    public HotelTransaction(){}

    Customer customer = new Customer();
    HotelManagement login = new HotelManagement();
    public void transactionMenu()
    {
        Scanner input = new Scanner(System.in);
        int hotelType;
        String hotelName;
        System.out.println("====================>City Select Main Menu<====================");
        System.out.println("\t1-istanbul");
        System.out.println("\t2-Ankara");
        System.out.println("\t3-antalya");
        System.out.println("\t4-Exit");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("chose the Hotel type: \n 1-3star Hotels(***) \n 2-4star Hotels(****) \n 3-5star Hotels(*****)");
                hotelType = input.nextInt();
                input.nextLine();
                customer.setHotelType(hotelType);
                if (hotelType == 1) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Amira \n 2-Niles \n 3-Golden City");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else if (hotelType == 2) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Titanic City \n 2-Peak \n 3-Grand Oztanik");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else {
                    System.out.println("chose the Hotel by typing its name : \n 1-Raffles \n 2-Ajwa \n 3-Grand Hyatt");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                }
                break;

            case 2:
                System.out.println("chose the Hotel type: \n 1-3star Hotels(***) \n 2-4star Hotels(****) \n 3-5star Hotels(*****)");
                hotelType = input.nextInt();
                input.nextLine();
                customer.setHotelType(hotelType);
                if (hotelType == 1) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Atalay \n 2-Latifoglu \n 3-New Park");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else if (hotelType == 2) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Demonti \n 2-Angora \n 3-Keykan");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else {
                    System.out.println("chose the Hotel by typing its name : \n 1-Hilton \n 2-Swissotel \n 3-The Ankara");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                }
                break;

            case 3:
                System.out.println("chose the Hotel type: \n 1-3star Hotels(***) \n 2-4star Hotels(****) \n 3-5star Hotels(*****)");
                hotelType = input.nextInt();
                input.nextLine();
                customer.setHotelType(hotelType);
                if (hotelType == 1) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Atalla \n 2-Tuvana \n 3-Benna");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else if (hotelType == 2) {
                    System.out.println("chose the Hotel by typing its name : \n 1-Akra \n 2-Lara World \n 3-Barut");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                } else {
                    System.out.println("chose the Hotel by typing its name : \n 1-Mardan \n 2-Voyage \n 3-Miracle");
                    hotelName = input.nextLine();
                    customer.setHotelName(hotelName);
                    RoomTypes();
                }
                break;
            default:
                break;
        }
    }
    public void RoomTypes() {

        Scanner scan = new Scanner(System.in);
        int option;
        int room;
        System.out.println("Welcome to  " + customer.getHotelName() + " hotel press");
        System.out.println("1-book a room");
        System.out.println("2-exit");
        option = scan.nextInt();
        scan.nextLine();
        if (option == 1) {
            if (customer.getHotelType() == 1) {
                System.out.println("1-Standard Room(40$)");
                System.out.println("2-Double Room(60$)");
                System.out.println("3-studio(80$)");
                room = scan.nextInt();
                customer.setRoomType(room);
                AskDays();
                customer.setRandomlyCustomerId();
                System.out.println("your id is : " + customer.getCustomerID());
                CalculateAmount();

            } else if (customer.getHotelType() == 2) {
                System.out.println("1-Standard Room(120$)");
                System.out.println("2-Junior Suite(60$)");
                System.out.println("3-Deluxe Room:(40$)");
                room = scan.nextInt();
                scan.nextLine();
                customer.setRoomType(room);
                AskDays();
                customer.setRandomlyCustomerId();
                System.out.println("your id is : " + customer.getCustomerID());
                CalculateAmount();
            } else {
                System.out.println("1-Luxury Room(200$)");
                System.out.println("2-Presidential Suite(150$)");
                System.out.println("3-Royal Suite:(300$)");
                room = scan.nextInt();
                scan.nextLine();
                customer.setRoomType(room);
                AskDays();
                customer.setRandomlyCustomerId();
                System.out.println("Your id: " + customer.getCustomerID());
                CalculateAmount();

            }
        }
        else {
            System.exit(0);
        }
    }
    public void CalculateAmount(){
        int amount = 0;
        switch (customer.getHotelType()){
            case 1:
                if (customer.getRoomType() == 1) {
                    amount = (customer.getDays() * 40);
                    customer.setAmount(amount);
                }
                else if (customer.getRoomType() == 2) {
                    amount = (customer.getDays() * 60);
                    customer.setAmount(amount);
                }
                else {
                    amount = customer.getDays() * 80;
                    customer.setAmount(amount);
                }
                break;
            case 2:
                if (customer.getRoomType() == 1) {
                    amount = customer.getDays() * 120;
                    customer.setAmount(amount);
                }
                else if (customer.getRoomType() == 2) {
                    amount = customer.getDays() * 60;
                    customer.setAmount(amount);
                }
                else {
                    amount = customer.getDays() * 40;
                    customer.setAmount(amount);
                }
                break;
            case 3:
                if (customer.getRoomType() == 1) {
                    amount = customer.getDays() * 200;
                    customer.setAmount(amount);
                }
                else if (customer.getRoomType() == 2) {
                    amount = customer.getDays() * 150;
                    customer.setAmount(amount);
                }
                else {
                    amount = customer.getDays() * 300;
                    customer.setAmount(amount);
                }
                break;
        }
        System.out.println("Your Bill: "+ customer.getAmount());
        login.RegisterToData(customer.getCustomerID(),customer.getHotelName(),
                             customer.getAmount(),customer.getDays());
    }
    public void AskDays()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("how many days :");
        int day = input.nextInt();
        customer.setDays(day);
        System.out.println("BOOKED SUCCESSFUL.\nYour Booked for : "+customer.getDays() + " Day(s)");
    }


}
