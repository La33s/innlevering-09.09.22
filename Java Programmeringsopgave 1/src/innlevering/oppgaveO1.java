package innlevering;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class oppgaveO1 {

	public static void main(String[] args) {
		String bruttoinntektTxt = showInputDialog("Beløp:");
		int bruttoinntekt = parseInt(bruttoinntektTxt);
		int skattetrinn = 0;
		double sats = 0;
			if (bruttoinntekt <= 164100) {
			skattetrinn = 0; 
		}
			if (bruttoinntekt <= 230950) {
			skattetrinn = 0;
			sats = 0.093;
		}
			else if (bruttoinntekt <= 580650) {
			skattetrinn = 2;
			sats = 0.0241;
		}
			else if (bruttoinntekt <= 934050) {
			skattetrinn = 3;
			sats = 0.1152;
		}
			else if (bruttoinntekt > 934050) {
			skattetrinn = 4;
			sats = 0.1452;
		}
		
		float utregnet = bruttoinntekt - (bruttoinntekt * (float)sats);
		
		System.out.println("Du er i skattesatsen " + sats + " og du får derfor ut " +  utregnet + " etter skatt");
		 

	}

}
