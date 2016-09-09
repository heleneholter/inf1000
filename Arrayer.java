import java.util.Scanner;

class Arrayer{
	public static void main(String[] args){

		//To maater aa opprette arrayer paa:
		int[] tallene = new int[5]; // Naa er innholdet i arrayen tallene 0, 0, 0, 0, 0
		int[] tall = {-25, 19, 4, 8, 0};  //Naa er innholdet i arrayen tall -25, 19, 4, 8, 0

		//Det samme gjelder for String-arrayer:
		String[] noenOrd = new String[2]; // Naa er innholdet i arrayen noenOrd null, null
		String[] flereOrd = {"Hei", "Studentliv"}; //Naa er innholdet i arrayen flereOrd "Hei", "Studentliv"

		System.out.println(tall[0] + ", som vi tror er -25");
		System.out.println(tall[3] + ", som vi tror er 8");
		//System.out.println(tall[5] + ", som vi tror er ingenting");  //Faar IndexOfOutBoundsException

		//
		//Paa linje 19 faar vi IndexOfOutBoundsException hvis vi fjerner
		//kommenteringen, fordi vi skriver tall[5]. Heltallsarrayen som heter tall
		//har 5 plasser, og i arrayer begynner vi aa telle fra 0 - altsaa er
		//den siste plassen i arrayen tall[4], ikke tall[5].
		//


		String[] ord = new String[5];	//Oppretter String-arrayen ord med 5 bokser/plasser.

		Scanner sc = new Scanner(System.in);

		//Ei lokke som etterspor og tar inn fine ord fra brukeren,
		//og fyller de inntastede ordene i arrayen ord, helt til brukeren har fylt opp
		//hele arrayen ord med fine ord:

		int plass = 0;	//En heltallsvariabel vi kaller plass, som skal holde styring paa hvor vi befinner oss i arrayen ord.
		while (plass < ord.length){		//Lokka kjorer saa lenge plass er mindre enn lengden paa arrayen ord.
			System.out.println("Hva er et fint ord?");
			ord[plass] = sc.nextLine(); //Setter inn det ordet brukeren taster inn, i boksen med nummer plass i arrayen ord.
			plass++; //Oker plass med 1.
		}

		System.out.println(); //Linjeskift for litt luft
		System.out.println(ord.length + " fine ord:");

		//Ei lokke som printer ut alt innholdet i arrayen ord:
		plass = 0; //Resetter plass til 0.
		while (plass < ord.length){ //Lokka kjorer saa lenge plass er mindre enn lengden paa arrayen ord.
			System.out.println(ord[plass]);	//Printer ut det som finnes paa boks nummer plass i arrayen ord.
			plass++;	//Oker plass med 1.
		}


	}
}
