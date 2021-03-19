import javax.swing.JOptionPane;

public class Exer4 {

	public static void main(String[] args) {
		double n[] = new double[20];
		int cont=0;
		
		for ( int x = 0; x < 20; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if (n[x] % 2 == 0) {
		    	cont++;
		    }
		}
		JOptionPane.showMessageDialog(null,"Entre esses " + cont + " são pares");
	}
}
