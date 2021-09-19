/*Q4. Write a java program to check weather the given char is vowel or consonant*/
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("The character you entered is vowel");
        }
        else
            System.out.println("The character you entered is Consonant");
    }
}
