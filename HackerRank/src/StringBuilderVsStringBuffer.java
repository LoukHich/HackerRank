
public class StringBuilderVsStringBuffer {
	
	public static String  concat1(String s1)
    {
        return  s1 + "forgeeks";
    }
 
    // Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
 
    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }
 
	public static void main(String[] args)
    {
        // Custom input string
        // String 1
        String s1 = concat1("Geeks");
  System.out.println(s1);
        // Calling above defined method
       
 
        // s1 is not changed
        System.out.println("String: " + s1);
 
        // String 1
        StringBuilder s2 = new StringBuilder("Geeks");
 
        // Calling above defined method
        concat2(s2);
 
        // s2 is changed
        System.out.println("StringBuilder: " + s2);
 
        // String 3
        StringBuffer s3 = new StringBuffer("Geeks");
 
        // Calling above defined method
        concat3(s3);
 
        // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}
