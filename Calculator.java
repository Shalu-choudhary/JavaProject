import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in) ;
    System.out.println("Hello! Enter total no. of Subject : ");
    int sub_no=sc.nextInt();
    int sum=0;
    int Total_marks=0;
    int max_marks=sub_no;
    int i;
    for( i=1;i<=sub_no;i++){
        System.out.println("Enter Marks Obtained in Subject"+i+" : ");
        int marks=sc.nextInt();
         Total_marks+=marks;
    }
    
    System.out.println("Your Total Marks is : "+Total_marks);
    int avg_percentage=(Total_marks/max_marks);
    System.out.println("Your Percentage is : "+ avg_percentage+" %");

    if(avg_percentage>=85 && avg_percentage<=100)
    {
        System.out.println("Your Grade is : A");
    }
    
    else if(avg_percentage>=70 && avg_percentage<=85)
    {
        System.out.println("Your Grade is : B");
    }

    else if(avg_percentage>=55 && avg_percentage<=70)
    {
        System.out.println("Your Grade is : C");
    }

    else if(avg_percentage>=37 && avg_percentage<=50)
    {
        System.out.println("Your Grade is : D");
    }
    
    else
    {
        System.out.println("You are failed \nTry Agian next time \nBest of Luck");
    }

    }
    
}
