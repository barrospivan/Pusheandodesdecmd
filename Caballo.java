package Ejercicio1;

public class Caballo {

	private String Raza;
	private String Color;
	private String Sexo;
	
	public Caballo(String raza, String color, String sexo) {
		super();
		Raza = raza;
		Color = color;
		Sexo = sexo;
	}
	
	public void corre(){
		System.out.println("Soy una bala!!");
	}
	
	public void come() {
		System.out.println("Mmm que rico!");
	}

	@Override
	public String toString() {
		return "Caballo [Raza=" + Raza + ", Color=" + Color + ", Sexo=" + Sexo + "]";
	}
	
	
}
