
interface I{
     void add();
//    default  void show (){
//        System.out.println(" Show Methode I");
//    }
default  boolean equales(Object obj){
    return  true;
}
}

interface J{
    int adde();
//    default  void show (){
//        System.out.println(" Show Methode  J");
//    }
}



public class handleInterface implements  I,J{

    public static void main(String[] args) {
        handleInterface instance = new handleInterface();
      //  instance.show();

    }

    @Override
    public void add() {

    }
    @Override
    public int adde() {
   return  20;
    }

    @Override
    public boolean equales(Object obj) {
        return I.super.equales(obj);
    }

    //
//    public void show() {
//        System.out.println("Bonjour");
//    }
//
//    //  public  void add(){
//      System.out.println("Shoe");
//  }



//    @Override
//    public void show() {
//        I.super.show();
//        System.out.println(" Show in children");
//    }
}
