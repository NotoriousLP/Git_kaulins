import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes){
		Random rand = new Random();
		for(int i=1; i<=reizes; i++){
		int skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzskrita "+skaitlis);
		}
	}
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		int reizes;
		do{
		System.out.println("Cik reizes mest kauliņu");
		reizes = dati.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		dati.close();
	}
	}

