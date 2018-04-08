import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada	= new Scanner(System.in);

		double p;
		double a;
		double IMC;
				
System.out.println("Introduce peso de la persona");
  p = entrada.nextDouble(); 
  
System.out.println("Introduce Altura de la persona");
  a = entrada.nextDouble();
  
  IMC=(p/a*a);
  
  if (IMC<=16)
System.out.println("Criterio de ingreso en el hospital");

  if (IMC>16 && IMC<=17)
System.out.println("Infrapeso");
  
  if (IMC>17 && IMC<=18)  
System.out.println("Bajo peso");
  
  if (IMC>18 && IMC<=25)  
System.out.println("Peso normal");
  
  if (IMC>25 && IMC<=30)  
System.out.println("Sobrepeso obesidad de grado I");
  
  if (IMC>30 && IMC<=35)  
System.out.println("Sobrepeso cronico obesidad de grado II");
  
  if (IMC>35 && IMC<=40)  
System.out.println("Obesidad premorbida obesidad de grado III");

  if (IMC>40)  
System.out.println("Obesidad morbida obesidad de grado IV"); 
	
	}

}
