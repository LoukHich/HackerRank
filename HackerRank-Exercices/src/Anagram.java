
public class Anagram {
	
	
	 static boolean isAnagram(String a, String b) {
	        boolean bool=false;
	        for(int i=0;i<a.length();i++){
	            int as=0;
	            int bs=0;
	          for(int j=0;j<a.length();j++){
	              if(a.charAt(i)==a.charAt(j))
	              as++;
	              if(b.charAt(j)==a.charAt(i))
	              bs++;
	            
	          }
	          
	            if(as != bs){
	                  bool=false;
	                  break;
	              } else {
	            	  bool=true;
	              }
	        }
	        return bool;
	        }
	      /*for(int i=0;i<a.length();i++){
	           for(int j=i;j<a.length();j++){
	              bool= a.contains(String.valueOf()):
	               if(a.charAt(i)==a.charAt(j))
	                as++;
	                if(a.charAt(i)==a.charAt(j))
	                bs++;
	           }
	           if(as!=bs){
	               bool=false;
	               break;
	           }
	          
	        }*/
	          
	        
	          
	          
	       
	       
	       
	    
public static void main(String[] args) {
	String a="Hicham".toLowerCase();
	String b="machih".toLowerCase();
    
  
     System.out.println(isAnagram(a,b));
}
}
