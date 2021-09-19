import java.util.Scanner;

/*  Q5. Write a java program to revere starting 5 index from string with out slicing */
public class ReverseStringIndexWhile {
	public static void mainj(String args[]) {
		
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
		int i=str2.length()-1;
		while(i>=0) {
			str4=str4+(str2.charAt(i));
			
		}
		System.out.println(str4+str3);
		
	}

}
