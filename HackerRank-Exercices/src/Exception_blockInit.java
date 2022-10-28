
public class Exception_blockInit {
	static int i, j;
	   static {
	      System.out.println("In the static block");
	      try {
	         i = 0;
	         j = 10/i;
	      } catch(Exception e){
	         System.out.println("Exception while initializing" + e.getMessage());
	       // throw new RuntimeException(e.getMessage());
	      }
	   }
	   public static void main(String args[]) {
	      Exception_blockInit blk = new Exception_blockInit();
	      System.out.println("In the main() method");
	      System.out.println("Value of i is : "+i);
	      System.out.println("Value of j is : "+ j);
	   }
}
