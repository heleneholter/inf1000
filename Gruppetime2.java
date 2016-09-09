import java.util.Scanner;

/**
 * Et program som ber bruker om navn og bosted, og printer hilsen i to
 * rekkefolger, en normal og en rar.
 *
 * Deretter printer programmet differansen mellom 38 og 32, og differansen
 * mellom 32 og 38.
 */

class Gruppetime2{
	public static void main(String[] args){
		navnOgBosted(); //Kaller metoden navnOgBosted

		trekkFra(38, 32); //Kaller metoden trekkFra med argumenter 38 og 32
		trekkFra(32, 38); //Kaller metode trekkFra med argumenter 32 og 38
	}

	/**
	 * Metoden trekkFra tar to parametre: en heltallsparameter (int) som vi
	 * kaller a, og en heltallsparameter vi kaller for b.
	 * Metoden printer hva som skjer naar vi utforer regnestykket (a - b).
	 */
	public static void trekkFra(int a, int b){
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	/**
	 * Metoden printHilsen tar to parametre: En tekstparameter (String) som vi
	 * kaller apekatt, og en tekstparameter vi kaller bavian
	 * Programmet printer en hilsen som inkluderer de to tekstparameterne.
	 */
	public static void printHilsen(String apekatt, String bavian){
		System.out.println("Hei hei hei. Du er jo selveste " + apekatt +
											 " fra " + bavian + ", du.");
	}

	/**
   * Metoden navnOgBosted etterspor og tar inn informasjon om navn og bosted
	 * fra brukeren, og printer en hilsen til brukeren i to rekkefolger: en normal
	 * og en rar.
	 */
	public static void navnOgBosted(){
		String navn;
		String bosted;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hva heter du?");
		navn = sc.nextLine();

		System.out.println("Hvor bor du?");
		bosted = sc.nextLine();

		//Printer to hilsener til bruker:
		printHilsen(navn, bosted); //Kaller metoden printHilsen med argumentene navn og bosted.
		printHilsen(bosted, navn); //Kaller metoden printHilsen med argumentene bosted og navn.
	}

}
