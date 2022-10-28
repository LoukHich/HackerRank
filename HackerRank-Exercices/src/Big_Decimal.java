import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Big_Decimal {
	public static void main1(String[] args) {
		
		System.out.println("***************nadori*******************");
		double a = 0.03;
		double b = 0.04;
		int a1 =100;
		int b2=128;
		System.out.println(b-a);
	} 

	 public static void main2(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	/*
	      	 * String[] x = Arrays.copyOf(s, n);
Arrays.sort(x,Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
s = x;*/
	      /*	Comparator<String> customComparator = new Comparator<String>() {
	      	    @Override
	      	    public int compare(String s1, String s2) {
	      	        BigDecimal a = new BigDecimal(s1);
	      	        BigDecimal b = new BigDecimal(s2);
	      	        return b.compareTo(a); // descending order
	      	    }
	      	};*/

	      //	Arrays.sort(s, 0, n, customComparator);
	   	for(int i=0;i<n;i++) {
	      		for(int j=i;j<n-1;j++) {
	      		if(new BigDecimal (s[i]).compareTo( new BigDecimal(s[j]) )==0 ) {
	      				/*String temp = s[i+1];
	      				s[i+1] =s[j];
	      				s[j]=temp;*/
	      				j++;
	      			}
	      			 if(new BigDecimal (s[i]).compareTo( new BigDecimal(s[j]) )<0 ) {
	      				String temp = s[i];
	      				s[i] =s[j];
	      				s[j]=temp;
	      				
	      			}
	      			
	      		}
	      		
	      	}
	 /*    List<BigDecimal> list =  Arrays.asList(s).stream().filter(nbr->nbr!=null)
	    		                                 .map(nbr->new BigDecimal(nbr))
	    		                                 .sorted(Collections.reverseOrder())
                                                 .collect(Collectors.toList());
	     // Collections.sort(list);
	      System.out.println(list);
	       */

	        //Output
	       for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	      int x,y;
	      try{
	          x= sc.nextInt();
	          y=sc.nextInt();
	          System.out.println(x/y);
	      }catch(ArithmeticException e){
	          System.out.println(e);
	      }
	      catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
	    }
}
