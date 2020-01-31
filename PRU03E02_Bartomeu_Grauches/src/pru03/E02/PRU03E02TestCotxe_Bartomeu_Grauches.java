package pru03.E02;

public class PRU03E02TestCotxe_Bartomeu_Grauches {


	public static void main(String[] args) {
		
		//DECLARAM MARCA MODEL I CANVI DEL COTXU
		Cotxe cotxu1 = new Cotxe ("Audi", "A3", TipusCanvi.CanviManual);
		Cotxe cotxu2 = new Cotxe ("Renault", "Clio", TipusCanvi.CanviAutomatic);
		
		/*
		//Mètode d'excepcions per arrancar motor
		cotxu1.provaArrancarMotor();
		
		//Mètode per comprovar motor
		System.out.println ("El motor está " + cotxu1.comprovaMotor());
		
		//Mètode per comprovar revolucions
		System.out.println ("Les revolucions son: " + cotxu1.getRevolucions());
		
		//Excepcions per comprovar si el cotxe esta aturat
		cotxu1.provaAturarMotor();
		*/
		
		cotxu1.CanviarMarxaManual('+');
		cotxu1.CanviarMarxaManual('+');
		cotxu1.CanviarMarxaManual('+');
		cotxu1.CanviarMarxaManual('-');
	
	}
	
	

	
}

