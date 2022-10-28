import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// second solution ::
		int count =0;
		int n = sc.nextInt();
		int [] arr = new int[n];
       for(int i=0 ;i<n;i++) {
			arr[i]=sc.nextInt();
			
			List<Integer> sub = new ArrayList<Integer>();
		     int som =0;
		     
		     for(int j=i;j>=0;j--) {
		    	  som+=arr[j];
					if(som<0) {count ++;}
					//System.out.println(j);
					 sub.add(arr[j]);
					System.out.println(sub+"  "+som);
		     }
		     // int j=i;
		     /* while(j>=0) {
		    	  som+=arr[j];
					if(som<0) {count ++;}
					//System.out.println(j);
					 sub.add(arr[j]);
					System.out.println(sub+"  "+som);
					j--;
		      }
			*/
		}
       System.out.println(count);
		// first solution ::
		//A=[1,-2,4,-5,1]
	 /*       int n1 = sc.nextInt();
	        int [] arr1 = new int[n1];
	        for(int i=0 ;i<n;i++) {
	            arr[i]=sc.nextInt();
	        }
	        int count1 =0;
	        for(int i=0;i<n1;i++) {
	            
	        
	            int som =0;
	            
	            for(int j=i;j<n1;j++) {
	                som+=arr[j];
	                if(som<0) {count1 ++;}
	               
	            }
	        }
	        System.out.println(count1);*/
	}
}
