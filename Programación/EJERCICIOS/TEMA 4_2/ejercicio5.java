import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);
        
		int a;
        
 System.out.println("Introduce un numero");
 a = entrada.nextInt(); 
 
  if (a<=9)
  System.out.println("Tiene una cifra");
  
  if (a>=10 && a<=99) 
	  System.out.println("Tiene dos cifras");
  
  if (a>=100 && a<=999)
	  System.out.println("Tiene tres cifras");
  
  if (a>=999 && a<=9999) 
System.out.println("Tiene cuatro cifras");
  
	}

}
