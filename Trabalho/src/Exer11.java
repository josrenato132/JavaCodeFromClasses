import javax.swing.JOptionPane;

public class Exer11 {

	public static void main(String[] args) {
		double n[] = new double[10];
		int vx=0, vy=0, vz=0, vb=0;
		String g = "o vencedor é: ";
		for ( int x = 0; x < 10; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o número do seu candidato: " + "\n" + "34- Candidato X" + "\n" + "20- Candidato Y" + "\n" + "65- Candidato Z"));
		    }
		for ( int x = 0; x < 10; x++) {
			if (n[x] == 34) {
				vx++;
			} else {
				if (n[x] == 20) {
					vy++;
				} else {
					if (n[x] == 65) {
						vz++;
					} else {
						vb++;
					}
				}
			}
		}
		int por=0;
		int vt = vx + vy + vz;
		int pvx = (vx/vt)*100;
		int pvy = (vy/vt)*100;
		int pvz = (vz/vt)*100;
		if ((pvx > pvy) && (pvx > pvz)) {
			g = g + "Candidato X";
			por = pvx;
		} else {
			if (pvy > pvz) {
				g = g + "Candidato Y";
				por = pvy;
			} else {
				g = g + "Candidato Z";
				por = pvz;
			}
	}
	JOptionPane.showMessageDialog(null,"Com " + por + "% dos votos " + g);	
} }
