import javax.swing.*;
public class Vetores
{
	public static void main(String[]args)
	{
		int []vet=new int [10];
		double soma, media;
		String entrada,saida="";
		soma=0;
		for (int i=0;i<10;i++)
		{
			entrada=JOptionPane.showInputDialog("Digite o numero da posicao"+1);
			vet[i]=Integer.parseInt(entrada);
			soma+=vet[i];
			saida+=vet[i]+"";
		}
		media=soma/10;
		JOptionPane.showMessageDialog(null,"O vetor digitado foi:" +saida);
		JOptionPane.showMessageDialog(null,"A soma dos valores e:" +soma);
		JOptionPane.showMessageDialog(null,"A media dos valores e:"+media);
}
}