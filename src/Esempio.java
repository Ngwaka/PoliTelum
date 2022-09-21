import javax.swing.JOptionPane;

public class Esempio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cittadino rm = new Cittadino("Claude", "Ekango", "NGWCDN****306C");
		System.out.println(rm.stampa());
		System.out.println(new Cittadino("Ryan", "Ekango", "KNNGN****306F").stampa());
		System.out.println(new Persona("shasha", "Mikouoss", "MKSS***306F").toString());
		
		Persona p1 = new Persona("shasha", "Mikouoss", "MKSS***306F");
		Persona p2;
		
		p2=p1; 
		System.out.println(p2.getCf());
		System.out.println(p1.getCf());
		
		p1.setCf("AAAA*****BBBBB");
		
		System.out.println(p2.getCf());
		System.out.println(p1.getCf());
		
	}	

}
