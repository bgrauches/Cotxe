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
	
	//Getters i setters marca, model i tipus de canvi
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public TipusCanvi getTipuscanvi() {
			return tipuscanvi;
		}
		public void setTipuscanvi(TipusCanvi tipuscanvi) {
			this.tipuscanvi = tipuscanvi;
		}
		


	public Cotxe(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);

		//Posam que tan l'auomatic com el manual estiguin en marxa neutra.
		this.mAuto = CanviarMarxaAutomatic.N;
		this.mManual = CanviarMarxaManual.N;
		
	}
	
	//MÈTODE PER PUJAR I BAIXAR MARXES AUTOMATIQUES
	public void CanviarMarxaAutomatic (char mesmenys) {
		System.out.println ("El cotxe está en marxa "+ mAuto);
		if(this.getTipuscanvi() == TipusCanvi.CanviAutomatic) {
			System.out.println ("El cotxe está en marxa "+ mAuto);
			if (mesmenys == '+') {
				if (this.getmAuto() == CanviarMarxaAutomatic.N) {
					this.mAuto = CanviarMarxaAutomatic.F;
					System.out.println ("El cotxe está en marxa "+ mAuto);
				}
				
			}
			
			if (mesmenys == '-') {
				if (this.getmAuto() == CanviarMarxaAutomatic.N) {
					this.mAuto = CanviarMarxaAutomatic.R;
					System.out.println ("El cotxe está en marxa "+ mAuto);
				}
				
			}
		}
	}

	//MÈTODE PER PUJAR I BAIXAR MARXES MANUALS
	public void CanviarMarxaManual(char mesmenys){
		if(this.getTipuscanvi() == TipusCanvi.CanviManual) {
			System.out.println ("El cotxe está en marxa "+ mManual);
			//Si el char es '+' pujará una marxa
			if (mesmenys == '+') {
				if (this.getmManual() == CanviarMarxaManual.N) {
					this.mManual = CanviarMarxaManual.Primera;
				}
				else if (this.getmManual() == CanviarMarxaManual.Primera) {
					this.mManual = CanviarMarxaManual.Segona;
				}
				else if (this.getmManual() == CanviarMarxaManual.Tercera) {
					this.mManual = CanviarMarxaManual.Quarta;
				}
				else if (this.getmManual() == CanviarMarxaManual.Quarta) {
					this.mManual = CanviarMarxaManual.Cinquena;
				}
				else if (this.getmManual() == CanviarMarxaManual.Cinquena) {
					this.mManual = CanviarMarxaManual.Sisena;
				}
			}
		}
		
			//Si el char es '-' pujará una marxa
			if (mesmenys == '-') {
				if (this.getmManual() == CanviarMarxaManual.Sisena) {
					this.mManual = CanviarMarxaManual.Cinquena;
				}
				else if (this.getmManual() == CanviarMarxaManual.Cinquena) {
					this.mManual = CanviarMarxaManual.Quarta;
				}
				else if (this.getmManual() == CanviarMarxaManual.Quarta) {
					this.mManual = CanviarMarxaManual.Tercera;
				}
				else if (this.getmManual() == CanviarMarxaManual.Tercera) {
					this.mManual = CanviarMarxaManual.Segona;
				}
				else if (this.getmManual() == CanviarMarxaManual.Segona) {
					this.mManual = CanviarMarxaManual.Primera;
				}
				else if (this.getmManual() == CanviarMarxaManual.Primera) {
					this.mManual = CanviarMarxaManual.N;
				}
				else if (this.getmManual() == CanviarMarxaManual.N) {
					this.mManual = CanviarMarxaManual.R;
				}
			}
		}
}	

