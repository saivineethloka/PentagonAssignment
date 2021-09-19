import java.util.Scanner;

/*Q2. Write a java program to revere starting 5 index from string with out slicing*/
public class ReverseStringIndex {
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		
		String str2=str1.substring(0,6);
		//System.out.print(str2);
		
		int a=str1.length();
		String str3=str1.substring(6,a);
		//System.out.println(str3);
		
		String str4="";
		
		for(int i=str2.length()-1;i>=0;i--) {
			str4=str4+(str2.charAt(i));
		}
		System.out.println(str4+str3);
	}
}
