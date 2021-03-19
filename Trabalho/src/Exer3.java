import javax.swing.JOptionPane;

public class Exer3 {

	public static void main(String[] args) {
		double n[] = new double[13];
		int cont=0, cont2 = 0;
		
		for ( int x = 0; x < 13; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if (n[x] < 0) {
		    	cont++;
		    } else {
		    	cont2++;
		    }
		}
		JOptionPane.showMessageDialog(null,"Entre esses " + cont + " são negativos");
		JOptionPane.showMessageDialog(null,"Entre esses " + cont2 + " são positivos");
	}
}
