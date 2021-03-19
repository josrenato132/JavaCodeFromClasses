import javax.swing.JOptionPane;

public class Exer12 {

	public static void main(String[] args) {
		double n[] = new double[5];
		double b[] = new double[5];
		int cont=0, a=0;
		String o;
    	o = "Os números maiores que 100 são: ";
		for ( int x = 0; x < 5; x++) {
			n[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
		    if (n[x] > 100) {
		    	b[a] = n[x];
		    	a++;
		    	cont++;
		    }
		}
	    for (int x=0; x < cont; x++) {	
	     o = o + b[x] + " - ";	
	    	
	    
	    }
	    JOptionPane.showMessageDialog(null,o);    
	}
}
