package UD5;
import javax.swing.JOptionPane;

public class T5Ejercicio05App {

	public static void main(String[] args) {

		String num= JOptionPane.showInputDialog("Introduce un número "); 
		int numero= Integer.parseInt(num);

		if (numero % 2==0) {
			JOptionPane.showMessageDialog(null, +numero + " Es divisible entre 2 PAR ");
		}else {
			JOptionPane.showConfirmDialog(null, +numero + " No es divisible entre 2 IMPAR");
		}
		
	}

}
////
//int numero= Integer.parseInt(JOptionPane.showInputDialog(
//	"Introduce un número: "));
//int resto = numero%2;

// if (resto==0)
// if (numero % 2==0) {
//JOptionPane.showMessageDialog(null, +numero + "Es divisible entre 2");
//}else {
//JOptionPane.showConfirmDialog(null, +numero + "No es divisible entre 2");