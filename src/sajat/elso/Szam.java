package sajat.elso;
 class Szam {
	private static double tures = 0.001;
	private double valosSzam;
	public Szam(double valosSzam) {
		
		this.valosSzam = valosSzam;
		
	}
	
	public boolean valoSzamTuresenBelulVanE(double valosSzam) {
		return Math.abs(this.valosSzam-valosSzam) < tures;
	}
	
	
}
