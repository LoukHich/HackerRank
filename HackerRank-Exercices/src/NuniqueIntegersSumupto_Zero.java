import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NuniqueIntegersSumupto_Zero {
	
	
	
	
	public static int[] findArray(int n) {
		int arr[] = new int[n];
		int k=(n/2);
		for(int i=0 ,j=n-1;i<j;i++,j--) {
			
			arr[i]= -k;
			arr[j]=k;
			k--;
	   }
		return arr;
		
  /*	int arr[] = new int[n];
		System.out.println(n/2);
		if(n%2==1) {
			
			for(int i=0;i<n/2;i++) {
				arr[n/2+i+1]=i+1;
				arr[n/2-i-1]=-i-1;
			}
		//n pair milieu n+1/2 -1
	} else{
		arr[0]=-n+1;
		for(int i=0;i<= (n+1)/2;i++) {
			arr[i+(n/2)-1]=i;
		}
		//   [-7, -2, -1, 0, 1, 2, 3,4]*/
	}
	public static void main(String[] args) {
		 int arr [] = findArray(7);
		 List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		 // list.add(2);
		  System.out.println(list);
		  
		
	}
}
