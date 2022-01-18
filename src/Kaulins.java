import java.util.Random;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis;
		Random rand = new Random();
		skaitlis = rand.nextInt(7)+1;
		System.out.println("Uzskrita "+skaitlis);
	}

}
