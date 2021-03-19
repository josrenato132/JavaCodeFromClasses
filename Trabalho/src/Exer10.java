import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		double n[] = new double[10];
		String g = "Os valores iguais são: ";
		for ( int x = 0; x < 10; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    }
		for ( int x = 0; x < 10; x++) {
			for ( int y = 0; y < 10; y++) {
				if (y != x) {
				if (n[x] == n[y] ) {
					g = g + n[y] + " - ";
				}
				}
			}
		}
		JOptionPane.showMessageDialog(null,g);
	}
}
