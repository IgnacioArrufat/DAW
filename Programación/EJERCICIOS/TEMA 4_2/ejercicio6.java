import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);
        
		int dia;
		int mes;
		int año;
        
 System.out.println("Introduce un dia");
 dia = entrada.nextInt(); 
 
 System.out.println("Introduce un mes");
 mes = entrada.nextInt(); 
 
 System.out.println("Introduce un año");
 año = entrada.nextInt(); 
 
  if (dia>=1 && dia<=30) {
	 
  
	  if (mes>=1 && mes<=12) {

		  
		  if (año>=1 && año<=2017) {
				 System.out.println("La fecha es correcta");
				  
			  } else {
				
			      System.out.println("La fecha es incorrecta, año incorrecto");

			  }
		  
		  
	  }else {
		
	      System.out.println("La fecha es incorrecta, mes incorrecto");

	  }
	
	  
	  
  }  else {
	  
	  System.out.println("La fecha es incorrecta, dia incorrecto");
  }
  
 
  }
  
  
  
	}


