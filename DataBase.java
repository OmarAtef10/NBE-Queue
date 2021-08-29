import java.util.ArrayList;

public class DataBase {
    /////////////////////Attributes/////////////////////
    /**
     * DataBase Class is the most important class in the system as it is the one responsible for
     * making all the reservations
     * storing the data of th Clients,Managers and Branches
     * it acts as a storage class for the system
     * */
    private ArrayList<Client>clientData;
    private ArrayList<BankManager>managerData;
    private ArrayList<Branch>branchData;
    ///////////////////////Constructors//////////////////
    /**
     * Default constructor used to initialize the ArrayLists that stores all the important data
     * */
    public DataBase(){
        clientData=new ArrayList<Client>();
        managerData=new ArrayList<BankManager>();
        branchData=new ArrayList<Branch>();
    }
    /**
     * getClientData Method  is the Method used to return the Clients ArrayList
     * @return clientData
     * */
    public ArrayList<Client> getClientData() {
        return clientData;
    }

    /**
     *setClientData Method is used to store the provided data in the ArrayList (list of objects)
     * @param clientData object that will be stored
     * */
    public void setClientData(ArrayList<Client> clientData) {
        this.clientData = clientData;
    }
    /**
     * getManagerData Method is used to return the Managers ArrayList
     * @return managerData
     * */
    public ArrayList<BankManager> getManagerData() {
        return managerData;
    }
    /**
     *setMangerData Method is used to store the provided data in the ArrayList (list of objects)
     * @param managerData object that will be stored
     * */
    public void setManagerData(ArrayList<BankManager> managerData) {
        this.managerData = managerData;
    }

    /**
     * getBranchData Method is used to return the Branches ArrayList
     * @return branchData
     * */
    public ArrayList<Branch> getBranchData() {
        return branchData;
    }
    /**
     *setBranchData Method is used to store the provided data in the ArrayList (list of objects)
     * @param branchData object that will be stored
     * */
    public void setBranchData(ArrayList<Branch> branchData) {
        this.branchData = branchData;
    }
    /**
     * clientReg Method is the function used to validate and add new clients to the clients ArrayList
     * @param name name of client
     * @param id ID of the client
     * @param phone phone number of the client
     * @param pass password of the client
     * @return client the newly created client object
     * */
    public Client clientReg(String name, String id, String pass,  String phone){
        Client client = new Client(name , id , pass,phone);
        clientData.add(client);
        return client;

    }

    /**
     * clientValidation Method is the Method used to validate that the client exists in order to log in
     * @param name user name of the client
     * @param password password of the client
     * @return client returning the client object if exists
     * @return null if object doesn't exist
     * */
    public Client clientValidation(String name, String password){
       for (final Client client : clientData){
           if(client.getName().equals(name) && client.getPassword().equals(password)){
               return client;
           }
       }
       return null;
    }

    /**
     * registerManager Method is used to add manager to it's arrayList
     * @param name is the name of the manager
     * @param id is the ID of the manager
     * @param pass is the Password of the manager
     * @param Phone is the Phone number of the manager
     * @return manager object is all the information is valid
     * @return null if the data is not sufficient
     * */
    public BankManager registerManager(String name, String id, String pass, String Phone){
        BankManager manager = new BankManager(name , id , pass,pass);
        managerData.add(manager);
        return manager;
    }

    /**
     * managerValidation Method is used to validate the provided data that it is found in the ArrayList
     * @param name name of the manager
     * @param password password of the manager
     * @return manager the object that contains the provided data
     * @return null if the provided data is not right
     * */
    public BankManager managerValidation(String name, String password){
        if (managerData.size()==0){
            System.out.println("no data available");
        }
        for (final BankManager manager : managerData){
            if(manager.getName().equals(name) && manager.getPassword().equals(password)){
                return manager;
            }
        }
        return null;
    }

    /**
     * registerBranch Method used to add branch to the Branches ArrayList
     * @param name which is the Branch Name
     * @param id is the ID of the branch
     * @param phone is the phone number of the branch
     * @param manager is the manager of the branch
     * @param Hours the working hours of the branch
     * @return branch the newly created branch object
     * */
    public Branch registerBranch(BankManager manager,String name, String id , String phone, int Hours){
        Branch branch = new Branch(name, id, phone, Hours);
        manager.setBranches(branch);
        branch.setManager(manager);
        branchData.add(branch);
        return branch;
    }
    /**
     * displayBanks Method is function used to print out all the available branches in the DataBase
     * */
    public void  displayBanks(){
        if (branchData.size()==0){
            System.out.println("No Branches Available Yet...");

        }
        else {
            System.out.println("**Available Branches**");
            for (int i =0 ; i<branchData.size();i++){
                System.out.println("Branch number: "+i+1);
                System.out.println(branchData.get(i).toString());
            }
        }
    }
    /**
     * managerSize Method
     * @return managerData.size() returns the size of the Arraylist
     * */
    public int managerSize(){return managerData.size();}
    /**
     * ClientSize Method
     * @return clientData.size() returns the size of the Arraylist
     * */
    public int ClientSize(){return clientData.size();}
    /**
     * branchSize Method
     * @return branchData.size() returns the size of the Arraylist
     * */
    public int branchSize(){return branchData.size();}

    /**
     * getBranch Method used to return the chosen branch
     * @return branchData.get(i-1) returns the chosen branch
     * */
    public Branch getBranch(int i){
        return branchData.get(i-1);
    }

}
