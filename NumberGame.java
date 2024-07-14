
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        System.out.println(" Guess the number between 1 to 100");
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        while(i<=2){
            int num=sc.nextInt();
            int rightnum=26;
            if(num==rightnum)
            {
                System.out.println("You Guess The Correct Number :)");
                System.out.println("GAME ENDED :) ");
                break;

            }
            else if(num>=rightnum)
            {
                System.out.println("Your Number Is Greater Than Correct Guess Number ! ");
                System.out.println("TRY AGAIN ! \n Enter New Number Between 1 to 100 :");
            }
            else if(num<=rightnum)
            {
                System.out.println("Your Number Is Less Than Correct Guess Number !");
                System.out.println("TRY AGAIN ! \n Enter New Number Between 1 to 100 : ");
            }
            else 
            {
                System.out.println(" Please .. Enter Valid Number");
            }
            i++;
        }

    }
    
}
