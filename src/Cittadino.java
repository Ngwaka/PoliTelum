
public class Cittadino {
	
	
	private String nome ;
	private String cognome;
	private String cf; 
	
	public String stampa() {
		return nome+ " "+cognome+" ("+ cf+ ")"; 
	}
	
	
	public Cittadino(String nome, String cognome, String cf) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf= cf;
		
	}
	
	
	
	

}
