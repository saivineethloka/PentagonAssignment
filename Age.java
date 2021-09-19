/*Write a java program to divide them into three groups, based on the users age*/

import java.util.Scanner;
public class Age {
    public static void main(String [] args) {

        @SuppressWarnings("resource")
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age<18) {
            System.out.println("User is a minor, and not elegible to work");
        }
        else if(age>=18&&age<60) {
            System.out.println("The user is elegible to work");
        }
        else if(age>=60) {
            System.out.println("THe user is too old to work as per govt regulations");
        }
        else;
    }
}
