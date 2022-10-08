import java.util.Scanner;
public class Exerc
 {
 	public static void main (String[]args)
  		
  	{
  		 int n1,n2;
   		 Scanner Sc=new 
   		 Scanner(System.in);
   		 for(int i=1;i<10;i++)
   		 {
   		  System.out.println("\n Dgigite o Primeiro numero");
   		  n1=Sc.nextInt();
   		  System.out.println("\n Digite o Segundo numero");
   		  n2=Sc.nextInt();
   		  if(n1==n2)
    	    {
    	  	System.out.println("\n Os Numeros são iguais");
    	  }
    	    else
    	    {
    		 if(n1>n2)
         	 {
         		System.out.println("\n o Numero e "+n1);
         
             }
         	else
         	  {
         		System.out.println("\n o numero maior e "+n2);
         	  }
    	    }
      }
 }
 }
