import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu(int reizes){
		Random rand = new Random();
		int lielakais = 0, skaitlis=0;
		for(int i=1; i<=reizes; i++){
		 skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzskrita "+skaitlis);
		if(lielakais<skaitlis){
			lielakais = skaitlis;
			}
		}
		System.out.println("Lielakais skaitlis ir "+lielakais);
		return skaitlis;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reizes, izvele;
		int lielakais = 0;
		List<Integer> pedejie = new ArrayList<Integer>();
		do{
			System.out.println("1-Mest kaulinu | 2-Apskatīt pārejos| 3-Apturēt");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
				do{
				System.out.println("Cik reizes mest kauliņu");
				reizes = scan.nextInt();
				}while(reizes<1);
				pedejie = mestKaulinu(reizes);
			break;
			case 2:
			System.out.println("Pēdeja metiena skaitļi");
			for(int i=0; i<pedejie.size(); i++){
				lielakais = pedejie.get(i);
			}
			break;
			case 3:
				for(int i=0; i<pedejie.size(); i++){
					if(pedejie.get(i)>lielakais){
						lielakais = pedejie.get(i);
					}
				}
			}
		}while(izvele!=3);
		scan.close();
		}
	}



	

