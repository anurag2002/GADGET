import mobile_class.mobile;
import mp3_class.mp3;
import java.util.*;

public class user 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n********************************************\n");
        System.out.print("Enter the Model of Gadget: ");
        String model = sc.nextLine();
        System.out.print("Enter the Size of Gadget: ");
        String size = sc.nextLine();
        System.out.print("Enter the Weight of Gadget: ");
        int weight = sc.nextInt();
        System.out.print("Enter the Price of Gadget: ");
        float price = sc.nextFloat();
        int ch = 0;

        while(ch != 3)
        {
            System.out.println("\n****************CHOOSE GADGET****************\n");
            System.out.println("1. Mobile");
            System.out.println("2. MP3");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                {
                    int chm = 0;
                    System.out.println("\n********************************************\n");
                    System.out.print("Enter the credits in mobile: ");
                    int credit = sc.nextInt();

                    mobile mob = new mobile(price, weight, model, size, credit);

                    while(chm != 4)
                    {

                        System.out.println("\n********************MENU********************\n");
                        System.out.println("1. Add Call Credits");
                        System.out.println("2. Make a Call");
                        System.out.println("3. Display the details of Mobile");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        chm = sc.nextInt();

                        switch(chm)
                        {
                            case 1:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.print("Enter the Call Credits to add: ");
                                int credit_all = sc.nextInt();
                                mob.add(credit_all);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.print("Enter the Phone No: ");
                                String phn_no = sc.next();
                                System.out.print("Enter the Duration of Call: ");
                                int dur = sc.nextInt();
                                mob.make_call(phn_no, dur);
                                break;
                            }

                            case 3:
                            {
                                mob.display();
                                break;
                            }

                            case 4:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.println("EXITING....");
                                break;
                            }

                            default:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.println("Wrong Input");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 2:
                {
                    int chm = 0;
                    System.out.println("\n********************************************\n");
                    System.out.print("Enter the memory in MP3: ");
                    int memory = sc.nextInt();

                    mp3 mp = new mp3(price, weight, model, size, memory);

                    while(chm != 4)
                    {

                        System.out.println("\n********************MENU********************\n");
                        System.out.println("1. Download Music");
                        System.out.println("2. Delete Music");
                        System.out.println("3. Display the details of MP3");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        chm = sc.nextInt();

                        switch(chm)
                        {
                            case 1:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.print("Enter the size of Music to download: ");
                                int memory_req = sc.nextInt();
                                mp.download_music(memory_req);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.print("Enter the size of Music to delete: ");
                                int memory_req = sc.nextInt();
                                mp.delete_music(memory_req);
                                break;
                            }

                            case 3:
                            {
                                mp.display();
                                break;
                            }

                            case 4:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.println("EXITING....");
                                break;
                            }

                            default:
                            {
                                System.out.println("\n********************************************\n");
                                System.out.println("Wrong Input");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 3:
                {
                    System.out.println("\n********************************************\n");
                    System.out.println("EXITING....");
                    System.out.println("\n********************************************\n");
                    break;
                }

                default:
                {
                    System.out.println("\n********************************************\n");
                    System.out.println("Wrong Input");
                    break;
                }
            }
        }
        sc.close();
    }
}