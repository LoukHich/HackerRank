import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormat_Meth {
public static void main(String[] args) {
	
	 float amount = 100000;

	// NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("hi", "IN")));
    //formatter.setCurrency(null);;
	 //String moneyString = formatter.format(amount);
	 System.out.println(Currency.getInstance(new Locale("hi", "IN")).getSymbol());
	// System.out.println(moneyString);
	/*double montant = 216635445.13446;
	NumberFormat frm1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	NumberFormat frm = NumberFormat.getInstance(Locale.CANADA);
	System.out.println(frm1.format(montant));*/
	
}
}
