package pru03.E02;

public class PRU03E02TestCotxe_Bartomeu_Grauches {


	public static void main(String[] args) {
		
		//DECLARAM MARCA MODEL I CANVI DEL COTXU
		PRU03E02Cotxe_Bartomeu_Grauches cotxu1 = new PRU03E02Cotxe_Bartomeu_Grauches ("Audi", "A3", TipusCanvi.CanviManual);
		
		//M�tode d'excepcions per arrancar motor
		cotxu1.provaArrancarMotor();
		
		//M�tode per comprovar motor
		System.out.println ("El motor est� " + cotxu1.comprovaMotor());
		
		//M�tode per comprovar revolucions
		System.out.println ("Les revolucions son: " + cotxu1.getRevolucions());
		
		//Excepcions per comprovar si el cotxe esta aturat
		cotxu1.provaAturarMotor();
	}
	
}

