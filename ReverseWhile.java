import java.util.Scanner;

/*While loop  
  Q4. Write a java program to reverse a string without using slicing*/
public class ReverseWhile {
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		String str2="";
		int i=str1.length()-1;
		while(i>=0) {
			str2=str2+str1.charAt(i);
			i--;
			
		}
		System.out.println(str2);
		
		
	}

}
