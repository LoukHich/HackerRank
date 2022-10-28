import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
	
public static boolean isPalindrome(int x) {
	List<Integer> list = new  ArrayList<Integer>();
	  if(x<0) {
		  return false;
	  }
	  
		while(x>=10) {
			list.add(x%10);
			x=x/10;
	    }
		
		list.add(x);
		for(int i=0,j=list.size()-1;i<j;i++,j--) {
			if(list.get(i)!=list.get(j))
				return false;
		}
		
		
		return true;
		
	

	
	
        
    }
public static void convertNumberToArray(int x) {
	
	while(x>=10) {
		System.out.print(x%10+" **");
		x=x/10;
		
	}
	System.out.println(x);
}


public static void main(String[] args) {
	System.out.println(isPalindrome(1234123));
	convertNumberToArray(101);
}

}
