
public class GestionException {
public static void main(String[] args) {
	
	String [] podzdania = {"1","Nadori","14"};
	int numberword =0;
	for (int i = 0; i < podzdania.length; i++) {
		  try {
		    Integer.parseInt(podzdania[i]);
		    System.out.println(podzdania[i]);
		  } catch (NumberFormatException e) {
		    numberword++;
		  }
		}
}
}
