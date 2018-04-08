import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);

		int n;
				
System.out.println("Escribe una nota");
  n = entrada.nextInt(); 	 
  
  if (n==10)
  System.out.println("Matrícula de honor");

  if (n>7 && n<=9)	  
  System.out.println("Notable");
  
  if (n>6 && n<=7)  
  System.out.println("Bien");
  
  if (n>=5 && n<=6)  
  System.out.println("Suficiente");
  
  if (n>=0 && n<=4)  
  System.out.println("Insficiente");
	}

}
