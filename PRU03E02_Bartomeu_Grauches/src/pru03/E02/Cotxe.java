package pru03.E02;

public class Cotxe extends PRU03E02Cotxe_Bartomeu_Grauches {
	
	//Variables de marxes automatic i manual amb els getters i setters.
	private CanviarMarxaAutomatic mAuto;
	private CanviarMarxaManual mManual;
	
	public CanviarMarxaAutomatic getmAuto() {
		return mAuto;
	}
	public void setmAuto(CanviarMarxaAutomatic mAuto) {
		this.mAuto = mAuto;
	}

	public CanviarMarxaManual getmManual() {
		return mManual;
	}
	public void setmManual(CanviarMarxaManual mManual) {
		this.mManual = mManual;
	}


	public Cotxe(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);

		//Posam que tan l'auomatic com el manual estiguin en marxa neutra.
		this.mAuto = CanviarMarxaAutomatic.N;
		this.mManual = CanviarMarxaManual.N;
		
	}

	public void CanviarMarxManual() {
		
		
		
	}
	
	public void CanviarMarxaAutomatic() {
		
	}
	
}
