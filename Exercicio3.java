import javax.swing.*;
public class Exercicio3
{
	public static void main(String[]args)
	{
		int num;
		String entrada,saida="";
		for(int i=1;i<31;i++)
		{
			entrada=JOptionPane.showInputDialog("\n digite o numero");
			num=Integer.parseInt(entrada);
			saida+=num+"";
		}
		JOptionPane.showMessageDialog(null,"os numeros digitados foram"+saida); 
	}
}