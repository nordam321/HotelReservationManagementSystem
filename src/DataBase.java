import java.io.*;

public class DataBase {

    public static boolean addCustomer(Customer customer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\damla\\JavaProjects\\oop_final_project\\src\\customers.txt", true))) {
            writer.write(customer.toString() + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public  boolean getCustomer(String customerID) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\damla\\JavaProjects\\oop_final_project\\src\\customers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                String customerId = parts[0];
//                if (customerId.equals(customerID)) {
//                    return new Customer(customerId);
//                }
                if(line.contains(customerID)){
                    System.out.println(line);
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Customer not found
    }
}
