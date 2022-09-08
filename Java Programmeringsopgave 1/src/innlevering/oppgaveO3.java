package innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveO3 {

	public static void main(String[] args) {
		String fakultetTxt = showInputDialog("Sett inn peongsum for elev nr.:");
		int fakultet = parseInt(fakultetTxt);
		
		int sum = 1;
		int i = 1;
		if (fakultet >= 0 && fakultet <= 31) {//tall over 31 blir for store og gir feil svar
		while (i < fakultet) {
			sum = sum + (sum * i);  
			i++;
		}
		System.out.println("!" + fakultet + "=" + sum);
		}
		else {
			System.out.println("Du kan ikke ta fakultet av negative tall og min kalkulator hater tall over 32 fordi da slutter den og funke.");
		}
	}

}
