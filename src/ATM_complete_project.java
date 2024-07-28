import java.util.*;
public class ATM_complete_project {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner in = new Scanner(System.in);
        //we have take an input by an user
        System.out.println("Enter Your pin number");
        int password = in.nextInt();
        if (pin == password) {
          System.out.println("Enter Your Name");
          name =in.next();
          System.out.println("Welcome " + name);
          while(true){
              System.out.println("press 1 to check Balance");
              System.out.println("Press 2 to add amount");
              System.out.println("Press 3 to take amount");
              System.out.println("Press 4 to take Resipt");
              System.out.println("Press 5 to Exit");
             int opt=in.nextInt();
             switch (opt) {
                 case 1:
                     System.out.println("Your Current balance is" + balance);
                     break;
                 case 2:
                     System.out.println("How  uch Amount did You want To Add Your Account ");
                     AddAmount = in.nextInt();
                     System.out.println("Successfully credited");
                     balance += AddAmount;
                     break;
                 case 3:
                     System.out.println("How much amount did you want to take");
                     TakeAmount = in.nextInt();
                     if (TakeAmount > balance) {
                         System.out.println("Your Balence is insufficient");
                         System.out.println("Try less then your available balance");
                     } else {
                         System.out.println("successfully taken");
                         balance = balance - TakeAmount;
                     }
                     break;
                 case 4:
                     System.out.println("Welcome to All in One mini ATM");
                     System.out.println("Available balance is" + balance);
                     System.out.println("Amount deposited" + AddAmount);
                     System.out.println("Amount taken " + TakeAmount);
                     System.out.println("Thank for Coming");
                     break;
                default:
                     System.out.println("press the number below 5");


                    break;
             }
             if(opt==5)
             {
               System.out.println("ThankYou");
               break;
             }
          }
          }
        else {
             System.out.println("Invalid Pin Number");
        }


        }
    }

