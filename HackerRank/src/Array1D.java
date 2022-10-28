import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1D {
	public static boolean canWin(int leap, int[] game) {
		int check=0;
		int index =0;
		for(int i=0;i<game.length-1 ;i++) {
			System.out.println("i "+i);
			if(game[i+1]==0 && game[i]==0) {
				check++;
				index=i;
				if(leap+i>=game.length &&game[i]==0)
				{
				   System.out.println("leap ");
					return true;
				}
			System.out.println("Augm");
			}
				
			else {
				
				for(int j=i+1;j<game.length;j++) {
					
					System.out.println("j "+j);
					if(game[j]==0 && j-i==leap) {
						check=j;
						index=j;
						i=j-1;
						
						//System.out.println("check : "+check);
						break;
					}
					//0 1 1 1 1 0 0 0 1 1 1 1 0 1 1
				//	0 5 6 7
					if(leap+i>=game.length &&game[i]==0)
					{
					   System.out.println("leap ");
						return true;
					}
				}
			}
			
			System.out.println("check : "+check);
		}
		System.out.println("checkG : "+check);
		if(check<game.length && game[index]==0 && leap>game.length-index)
			return true;
		return check==game.length;
		 /*3
6 2
0 1 0 1 0 1
10 6
0 0 1 1 0 0 1 1 0 0
10 3
0 0 1 1 0 0 1 1 0 0*/
	      /**   List<Integer> arr = new ArrayList<Integer>();
	       for(int i=0;i<game.length;i++){
	          if(game[i]==0){
	              
	                arr.add(i);
	            }
	        }
	       arr.add(game.length);
	       int nbr= 0;
	      System.out.println(arr.toString());
	      
	       for(int i=0 ;i<arr.size()-1;i++) {
	    	  // System.out.println(arr.get(i)+1+" "+(arr.get(i+1)));
	    	   if(arr.get(i)+leap>=game.length) {
	    		   return true;
	    		  // break;
	    	   }
	    	   if(arr.get(i)+1==(arr.get(i+1)))
	    	   {
	    		 
	    	       nbr++;
	    	      // System.out.println("nombre "+nbr);
	    	   }
	    		 
	    	  else {
	    		   for(int j=i+1;j<arr.size()-1;j++) {
	    			   if((leap==(arr.get(j))-arr.get(i)))
		    		   {
		    			 nbr+=(arr.get(j))-arr.get(i);
		    			   i=j;
		    			  break;
		    			   //leap-=(arr.get(i+1))-arr.get(i);
		    		   }
	    			  
	    		   }
	    		  
	    		  
	    	 }
	       }
	     return nbr==game.length;*/
      
    };


  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int q = scan.nextInt();
      while (q-- > 0) {
          int n = scan.nextInt();
          int leap = scan.nextInt();
          
          int[] game = new int[n];
          for (int i = 0; i < n; i++) {
              game[i] = scan.nextInt();
          }
          System.out.println(canWin(leap, game)?"YES":"NO");
          ;
      }
      scan.close();
  }
}
