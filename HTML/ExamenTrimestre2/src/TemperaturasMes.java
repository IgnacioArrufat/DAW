

public class TemperaturasMes {
	//Variables de instancia
	int numeroDiaMes;
	String diaSemana;
	double temperaturaMedia;

	// Constructor
	public TemperaturasMes(int numeroDiaMes) {
		this.numeroDiaMes = numeroDiaMes;
	}
		
	// Constructor
	public TemperaturasMes(int numeroDiaMes, String diaSemana, double temperaturaMedia) {
		this.numeroDiaMes = numeroDiaMes;
		this.diaSemana = diaSemana;
		this.temperaturaMedia = temperaturaMedia;
	}
	
	// Getters y Setters
	public int getDiaMes(){
		return numeroDiaMes;
	}
	
	public String getDiaSemana(){
		return diaSemana;
	}
	
	public double getTemperaturaMedia(){
		return temperaturaMedia;
	}
	
	public void setDiaMes(int numeroDiaMes){
		this.numeroDiaMes = numeroDiaMes;
	}
	
	public void setDiaSemana(String diaSemana){
		this.diaSemana = diaSemana;
	}
	
	public void setTemperaturaMedia(double temperaturaMedia){
		this.temperaturaMedia = temperaturaMedia;
	}
	
	// Sobrecarga del método equals de la clase Object
	public boolean equals(Object object) {
		boolean igual = false;

		if (object instanceof TemperaturasMes) {
			TemperaturasMes temperatura = (TemperaturasMes) object;
			if (temperatura.getDiaMes() == this.getDiaMes())
				igual = true;
		}
		return igual;
	}
}
