import javax.swing.JOptionPane;

public class Exer8 {

	public static void main(String[] args) {
		double n[] = new double[20];
		double v[] = new double[20];
		double h[] = new double[20];
		String g = "O vetor é: ";
		
		for ( int x = 0; x < 20; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		}
		for ( int x = 0; x < 20; x++) {
			v[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		}
		
		for ( int x = 0; x < 20; x+=2) {
			h[x] = n[x]; 
		}
		for ( int x = 1; x < 20; x+=2) {
			h[x] = v[x];
		}
		for ( int x = 0; x < 16; x++) {
			g = g + n[x] + " - " ; 
		}
		
	}
	
}
