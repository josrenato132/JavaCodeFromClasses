import javax.swing.JOptionPane;

public class Exer9 {

	public static void main(String[] args) {
		int n[] = new int[40];
		String g = "O vetor é: ";
		n[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número"));
		for ( int x = 1; x < 39; x++) {
			
			int h = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (x+1) + "° número"));
			int y = h + n[(x-1)];
			n[x] = y;
		}
		for ( int x = 0; x < 40; x++) {
			g = g + n[x] + " - " ; 
		}
		JOptionPane.showMessageDialog(null,g);
	}
}
