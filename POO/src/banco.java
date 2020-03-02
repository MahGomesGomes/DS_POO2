import javax.swing.JOptionPane;
public class banco {

	public static void main(String[] args) {
		
			Ex1 chama = new Ex1();
			Double numero = 1500.00;
			int n;
			
			double saldo= 1500;
			 n  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o que deseja fazer?\n\n 1 - Exibir seu saldo\n 2 - depositar\n 3 - sacar\n 4 - sair"));
					
			switch (n) {
			case 1:
				chama.exibir();
				break;
			case 2:
				chama.Deposito();
				break;
			case 3:
				chama.sacar();
				break;
			case 4:
				chama.sair();
				break;
			}
	}
}
