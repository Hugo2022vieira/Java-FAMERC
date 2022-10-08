import javax.swing.*;
public class Exercicio4
{
	public static void main(String[]args)
	{
		int num,soma;
		String entrada,saida1="";
		double media;
		soma=0;
		for(int i=1;i<51;i++)
		{
			entrada=JOptionPane.showInputDialog("digite o numero"+i);
			num=Integer.parseInt(entrada);
			saida1+=num+"";
			soma+=num;
		}
		JOptionPane.showMessageDialog(null,"os numeros lidos foram"+saida1);
	
		JOptionPane.showMessageDialog(null,"a soma e "+soma);
		media=soma/50;
	
		JOptionPane.showMessageDialog(null,"a media e "+media);
		System.exit(0);
	}
}