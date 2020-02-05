package pru03.E02;

public class PRU03E03Cotxe_Bartomeu_Grauches extends PRU03E02Cotxe_Bartomeu_Grauches {
	
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
		


	public PRU03E03Cotxe_Bartomeu_Grauches(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);

		//Posam que tan l'automatic com el manual estiguin en marxa neutra.
		this.mAuto = CanviarMarxaAutomatic.N;
		this.mManual = CanviarMarxaManual.N;
		
	}
	
	//MÈTODE PER PUJAR I BAIXAR MARXES AUTOMATIQUES
	public void CanviarMarxaAutomatic (char mesmenys) throws Exception{
		if(this.getTipuscanvi() == TipusCanvi.CanviAutomatic) {
			//Si el char es '+' es posará endavant i en cas de que es torni a posar botará la excepcio de que ja va endavant
			if (mesmenys == '+') {
				if (this.getmAuto() == CanviarMarxaAutomatic.R) {
					this.mAuto = CanviarMarxaAutomatic.N;
					System.out.println ("El cotxe está en punt neutre");
				}
				if (this.getmAuto() == CanviarMarxaAutomatic.N) {
					this.mAuto = CanviarMarxaAutomatic.F;
					System.out.println ("El cotxe va endavant");
				}
				else if (this.getmAuto() == CanviarMarxaAutomatic.F) {
					throw new Exception ("El cotxe ja está anant endavant");
				}
			}
			
			//Si el char es '-' es posara una marxa enrera i en cas de tornar a posar enrera estant en R botará la excepcio de que ja esta marxa enrera
			else if (mesmenys == '-') {
				if (this.getmAuto() == CanviarMarxaAutomatic.F) {
					this.mAuto = CanviarMarxaAutomatic.N;
					System.out.println ("El cotxe está en punt neutre");
				}
				if (this.getmAuto() == CanviarMarxaAutomatic.N) {
					this.mAuto = CanviarMarxaAutomatic.R;
					System.out.println ("El cotxe está marxa enrera");
				}
				else if (this.getmAuto() == CanviarMarxaAutomatic.R) {
					throw new Exception ("No se pot baixar de marxa estant marxa enrera");
				}
			}
		}
	}

	//MÈTODE PER PUJAR I BAIXAR MARXES MANUALS
	public void CanviarMarxaManual(char mesmenys) throws Exception{
		if(this.getTipuscanvi() == TipusCanvi.CanviManual) {
			//Si el char es '+' pujará una marxa
			if (mesmenys == '+') {
				if (this.getmManual() == CanviarMarxaManual.R) {
					this.mManual = CanviarMarxaManual.N;
					System.out.println ("El cotxe está en punt neutre");
				}
				if (this.getmManual() == CanviarMarxaManual.N) {
					this.mManual = CanviarMarxaManual.Primera;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Primera) {
					this.mManual = CanviarMarxaManual.Segona;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Segona) {
					this.mManual = CanviarMarxaManual.Tercera;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Tercera) {
					this.mManual = CanviarMarxaManual.Quarta;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Quarta) {
					this.mManual = CanviarMarxaManual.Cinquena;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Cinquena) {
					this.mManual = CanviarMarxaManual.Sisena;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				//Aqui botará la excepcio quan no es pot pasar de sexta marxa
				else if (this.getmManual() == CanviarMarxaManual.Sisena) {
					throw new Exception ("No hi ha sètima marxa");
				}
			}
		
			//Si el char es '-' baixará una marxa
			else if (mesmenys == '-') {
				if (this.getmManual() == CanviarMarxaManual.Sisena) {
					this.mManual = CanviarMarxaManual.Cinquena;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Cinquena) {
					this.mManual = CanviarMarxaManual.Quarta;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Quarta) {
					this.mManual = CanviarMarxaManual.Tercera;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Tercera) {
					this.mManual = CanviarMarxaManual.Segona;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Segona) {
					this.mManual = CanviarMarxaManual.Primera;
					System.out.println ("El cotxe está en "+ mManual +" marxa");
				}
				else if (this.getmManual() == CanviarMarxaManual.Primera) {
					this.mManual = CanviarMarxaManual.N;
					System.out.println ("El cotxe está en punt neutre");
				}
				else if (this.getmManual() == CanviarMarxaManual.N) {
					this.mManual = CanviarMarxaManual.R;
					System.out.println ("El cotxe está marxa enrera");
				}
				//Aqui botará la excepcio quan no es pot baixar marxa estant marxa enrera
				else if (this.getmManual() == CanviarMarxaManual.R) {
					throw new Exception ("No se pot baixar de marxa estant marxa enrera");
				}
			}	
		}
	}							
}	

