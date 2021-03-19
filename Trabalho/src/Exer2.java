import javax.swing.JOptionPane;

public class Exer2 {

	public static void main(String[] args) {
		double n[] = new double[15];
		int cont=0;
		
		for ( int x = 0; x < 15; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if (n[x] < 0) {
		    	cont = cont +1;
		    }
		}
		JOptionPane.showMessageDialog(null,"Entre esses " + cont + " são negativos");
	}
}
