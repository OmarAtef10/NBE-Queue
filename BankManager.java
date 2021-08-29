import java.util.ArrayList;

public class BankManager extends Client{

    ///////////////Attributes//////////////////
    /**
     * BankManager Class is the admin side of the application as it is responsible for registering his managed branches
     * to the DataBase Class
     * */
    private ArrayList<Branch>branches;
    ///////////////Constructors///////////////
    /**
     * Parameterized Constructor used to Create an object of the BankManager Class
     * @param name is the name of the manager
     * @param id is the id of the manager
     * @param pass is the Password of the Manager
     * @param Phone is the Phone number of the manager
     * */
    public BankManager(String name, String  id, String pass, String Phone) {
        super(name, id, pass, Phone);
        branches=new ArrayList<Branch>();
    }

    /////////////////////////Methods////////////////////
    /**
     * getBranches Method is the Method for returning the branches managed by the manager
     * the managed branches are stored in an array list
     * @return branches
     * */
    public ArrayList<Branch> getBranches() {
        return branches;
    }
    /**
     * setBranches Method is a function to set the branch to the current manager
     * @param branch is the branch that is managed by the current manager
     * */

    public void setBranches(Branch branch) {
        branches.add(branch);
    }

    /**
     * Display Method is the function that displays the branches that are managed by the current manager
     * */
    public void display(){
       // System.out.println("Name: "+getName()+"\nPhone: "+getPhone());
        System.out.println("********** Managed Branches are *************** ");
        for (int i = 0;i<branches.size();i++){
            System.out.println(branches.get(i).toString());
        }
    }

    /**
     * toString Overridden function that displays the data of the manager
     * */
    @Override
    public String toString(){
        String manData = "***************************\nManager Data\nName: "+getName()+"\nPhone: "+getPhone()+"\nManaged Branches: "+getBranches();

        return manData;
    }


}
