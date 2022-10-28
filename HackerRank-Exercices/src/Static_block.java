class Test {
 
    // Case 1: Static variable
    static int i;
    // Case 2: non-static variables
    int j;
 
    // Case 3: Static block
    // Start of static block
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
    // End of static block
}
 
// Class 2
// Main class
public class Static_block {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Although we don't have an object of Test, static
        // block is called because i is being accessed in
        // following statement.
        System.out.println(Test.i);
    }
}










/* class Static_block {
	
	
	
		   
	    // Static block
	    static
	    {
	        // Print statement
	        System.out.print(
	            "Static block can be printed without main method");
	     }
	public static void main1(String[] args) {
		
	}
	/*static int i=0;  
    static  
    {  
        i=20;  
    }  
    static void print()  
    {  
        System.out.println(i);  
    }  
    public static void main(String[] args)  
    {  
        print();  
        i=200;  
        print();  
    }*/  

//}
