import javax.swing.JOptionPane;

public class Exer5 {

	public static void main(String[] args) {
		double n[] = new double[12];
		int z,y;
		double f=0,g=0,soma;
		z = Integer.parseInt(JOptionPane.showInputDialog("Qual a primeira posição?"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Qual a segunda posição?"));
		for ( int x = 0; x < 12; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if ( x == z) {
		    	f = n[x];
		    }
		    if ( x == y) {
		    	g = n[x];
		    }
		}
		soma = f + g;
		JOptionPane.showMessageDialog(null,"Entre esses " + soma + " são pares");
	}
}
