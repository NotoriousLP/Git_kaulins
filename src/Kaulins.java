import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu(){
		Random rand = new Random();
		 int skaitlis = rand.nextInt(6)+1;
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
				
				for(int i=0; i<reizes; i++){
				pedejie.add(mestKaulinu());
				}
			break;
			case 2:
			System.out.println("Pēdeja metiena skaitļi ir ");
			for(int i: pedejie){
				System.out.print(i+" ");
			}
			break;
			case 3:
				for(int i=0; i<pedejie.size(); i++){
					if(pedejie.get(i)>lielakais){
						lielakais = pedejie.get(i);
					}
				}
				System.out.println("Lielākais skaitlis pēdeja metienā ir "+lielakais);
			}
		}while(izvele!=4);
		scan.close();
		}
	}



	

