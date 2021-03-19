import javax.swing.JOptionPane;

public class Exer1 {

	public static void main(String[] args) {
		
		int n[] = new int [10];
		int c, x=0;
		String a = "Os números impares são são: ";
		while (x < 10) {
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + x + "° número"));
			if (c % 2 != 0) {
				n[x] = c;
				x = x + 1;
			}
		}
		for (int q =0; q < 10; q++) {
			a = a + n[q] + "- ";
		}
		JOptionPane.showMessageDialog(null,a);
	}
}
