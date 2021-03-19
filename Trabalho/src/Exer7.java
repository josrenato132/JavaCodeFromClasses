import javax.swing.JOptionPane;

public class Exer7 {

	public static void main(String[] args) {
		double n[] = new double[20];
		String g ="O valor digitado está nas posições: " ;
		double v;
		v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		for ( int x = 0; x < 20; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if (n[x] == v) {
		    	g = g + x + " - " ;
		    }
		}
		JOptionPane.showMessageDialog(null,g);
	}
}
