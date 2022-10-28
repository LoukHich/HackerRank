import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.List;
public class Arary_Exemple {
	
	 private static int solve4(int[][] arr) {

	        int width = arr[0].length - 2;
	        return IntStream.range(0, arr.length - 2).map(
	                (row) -> IntStream.range(0, width).map(
	                        col -> Arrays.stream(arr[row], col, col + 3).sum()
	                                + arr[row + 1][col + 1]
	                                + Arrays.stream(arr[row + 2], col, col + 3).sum()

	                ).max().getAsInt()
	        ).max().getAsInt();

	    }
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
/*1 1 1 0 0 0
  0 1 0 0 0 0
  1 1 1 0 0 0
  0 0 2 4 4 0
  0 0 0 2 0 0
  0 0 1 2 4 0*/
	        List<List<Integer>> arr = new ArrayList<>();

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }
 
	        bufferedReader.close();
	        
	        int max = Integer.MIN_VALUE;
	        
	        for(int i=0;i<4;i++) {
	        	for(int j=0;j<4;j++) {
	        		int som=0;
	        		for(int k=j;k<j+3;k++) {
	        			if(k==j+1)
	        			 som+=arr.get(i).get(k)+arr.get(i+2).get(k)+arr.get(i+1).get(k);
	        			else
	        				som+=arr.get(i).get(k)+arr.get(i+2).get(k);
	        	
	        		}
	        		if(som>max)
	        			max=som;
	        	}
	         
	        }
	      System.out.println(max);
	    }
}



