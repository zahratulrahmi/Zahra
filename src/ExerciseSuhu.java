import java.util.Scanner;

public class ExerciseSuhu {
	public static void main(String[] args) {
		System.out.println("S U H U");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input suhu : ");
		int suhu = input.nextInt();
		
		if (suhu <= 0){
			System.out.println("Suhu : " + suhu + " , dengan kategori Beku ");
		}
		else if (suhu >= 1 && suhu <= 10){
			System.out.println("Suhu : " + suhu + " , dengan kategori Dingin ");
		}
		else if (suhu >= 11 && suhu <= 20){
			System.out.println("Suhu : " + suhu + " , dengan kategori Sejuk ");
		}
		else if (suhu >= 21 && suhu <= 25){
			System.out.println("Suhu : " + suhu + " , dengan kategori Sedang ");
		}
		else if (suhu >= 26 && suhu <= 99){
			System.out.println("Suhu : " + suhu + " , dengan kategori Panas ");
		}
		else {
			System.out.println("Suhu : " + suhu + " , dengan kategori Mendidih ");
		}
	}
}
