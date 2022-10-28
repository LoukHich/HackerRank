import java.util.BitSet;
import java.util.Scanner;

public class BitSet1 {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        int m = get.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;
        System.out.println(b1.get(0));
        System.out.println(b1.get(1));
        System.out.println(b2);
       for(int i=0;i<n;i++){
           System.out.println(b2.get(i));   ;
       }
        while ( 0 < m-- ) {
            String operation_name = get.next();
            int x = get.nextInt();
            int y = get.nextInt();

            if(operation_name.equals("AND")){
                bitset[x].and(bitset[y]);
            }
            else if(operation_name.equals("OR")){
                bitset[x].or(bitset[y]);
            }
            else if(operation_name.equals("FLIP")){
                bitset[x].flip(y);
            }
            else if(operation_name.equals("SET")){
                bitset[x].set(y);
            }
            else if(operation_name.equals("XOR")){
                bitset[x].xor(bitset[y]);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    /*    BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

// assign values to bs1 using set()
        bs1.set(7);
        bs1.set(1);
        bs1.set(0);
        bs1.set(4);
        bs1.set(3);
        bs1.set(6);

// assign values to bs2
        bs2.set(4);
        bs2.set(6);
        bs2.set(3);
        bs2.set(9);
        bs2.set(2);

// Printing the Bitsets
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);
        System.out.println(bs1.get(0));
        System.out.println(bs1.get(2));
// use of length() method
        System.out.println("use of length() : " + bs1.length());

// use of xor() to perform logical Xor operation
        bs1.xor(bs2);
        System.out.println("Use of xor() : " + bs1);
        bs2.xor(bs1);
        System.out.println("Use of xor() : " + bs2);
//
//// clear from index 2 to index 4 in bs1
//        bs2.clear(1, 2);
//        System.out.println("bs2 after clear method : " + bs2);
//
//// clear complete Bitset
//        bs1.clear();
//        System.out.println("bs1 after clear method : " + bs1);*/
    }
}
