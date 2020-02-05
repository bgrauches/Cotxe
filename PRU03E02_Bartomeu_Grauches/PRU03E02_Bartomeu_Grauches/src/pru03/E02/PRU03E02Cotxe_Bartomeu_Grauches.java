package pru03.E02;

public class PRU03E02Cotxe_Bartomeu_Grauches extends CotxeAbstracte  {
	
//Atribut per el metode arrancarMotor junt amb els getter i setter
	protected EstatsMotorCotxe estatMotor;
	public EstatsMotorCotxe getEstatMotor() {
		return estatMotor;
	}
	public void setEstatMotor(EstatsMotorCotxe estatMotor) {
		this.estatMotor = estatMotor;
	}
	
//Atribut per el metode getRevolucions junt amb els getter i setter
	
	//Posam que les revolucions posin un int random entre 1 i 6500
	protected int revolucions = (int)(Math.random()*6500+1);
	public void setRevolucions(int revolucions) {
		this.revolucions = revolucions;
	}
	public PRU03E02Cotxe_Bartomeu_Grauches(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
		this.estatMotor = EstatsMotorCotxe.Aturat;
	}
	
	
	

	@Override
	public void arrancarMotor() throws Exception {
		if(this.estatMotor == EstatsMotorCotxe.Aturat) {
			this.setEstatMotor(EstatsMotorCotxe.EnMarxa);
		}
		else {
			throw new Exception("El cotxe está encés");
		}
	}

	@Override
	public EstatsMotorCotxe comprovaMotor() {
		return this.getEstatMotor();
	}

	@Override
	public int getRevolucions() {
		if(this.estatMotor == EstatsMotorCotxe.Aturat){
			return 0;
		}
		else{
			return revolucions;
		}
	}

	@Override
	public void aturarMotor() throws Exception {
		if(this.estatMotor == EstatsMotorCotxe.EnMarxa) {
			this.setEstatMotor(EstatsMotorCotxe.Aturat);
		}
		else {
			throw new Exception("El cotxe está aturat");
		}
	}
	
	
	//METODE D'Excepcions per comprovar si el cotxe esta encés a la classe test
	public void provaArrancarMotor() {
		try {
			this.arrancarMotor();
		}
		catch(Exception cotxuArrancat) {
			System.out.println (cotxuArrancat.getMessage());
		}
		
		try {
			this.arrancarMotor();
		}
		catch(Exception cotxuArrancat) {
			System.out.println (cotxuArrancat.getMessage());
		}
		}
	
	//METODE D'Excepcions per comprovar si el cotxe esta aturat a la classe test
	public void provaAturarMotor() {
		try {
			this.aturarMotor();
		}
		catch(Exception cotxuAturat) {
			System.out.println (cotxuAturat.getMessage());
		}
		try {
			this.aturarMotor();
		}
		catch(Exception cotxuAturat) {
			System.out.println (cotxuAturat.getMessage());
		}
		}
	}

