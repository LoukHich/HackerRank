
public class Teste1 {
	
	static int divideByZero(int a, int b)
    {
 
        // this statement will cause ArithmeticException
        // (/by zero)
        int i = a / b;
 
        return i;
    }
 
    // The runTime System searches the appropriate
    // Exception handler in method also but couldn't have
    // found. So looking forward on the call stack
    static int computeDivision(int a, int b)
    {
 
        int res = 0;
 
        // Try block to check for exceptions
        try {
 
            res = divideByZero(a, b);
            
        }
 
        // Catch block to handle NumberFormatException
        // exception Doesn't matches with
        // ArithmeticException
        catch (NumberFormatException ex) {
            // Display message when exception occurs
            System.out.println(
                "NumberFormatException is occurred");
           // throw new RuntimeException(ex.getMessage());
        }
        return res;
    }
	/*void teste1 () {
		System.out.println("teste1 ...");
		int i=90/0;
		
	}
    void teste2 () {
		teste1();
	}
    void teste3 () {
    	try {
    		teste2();
    		System.out.println("00000");
		} catch (Exception e) {
			
		}
	  
}
    void teste4 () {
    	System.out.println("teste4 ...");
	 teste3();
}
    void teste5() {
	teste4();
}*/
public static void main(String[] args) throws NumberFormatException{
	
 //new Teste1().teste3();

    int a = 1;
    int b = Integer.parseInt("e");

    // Try block to check for exceptions
   try {
        int i = computeDivision(a, b);
    }

    // Catch block to handle ArithmeticException
    // exceptions
    catch (ArithmeticException ex) {

        // getMessage() will print description
        // of exception(here / by zero)
       System.out.println(ex.getMessage());
    }
   catch (NumberFormatException e) {
	System.out.println("Dllali");
}
}


}
