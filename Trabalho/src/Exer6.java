import javax.swing.JOptionPane;

public class Exer6 {

	public static void main(String[] args) {
		double n[] = new double[16];
		double v;
		String g = "O vetor é: ";
		for ( int x = 0; x < 16; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    }
		for (int y = 0; y <8; y++) {
			v = n[y];
			n[y] = n[y+8];
		    n[y+8] = v;
		}
		for ( int x = 0; x < 16; x++) {
			g = g + n[x] + " - " ; 
		}
		
		JOptionPane.showMessageDialog(null, g);

	}
}
