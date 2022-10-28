import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class static_block_Hk {
	static Scanner sc  = new Scanner(System.in);
	static int H= sc.nextInt();
	static int B= sc.nextInt();

	static boolean flag=true ;
	static {
	    System.out.println("Hello ..");
	    try{
	      
	      
	              if(H<0 || B<0){
	              flag =false;
	              throw new Exception("Breadth and height must be positive");
	        }
	        
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   
} 
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.println(area);
		}
		System.out.println("end ...");
		
	}//end of main

}


