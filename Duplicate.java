/*Q3. Write a java program to remove duplicate values from string*/


import java.util.Scanner;
public class Duplicate {
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		char arr[]=new char [26+26];
		String str2="";
		//System.out.println((int)'A');
		int s=97,b=65,i;
		for( i=0;i<=arr.length/2-1;i++) {
			arr[i]=(char)(s);
			s++;
		}
		for(int j=arr.length/2;j<=arr.length-1;j++) {
			arr[j]=(char)(b);
			b++;
		}
//		for(i=0;i<=arr.length-1;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		for(int p=0;p<=str1.length()-1;p++) {
			for(int q=0;q<=arr.length-1;q++) {
				
				if(str1.charAt(p)==arr[q]) {
					str2=str2+str1.charAt(p);
					arr[q]=(char)(43);
				}
				
			}
			if(str1.charAt(p)==(char)(32)) {
				str2=str2+(char)(32);
			}
		}
		System.out.println(str2);
	}

}
