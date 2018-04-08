
public class rectangulo {

	// Variables
	private double base, altura;

	// contructor por defecto

	public rectangulo() {
		this.base = 0;
		this.altura = 0;

	}

	// constructor por parametros

	public rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	// métodos get y set

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void area (double area) {
		area = this.base * this.altura;
	}	
	
    public void perimetro (double perimetro) {
	    perimetro = this.altura + this.altura + this.base +this.base;		
    }
		
    public void diagonal (double diagonal) {
		diagonal = Math.sqrt((this.base * this.base) + (this.altura * this.altura));
	}
    
    public void invierte (double invierte) {
		double variableExtra = 0;
		variableExtra = this.base;
		this.altura = variableExtra; 
		this.base = this.altura;
    }
    
    public void porcentaje (double porcentaje) {
    	
    	
        }		
    }
		