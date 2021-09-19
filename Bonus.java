/* Q5. Company decided to give bonus of 5 percent to employees if the have served more than 5 years*/
import java.util.Scanner;
public class Bonus {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary ");
        double sal=sc.nextDouble();
        System.out.println("Enter years ");
        int years=sc.nextInt();
        if(years>5){
            double res=sal+(sal*5)/100;
            System.out.println("Thank you for your service, Your bonus is "+ res);
        }
        else
            System.out.println("You are not eligible for the bonus ");
    }
}
