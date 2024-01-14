import java.util.Random;

class Customer {

    private String customerID;
    private String hotelName;
    private int hotelType;

    private int roomType;

    private int amount;
    private int days;

    public Customer(){}
    public Customer(String customerId) {
    }
    public Customer(String customerID, String hotelName, int days, int amount) {
        this.customerID = customerID;
        this.hotelName = hotelName;
        this.days = days;
        this.amount = amount;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public String toString() {
        return customerID + "," + hotelName + "," + days + "," + amount;
    }

    public int getHotelType() {
        return hotelType;
    }

    public void setHotelType(int hotelType) {
        this.hotelType = hotelType;
    }
    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setRandomlyCustomerId() {
        int low = 100000;
        int hight = 200000;
        Random rand = new Random();
        int customer = rand.nextInt(hight - low) + low;

        setCustomerID(String.valueOf(customer));
    }
}