public class Repas{
	private int numero ;
	private LocalDate date ;

	public Repas(int numero, LocalDate date){
	 this.numero = numero ;
	 this.date = date ;
	}
	public int getNumero(){
		return numero ;
	}
	public void setNumero(int Numero){
		this.numero = numero ;
	}

	public LocalDate getDate() {
		return date ; 
	}

	public void setDate(LocalDate date) {
		this.date = date ;
	}

}

