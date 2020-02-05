package pru03.E02;

public class PRU03E02TestCotxe_Bartomeu_Grauches {


	public static void main(String[] args) {
		
		//DECLARAM MARCA MODEL I CANVI DEL COTXU
		PRU03E03Cotxe_Bartomeu_Grauches cotxu1 = new PRU03E03Cotxe_Bartomeu_Grauches ("Audi", "A3", TipusCanvi.CanviManual);
		PRU03E03Cotxe_Bartomeu_Grauches cotxu2 = new PRU03E03Cotxe_Bartomeu_Grauches ("Renault", "Clio", TipusCanvi.CanviAutomatic);
		
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
		
		/*
		 * CANVI AUTOMATIC
		 */
		
		//Endavant
		try {
			cotxu2.CanviarMarxaAutomatic('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Exception endavant
		try {
			cotxu2.CanviarMarxaAutomatic('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Baixar a punt neutre i enrera
		try {
			cotxu2.CanviarMarxaAutomatic('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu2.CanviarMarxaAutomatic('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Exception pasarse enrera
		try {
			cotxu2.CanviarMarxaAutomatic('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * CANVI MANUAL
		 */
		//Primera, Segona, Tercera, Cuarta, Cinquena i Sisena
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Exception de pasarse de marxa
		try {
			cotxu1.CanviarMarxaManual('+');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Baixar marxa a Cinquena, Cuara, Tercera, Segona, Primera i Punt mort i marxa
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Marxa enrera
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Exception pasarse de enrera
		try {
			cotxu1.CanviarMarxaManual('-');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	
}

