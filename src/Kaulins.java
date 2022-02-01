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
		Scanner scan = new Scanner(System.in);
		int reizes, izvele;
		do{
			System.out.println("1-Mest kaulinu | 2-Apturet");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
				do{
				System.out.println("Cik reizes mest kauliņu");
				reizes = scan.nextInt();
				}while(reizes<1);
				mestKaulinu(reizes);
			break;
		
			case 2:
			System.out.println("Programma aptureta!");
			break;
			}
		}while(izvele!=2);
		scan.close();
	}
}

