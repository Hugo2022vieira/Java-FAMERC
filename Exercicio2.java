import java.util.Scanner;
public class Exercicio2
{
	public static void main(String[]args)
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n digite o primeiro numero");
		n1=sc.nextInt();
		System.out.println("\n digite o segundo numero");
		n2=sc.nextInt();
		if (n1==n2)
		{
			System.out.println("\n os numeros sao iguais");
		}
		else
		{
			if (n1>n2)
			{
				System.out.println("\n o numero maior e:"+n1);
			}
			else
			{
				System.out.println("\n o numero maior e:"+n2);
			}
		}		
	}
}