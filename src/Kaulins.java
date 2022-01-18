import java.util.Random;

public class Kaulins {
	static void mestKaulinu(int reizes){
		Random rand = new Random();
		for(int i=1; i<=reizes; i++){
		int skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzskrita "+skaitlis);
		}
	}
	public static void main(String[] args) {
		mestKaulinu(3);
	}

}
