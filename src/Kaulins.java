import java.util.Random;

public class Kaulins {
	static void mestKaulinu(){
		Random rand = new Random();
		int skaitlis = rand.nextInt(7)+1;
		System.out.println("Uzskrita "+skaitlis);
	}
	public static void main(String[] args) {
		mestKaulinu();
	}

}
