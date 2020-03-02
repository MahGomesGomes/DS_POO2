import javax.swing.JOptionPane;
public class salario {

	public static void main(String[] args) {
		
			Ex2 chama = new Ex2();
			Double numero,inss,vr,vt,sb;
			String nome;
			
			 nome  = JOptionPane.showInputDialog(null,"Fale teu nome");
			 numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário"));
			 
			 if(numero>=2500.00) {
				 inss = (numero*8)/100;
				 vr = (numero*5)/100;
				 vt = (numero*6)/100;
				 
				 sb = numero-(inss+vr+vt);
				 
			 }else{
				 inss = (numero*4)/100;
				 vr = (numero*3)/100;
				 vt = (numero*2)/100;
				 
				 sb = numero-(inss+vr+vt);
			 }
					
			 JOptionPane.showMessageDialog(null,"Sr(a). "+nome +"\nSeu salário inicial: R$"+numero+"\n\n Seu INSS: R$"+inss+"\n Seu V.R.: R$"+vr+"\n Seu V.T.: R$"+vt+"\n\n Salário bruto(final): R$"+sb);
	}
}