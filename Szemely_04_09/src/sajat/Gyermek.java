package sajat;

public class Gyermek extends Szemely {
	private String iskola;

	public Gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}	
	
	@Override
	public String toString() {
		return "Gyermek [" + super.toString()+ ", iskola: " + getIskola() + "]";
	}

	public String getIskola() {
		return iskola;
	}	
}