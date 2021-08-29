public class Branch {

    //////////////////Attributes///////////////
    /**
     * Branch class is the class responsible for the data of the branch
     * */

    protected String branchName;
    protected String branchId;
    protected String branchPhone;
    protected int workHours;
    public String [] hours=new String[8];
    private BankManager manager;
    //////////////////Constructors/////////////////////

    /**
     * Constructor used to create a Branch object
     * @param name is the name of the branch
     * @param id is the id of the branch
     * @param Hours is the working hours of the branch
     * @param phone is the phone number of the branch
     */

    public Branch(String name, String id , String phone, int Hours){
        this.branchName=name;
        this.branchId=id;
        this.branchPhone=phone;
        if (Hours>8){
            System.out.println("Can't Do that, we put 3 hours as our default");
            Hours=3;
            workHours=Hours;
        }
        else{
            this.workHours=Hours;
        }
        this.manager=manager;
        hours[0]="08:00";
        hours[1]="09:00";
        hours[2]="10:00";
        hours[3]="11:00";
        hours[4]="12:00";
        hours[5]="13:00";
        hours[6]="14:00";
        hours[7]="15:00";
    }

    /////////////////////Methods////////////////////
    /**
     * getBranchName Method is a function used in returning the name of the branch
     * @return branchName
     * */
    public String getBranchName() {
        return branchName;
    }

    /**
     * setBranchName Method is a function used in setting the name of the branch
     * */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    /**
     * getBranchId is a function used in returning the id of the branch
     * @return branchId
     * */
    public String getBranchId() {
        return branchId;
    }
    /**
     * setBranchId Method is the function used in setting the id of the branch
     * @param branchId is the id of the branch
     * */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
    /**
     * getWorkHours Method is the function used to return the working hours that are set by the manager
     * @return workHours
     * */
    public int getWorkHours() {
        return workHours;
    }
    /**
     * setWorkHours Method is the function used in setting the work hours of the branch that are provided by the manager
     * @param workHours hours provided by the manager
     * */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /**
     * getBranchPhone Method is the function used in returning the Phone number of the branch
     * @return branchPhone
     * */
    public String getBranchPhone() {
        return branchPhone;
    }
    /**
     * setBranchPhone Method is function used in setting phone number of the branch
     * @param branchPhone is the phone number of the branch
     * */
    public void setBranchPhone(String branchPhone) {
        this.branchPhone = branchPhone;
    }
    /**
     * getHours Method is a function used to return working hours of the branch
     * @return hours (A string array that contains the working hours of the branch that are set by it's manager)
     * */
    public String[] getHours() {
        return hours;
    }
    /**
     * setHours Method is a function used in setting the working hours of the branch by the manager
     * @param hours string array containing the working hours of the branch
     * */
    public void setHours(String[] hours) {
        this.hours = hours;
    }
    /**
     * getManager Method is function used to return the manager of his manged branch
     * @return manager
     * */
    public BankManager getManager() {
        return manager;
    }
    /**
     * setManager Method is a function used to set the manager of the branch
     * @param manager an object of BankManager class who acts as an admin in the system
     * */
    public void setManager(BankManager manager) {
        this.manager = manager;
    }


    /**
     * toString an Overridden Method used to display the information of the branch
     * @return info (the information of the branch)
     * */
    @Override
    public String toString(){
        String work="";
        for (int i = 0 ; i<workHours;i++){
            work+=hours[i]+" ";
        }
        String info = "Branch Name: "+branchName+"\nPhone Number "+branchPhone+"\nWorking Hours (in 24 hr format): "+ work+"\n***************************************";
        return info;
    }

}
