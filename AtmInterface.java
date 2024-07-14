// PROGRAM TO ATM INTERFACE--->>>>>

import java.util.Scanner;
public class AtmInterface {

    public static void main(String[] args) {
        System.out.println("Please Enter Your Name : ");
        // USER INPUT:->>
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello"+" "+  name);
        String message = " WELCOME Sir/Mam ..... \n How may i help you\n Please Select Any Of Them Option : \n  TYPE 1)-->>ENTER 1 FOR CHECK BALANCE  \n  TYPE 2)-->>ENTER 2 FOR DEPOSITE  \n  TYPE 3)-->> ENTER 3 FOR WITHDRAWL ";
        System.out.println(message);

        System.out.println("Please Enter Your Option : ");
        int task = sc.nextInt();
        int available_amount = 5000;

        if (task >= 1 && task <= 3) {
            System.out.println("Welcome To The Vertual Bank ! ");
            // FOR CHECK AVAIALABLE AMOUNT 
            if (task == 1) 
            {
                System.out.println("Your Available Amount is : " + available_amount+"Rs");
            } 
            // FOR DEPOSITE THE AMOUNT 
            else if (task == 2) 
            {
                System.out.println("Please Enter Your Deposit Amount : ");
                double deposit_amount = sc.nextDouble();
                if (deposit_amount >= 500) 
                {
                    available_amount += deposit_amount;
                    System.out.println("You have successfully deposit amount : ");
                    System.out.println("Your Toatl Available Amount is :" +" "+ available_amount+"Rs");
                } 
                else
                {
                    System.out.println("Your Minimum Deposit Amount Should be 500 Rs. : ");
                }
            } 
            // FOR WITHDRAWAL THE AMOUNT 
            else
            {
                System.out.println("Please Enter Amount To Withdrawal : ");
                double Withdrawal_amount = sc.nextDouble();
                if (Withdrawal_amount > 5000) 
                {
                    System.out.println("Please Enter Amount less than 5000");
                } 
                else 
                {
                    available_amount -= Withdrawal_amount;
                    System.out.println("You Have Successfully Withdrawal Your Amount : ");
                    System.out.println("Your Available Amount is : "+ " " + available_amount +"Rs");
                }
            }
        }
        else 
        {

            System.out.println("Please Enter Valid Option : ");

        }

    }
}
