import java.util.Scanner;
public class Exercicio1
{
	public static void main (String []args)
	{
		int num,dobro,quintuplo;
		Scanner sc=new Scanner(System.in);
		dobro=1;
		quintuplo=1;
		for (int i=1;i<21;i++);
		{
			System.out.println("\n Digite o numero");
			num=sc.nextInt();
			if(num%2==0)
			{
				System.out.println("\n numero par");
				dobro=num*2;
				System.out.println ("\n o dobro e: "+dobro);
			}
			else
			{
				System.out.println("\n Numero impar");
				quintuplo=num*5;
				System.out.println("\n o quintuplo e:"+quintuplo);
			}
		}
	}
}