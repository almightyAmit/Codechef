import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;



class atm {
 public static void Main(String[] args)
 {
	 Scanner scan = new Scanner(System.in);
	 int w = scan.nextInt();
	 double b = scan.nextDouble();
	 if((w%5==0) && (b>(w+0.5)))
	 {
		 b = b - (w + 0.5);
	 }
	 else 
		 b = b;
	 NumberFormat n = new DecimalFormat("#0.00");
	 System.out.println(n.format(b));
 }
}
