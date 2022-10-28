
	

	public class A1 {
	    public A2 type2;
	    public A1()
	    {
	  
	        // Constructor of A2 is called
	        // hence object of A2 is created
	        type2 = new A2();
	    }
	  
	    public static void main(String[] args)
	    {
	  
	        // Cycle is started by
	        // invoking constructor of class A1
	        A1 type1 = new A1();
	    }
	}
	  


