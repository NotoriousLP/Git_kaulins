import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner dati = new Scanner(System.in);
		
			System.out.println("Cik reizes mest kauliņu");
			int reizes = dati.nextInt();
		for(int i=1; i<=reizes; i++){
			int skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzskrita "+skaitlis);
		}
		dati.close();
	}
}
