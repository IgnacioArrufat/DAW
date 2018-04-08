import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada	= new Scanner(System.in);

		double a;
		double b;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		int m;
		
				
System.out.println("Escribe un numero");
  a = entrada.nextDouble(); 
  
System.out.println("Escribe un numero");
  b = entrada.nextDouble();
  
System.out.println("Elige una opcion suma, resta, multiplicacion, division");
m = entrada.nextInt();
switch (m) { 

case 1:
suma=(a+b);
System.out.println("Resultado: " + suma);
break;

case 2:
resta=(a-b); 
System.out.println("Resultado: " + resta);
break;

case 3:
multiplicacion=(a*b); 
System.out.println("Resultado: " + multiplicacion);
break;

case 4:
division=(a/b); 
System.out.println("Resultado: " + division);
break;

default: 
System.out.println("No existe la opcion");
break;
}
	}

}
