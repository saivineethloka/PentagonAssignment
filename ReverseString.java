/*Q1. Write a java program to reverse string without using slicing.*/
import java.util.Scanner;
public class ReverseString {
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		//System.out.println(str1);
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			
			str2=str2+(str1.charAt(i));
			
		}
		System.out.println(str2);
		
	}

}
