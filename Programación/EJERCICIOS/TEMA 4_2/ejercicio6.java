import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);
        
		int dia;
		int mes;
		int a�o;
        
 System.out.println("Introduce un dia");
 dia = entrada.nextInt(); 
 
 System.out.println("Introduce un mes");
 mes = entrada.nextInt(); 
 
 System.out.println("Introduce un a�o");
 a�o = entrada.nextInt(); 
 
  if (dia>=1 && dia<=30) {
	 
  
	  if (mes>=1 && mes<=12) {

		  
		  if (a�o>=1 && a�o<=2017) {
				 System.out.println("La fecha es correcta");
				  
			  } else {
				
			      System.out.println("La fecha es incorrecta, a�o incorrecto");

			  }
		  
		  
	  }else {
		
	      System.out.println("La fecha es incorrecta, mes incorrecto");

	  }
	
	  
	  
  }  else {
	  
	  System.out.println("La fecha es incorrecta, dia incorrecto");
  }
  
 
  }
  
  
  
	}


