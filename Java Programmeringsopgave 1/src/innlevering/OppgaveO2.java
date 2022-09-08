package innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for (int i=1; i < 11; i++) { //i starter på 1 så jeg lettere kan nummere elevene
			String poengsumTxt = showInputDialog("Sett inn peongsum for elev nr.:" + i);
			int poengsum = parseInt(poengsumTxt);
			char karakter = '#'; // bruker # som feil symbol
			
			if (poengsum <= 39 && poengsum >= 0) { 
			karakter = 'F';
			}
			else if (poengsum >= 40 && poengsum <= 49) {
			karakter = 'E';
			}
			else if (poengsum >= 50 && poengsum <= 59) {
			karakter = 'D';
			}			
			else if (poengsum >= 60 && poengsum <= 79) {
				karakter = 'C';
				}			
			else if (poengsum >= 80 && poengsum <= 89) {
					karakter = 'B';
				}			
			else if (poengsum >= 90 && poengsum <= 100) {
					karakter = 'A';
				}
			else {
			i = i - 1; // resetter loopen med 1, om du taster inn en ugyldig verdi
			System.out.println("Du satte inn en ugyldig verdi. Prøv igjen :)");
			}
		System.out.println ("Elev nr " + i + " fikk karakter " + karakter + ".");
	}

}
}
