
public class Persona {
	
	private String nome ;
	private String cognome;
	private String cf; 
	private int[] voti = {}; 
	
	public String stampa() {
		return nome+ " "+cognome+" ("+ cf+ ")"; 
	}
	
	
	public Persona(String nome, String cognome, String cf) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf= cf; 
		
		
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCf() {
		return cf;
	}


	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public void restVoti() {
		for(int v : this.voti ) {
			v=0;
			
			
		}
		
		
	}
	
	

}
