import java.util.Scanner;
/**
 *
 * TO-DO:- operations and w shof lazm tegy el far3 wala la2
 */

public class main {
    public static void main(String[] arg){
        int ticket = 0,confirm=0;
        int flag = 0;
        int op=0;
        int min=0;
        int max = 200;
        DataBase sys_ver = new DataBase();
        Scanner input = new Scanner(System.in);
        systemMenu();
        int choice = input.nextInt();
        while (choice!=5) {
            int sub_choice;
            String username;
            String password;

            String name;
            String ID;
            String reg_password;
            String phone;
          //  String location;

            switch (choice) {
                case 1:
                    if(sys_ver.ClientSize()==0){
                        System.out.println("No Clients are registered in the system!");
                    }else{
                        System.out.println("Please enter username and password: ");
                        username = input.next();
                        password = input.next();
                        Client client = sys_ver.clientValidation(username,password);
                        System.out.println("\n1- Display available Branches\n2- Book a place in a branch\n3- View bookings\n4- Exit");
                        sub_choice= input.nextInt();
                        while (sub_choice!=4) {
                            switch (sub_choice){
                                case 1:
                                    sys_ver.displayBanks();
                                    break;
                                case 2:
                                    if (sys_ver.branchSize()==0){
                                        System.out.println("no Branches Available yet");
                                        break;
                                    }
                                    else{
                                    sys_ver.displayBanks();
                                    System.out.println("Input branch number between 1 and "+ sys_ver.branchSize()+ " : ");
                                    int playgroundNum = input.nextInt();
                                    if(playgroundNum > sys_ver.branchSize() || playgroundNum<=0){
                                        System.out.println("Invalid choice Branch number is out of range");
                                        break;
                                    }
                                    else{
                                        System.out.println("how can we help you?\n1- You can open an Account\n2- Get a CheckBook\n3-Depositing debit\n4- Get Investment Certificate\n5-Registering Phone chas or el-Ahly net");
                                        op=input.nextInt();
                                        switch (op){
                                            case 1:
                                                client.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Customer Service when you arrive at Branch");
                                                flag=1;
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                break;
                                            case 2:
                                                client.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Teller Window when you arrive at Branch");
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                flag=2;
                                                break;
                                            case 3:
                                                client.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Customer Service when you arrive at Branch");
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                flag=3;
                                                break;
                                            case 4:
                                                System.out.println("you can do that by visiting our website www.nbe.com");
                                                confirm=0;
                                                flag=4;
                                                break;
                                            case 5:
                                                System.out.println("you can do that by visiting our website www.nbe.com");
                                                confirm=0;
                                                flag=5;
                                                break;
                                        }
                                    }
                                    }
                                    break;
                                case 3:
                                    if(client.getBooking()==null){
                                        System.out.println("No Reservations were made!");
                                        if (flag==4){
                                            System.out.println("Getting an Investment Certificate can be done on our website at\nwww.nbe.com");
                                        } else if (flag==5){
                                            System.out.println("Registering in Phone Cash or el-Ahly net can be done on our website\nwww.nbe.com ");
                                        }

                                    }else {
                                        //player1.displayBookings();
                                        //System.out.println("ticket number is "+confirm);
                                        if (flag == 1) {
                                            client.displayBookings();
                                            System.out.println("ticket number is " + confirm + " Please go to Customer Service window");
                                        } else if (flag == 2) {
                                            client.displayBookings();
                                            System.out.println("ticket number is " + confirm + " Please go to Teller service window");
                                        }else if (flag==3){
                                            client.displayBookings();
                                            System.out.println("ticket number is " + confirm + " Please go to Customer Service window");
                                        } else if (flag == 4) {
                                            System.out.println("Getting an Investment Certificate can be done on our website at\nwww.nbe.com");
                                        }
                                        else if (flag==5){
                                            System.out.println("Registering in Phone Cash or el-Ahly net can be done on our website\nwww.nbe.com ");
                                        }
                                    }
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            System.out.println("\n1- Display available Branches\n2- Book place in a Branch\n3- View bookings\n4- Exit");
                            sub_choice= input.nextInt();
                        }
                    }
                    break;
                case 2:
                    if(sys_ver.managerSize()==0){
                        System.out.println("No Managers are registered in the system!");
                    }else {
                        System.out.println("Please enter username and password: ");
                        username = input.next();
                        password = input.next();
                        BankManager playgroundOwner = sys_ver.managerValidation(username, password);
                        if(playgroundOwner==null){
                            System.out.println("null error");
                        }
                        else{
                        System.out.println("\n1- Register a Branch\n2- View my Managed Branches\n3- Exit");
                        sub_choice = input.nextInt();
                        while (sub_choice != 3) {
                            String branch_name;
                            String branchID;
                            String BBphone;
                            int playgroundSize;
                            int validTimes;
                           // double price;
                            switch (sub_choice) {
                                case 1:
                                    System.out.println("Please enter Branch name, Branch ID, Phone, valid time slots, respectively: ");
                                    branch_name = input.next();
                                    branchID = input.next();
                                    BBphone=input.next();
                                    //playgroundSize = input.nextInt();
                                    validTimes = input.nextInt();
                                    //price = input.nextDouble();
                                    sys_ver.registerBranch(playgroundOwner,branch_name,branchID,BBphone,validTimes);
                                    break;
                                case 2:
                                    int playgrounds_count = playgroundOwner.getBranches().size();
                                    if(playgrounds_count==0){
                                        System.out.println("You have not registered any Branches yet");
                                    }else {
                                        playgroundOwner.display();
                                    }
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            System.out.println("\n1- Register a Branch\n2- View my Managed Branches\n3- Exit");
                            sub_choice = input.nextInt();
                        }

                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter your name, Password, ID, phone Respectively  ");
                    name = input.next();
                    ID = input.next();
                    reg_password = input.next();
                    phone = input.next();
                    //location = input.next();
                    Client player1 = sys_ver.clientReg(name,ID,reg_password,phone);
                    System.out.println("\n1- Display available Branches\n2- Book Place in a Branch\n3- View Reservations\n4- Exit");
                    sub_choice= input.nextInt();
                    while (sub_choice!=4) {
                        switch (sub_choice){
                            case 1:
                                sys_ver.displayBanks();
                                break;
                            case 2:
                                if (sys_ver.branchSize()==0){
                                    System.out.println("no Branches Available yet");
                                    break;
                                }
                                else{
                                    sys_ver.displayBanks();
                                    System.out.println("Input branch number between 1 and "+ sys_ver.branchSize()+ " : ");
                                    int playgroundNum = input.nextInt();
                                    if(playgroundNum > sys_ver.branchSize() || playgroundNum<=0){
                                        System.out.println("Invalid choice Branch number is out of range");
                                        break;
                                    }
                                    else{
                                        System.out.println("how can we help you?\n1- You can open an Account\n2- Get a CheckBook\n3-Depositing debit\n4- Get Investment Certificate\n5-Registering Phone chas or el-Ahly net");
                                        op=input.nextInt();
                                        switch (op){
                                            case 1:
                                                player1.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Customer Service when you arrive at Branch");
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                flag=1;
                                                break;
                                            case 2:
                                                player1.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Teller Window when you arrive at Branch");
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                flag=2;
                                                break;
                                            case 3:
                                                player1.setBooking(sys_ver.getBranch(playgroundNum));
                                                ticket= (int) (Math.random()*(max-min+1)+min);
                                                confirm=ticket;
                                                System.out.println("Reservation made ticket number is "+confirm+" Please go directly to Customer Service when you arrive at Branch");
                                                System.out.println(sys_ver.getBranch(playgroundNum));
                                                flag=3;
                                                break;
                                            case 4:
                                                System.out.println("you can do that by visiting our website www.nbe.com");
                                                confirm=0;
                                                flag=4;
                                                break;
                                            case 5:
                                                System.out.println("you can do that by visiting our website www.nbe.com");
                                                confirm=0;
                                                flag=5;
                                                break;
                                            default:
                                                System.out.println("Invalid Choice");
                                                break;
                                        }
                                    }

                                }
                                break;
                            case 3:
                                if (player1.getBooking()==null){
                                    System.out.println("No Reservations were Made");
                                    if (flag==4){
                                        System.out.println("Getting an Investment Certificate can be done on our website at\nwww.nbe.com");
                                    } else if (flag==5){
                                        System.out.println("Registering in Phone Cash or el-Ahly net can be done on our website\nwww.nbe.com ");
                                    }
                                    else{
                                        break;
                                    }
                                }
                                //player1.displayBookings();
                                //System.out.println("ticket number is "+confirm);
                                else {
                                    if (flag == 1) {
                                        player1.displayBookings();
                                        System.out.println("ticket number is " + confirm + " Please go to Customer Service window");
                                    } else if (flag == 2) {
                                        player1.displayBookings();
                                        System.out.println("ticket number is " + confirm + " Please go to Teller service window");
                                    }else if (flag==3){
                                      player1.displayBookings();
                                        System.out.println("ticket number is " + confirm + " Please go to Customer Service window");
                                    } else if (flag == 4) {
                                        System.out.println("Getting an Investment Certificate can be done on our website at\nwww.nbe.com");
                                    }
                                    else if (flag==5){
                                        System.out.println("Registering in Phone Cash or el-Ahly net can be done on our website\nwww.nbe.com ");
                                    }
                                }

                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        System.out.println("\n1- Display available Branches\n2- Book place in a Branch\n3- View bookings\n4- Exit");
                        sub_choice= input.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("Please enter your name, ID, password, phone respectively: ");
                    name = input.next();
                    ID = input.next();
                    reg_password = input.next();
                    phone = input.next();
                    //location = input.next();
                    BankManager playgroundOwner1 = sys_ver.registerManager(name,ID,reg_password,phone);
                    System.out.println("\n1- Register a Branch\n2- View my Managed Branches\n3- Exit");
                    sub_choice= input.nextInt();
                    while (sub_choice!=3) {
                        String branchName;
                        String branchID;
                        //int playgroundSize;
                        int validTimes;
                        double price;
                        switch (sub_choice) {
                            case 1:
                                System.out.println("Please enter Branch name, Branch ID, Phone, valid time slots, respectively: ");
                                branchName=input.next();
                                branchID=input.next();
                                String Bphone = input.next();
                              //  playgroundSize=input.nextInt();
                                validTimes= input.nextInt();
                                //price= input.nextDouble();
                                sys_ver.registerBranch(playgroundOwner1,branchName,branchID,Bphone,validTimes);
                                break;
                            case 2:
                                int playgrounds_count = playgroundOwner1.getBranches().size();
                                if(playgrounds_count==0){
                                    System.out.println("You have not registered any Branches yet");
                                }else {
                                    playgroundOwner1.display();
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        System.out.println("\n1- Register a Branch\n2- View my Branches\n3- Exit");
                        sub_choice=input.nextInt();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            systemMenu();
            choice = input.nextInt();
        }
    }
    public static void systemMenu(){
        System.out.println("*************Welcome to NBE Bank*************\n");
        System.out.println("1- Login as Client\n2- Login as Manager\n3- Register as Client\n4- Register as Manager\n5- Exit\n");
    }

}
