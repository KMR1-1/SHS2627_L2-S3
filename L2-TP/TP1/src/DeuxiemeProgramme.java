import java.util.Scanner;
public class DeuxiemeProgramme {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Quel est le rayon de votre cercle ?");
		Cercle c = new Cercle();
		c.rayon=s.nextDouble();
		System.out.println("Le perimetre est de " + c.perimetre() + " et la surface est de " + c.surface());
	}
}