public class Client {

    /////////////////Attributes///////////////////

    /**
     * This Class is About the Client side of the Program where he can create an account in order to Book an place in the queue
     * without having to go to a branch
     * */
    private String name;
    private String Id;
    private String password;
    private String phone;
    private Branch booking;
    //private String card;

    //////////////////Constructors//////////////////////
    /**
    * Parameterized constructor used to create the client object
     * @param name  is the user name of the client
     * @param id is the id of the client on the system
     * @param pass is the Client's password in order to log in again in the system
     * @param Phone is the phone number of the client
    * */
    public Client(String name, String id, String pass, String Phone){
        this.name=name;
        this.Id=id;
        this.password=pass;
        this.phone=Phone;
        booking=null;
    }

    ////////////////////Methods////////////////////
    /***
     *getName Method returns the name of the client
     * @return name
     */

    public String getName() {
        return name;
    }
    /**
     * setName Method sets the name for the client
     * @param name is the name of the client
     * */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getId Method is used to return the id of the client
     * @return Id
     * */
    public String getId() {
        return Id;
    }
    /**
     * setId sets the id of the client
     * @param id is the Id of the client
     * */
    public void setId(String id) {
        Id = id;
    }
    /**
     * get password Method returns the password of the Client
     * @return password
     * */
    public String getPassword() {
        return password;
    }
    /**
     * setPassword Method sets password of the client
     * */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * getPhone Method returns the Phone number of the client
     * @return phone
     * */
    public String getPhone() {
        return phone;
    }
    /**
     * setPhone Method sets the Phone number of the client
     * @param phone is the phone number of the client
     * */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * toString Method an Overridden method
     * @return  clientData
     * */
    @Override
    public String toString(){
        String clientData = "***************************\nClient Data are\nName: "+name+"\nId: "+Id+"\nPhone: "+phone+"\n";
        return clientData;
    }
    /**
     * getBooking returns the branch that you have a booking at (an instance of Branch object)
     * @return booking
     * */
    public Branch getBooking() {
        return booking;
    }
    /**
     * setBooking Method sets booking of the desired branch
     * @param booking is the booked branch
     * */
    public void setBooking(Branch booking) {
        this.booking = booking;
    }

    /**
     * displayBookings Method Displays the current bookings of the client
     * */
    public void displayBookings(){
        if(booking!=null) {
            System.out.println("Bookings Details: ");
            System.out.println(booking.toString());
        }else{
            System.out.println("No bookings available!");
        }
    }
}
