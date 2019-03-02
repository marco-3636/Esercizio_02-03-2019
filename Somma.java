import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int somma;
		
		System.out.println("inserire a");
		a=s.nextInt();
		System.out.println("inserire b");
		b=s.nextInt();
		
		somma = a + b;
		
		System.out.println("a + b = ");
		System.out.println(somma);

	}

}
