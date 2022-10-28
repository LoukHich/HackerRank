import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		System.out.println("Nadori....");
		Scanner sc = new Scanner(System.in);
		int rowLenght = sc.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<rowLenght;i++) {
			int nbrElm=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j=0;j<nbrElm;j++) {
				arr.add(sc.nextInt());
			}
			list.add(arr);
		}
		System.out.println(list);
	int req = sc.nextInt();
	for(int k=0;k<req;k++) {
		int row = sc.nextInt();
		int col = sc.nextInt();
		try {
			System.out.println(list.get(row-1).get(col-1));
		} catch (Exception e) {
		 System.out.println("Error!");
		}
		
	}

	for(int k=0;k<req;k++) {
		int row = sc.nextInt();
		int col = sc.nextInt();
		try {
			System.out.println(list.get(row-1).get(col-1));
		} 
	catch (Exception e) {
		   System.out.print("ERROR!");
		}
	}
	}
	
public static void main1(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int d, q, x, y;

	    ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
	   for(int i = 0; i < n; i++){
	     d = scanner.nextInt();
	     lines.add(i, new ArrayList<Integer>());       
	     for(int j = 0; j < d; j++){
	         lines.get(i).add(scanner.nextInt());             
	     }
	   }

	    q = scanner.nextInt();
	    for(int i = 0; i < q; i++){
	       x = scanner.nextInt();
	       y = scanner.nextInt();
	       try{
	          System.out.println(lines.get(x-1).get(y-1)); 
	       } catch(Exception e){
	           System.out.println("ERROR!");
	       }         
	    }
	}
/* Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    List<String> lstA = new ArrayList<>();
    scanner.nextLine();

    for(int i=0; i<n; i++){
        //System.out.println((String)scanner.nextLine());
       lstA.add((String)scanner.nextLine());
    }

    //lstA.forEach(str->System.out.println(str));


    int m = scanner.nextInt();
    int yPosition=0;


    for(int i=0; i<m; i++){

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        //System.out.println(x);
        //System.out.println(y);

        String str = lstA.get(x-1);
        String[] strArray = str.split(" ");
        int[] arr = new int[strArray.length];
        for(int p=0; p<strArray.length;p++){
            arr[p] = Integer.parseInt(strArray[p]);
            //System.out.println(arr[p]);
        }
        //int arr[] = Integer.parseInt(str.split(" "));

            if(y>strArray.length-1)
            System.out.println("ERROR!");
            else{
                yPosition = arr[y];

             System.out.println(yPosition);
            }


    }*/
	
}

