import java.util.Scanner;



public class palindrome {
public static void main(String[] args) {
	System.out.println("********Bonjour Nadori***********");
	Scanner sc = new Scanner(System.in);
	String A="madam";
	String e="";
	String d ="";
	
	for(int i=0,j=A.length()-1;i<=j;i++,j--) {
		    d+=A.charAt(i);
		    e+=A.charAt(j);
	}
	System.out.print(d+"\n"+e);
	
}
}
