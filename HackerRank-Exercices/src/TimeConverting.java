public class TimeConverting {

    public static void main(String[] args) {
      //  System.out.println(String.valueOf(Integer.parseInt("12")+12) );


        String  s= "baab";
      // String  reducing ="";
      // reducing= s.substring(2,7);//i=2

       // System.out.println(reducing);
        for(int i=0 ;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                s=s.replaceAll(String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i)),"");
                System.out.println(s);
                i = -1;
                //System.out.println(String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i))
               // );
               // String c = s.charAt(i);
              //s=s.replaceFirst(String.valueOf(s.charAt(i)),"");
              //s=s.replaceFirst(String.valueOf(s.charAt(i)),"");
                //s=s.substring(i+2,s.length()-1);
               // System.out.println(s);
                      //   i=0;
            }


        }
             System.out.println(s);
      //  System.out.println(reducing);
    }
}
