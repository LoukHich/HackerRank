import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringHandling {
	
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest =s.substring(0,k);
	        String largest = s.substring(0,k);
	        
	       for(int i=0;i<=s.length()-k;i++) {
	          if(s.substring(i,i+k).compareTo(smallest)<0) {
	              smallest=s.substring(i,i+k);
	          }
	          if(s.substring(i,i+k).compareTo(largest)>0) {
	              largest=s.substring(i,i+k);
	          }
	        
	      }
	      return smallest + "\n" + largest;
	    }
public static void main(String[] args) {
	System.out.println("**********Bonjour Nadori*************");
	
	String str = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
	System.out.println(getSmallestAndLargest(str, 30));
	System.out.println("".codePointAt(0));
	/*String smallest ="";//str.substring(0,3);
	String largest ="";//str.substring(0,3);
	for(int i=0;i<str.length()-2;i++) {
		  if(str.substring(i,i+3).compareTo(smallest)<0) {
			  smallest=str.substring(i,i+3);
		  }
		  if(str.substring(i,i+3).compareTo(largest)>0) {
			  largest=str.substring(i,i+3);
		  }
	}
	System.out.println(smallest+"\n"+largest);
	//List<String> list = new ArrayList<String>();
	
	/*for(int i=0;i<=str.length()-3;i++) {
		list.add(str.substring(i,i+ 3));
	}
	System.out.println(list);
	Collections.sort(list);   
	System.out.println(list);*/
	
}
}
