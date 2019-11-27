package devoir_classes;

public class sequoia extends Vegetal {
	protected boolean feuillu = true;
	protected int longévité = 1000;
	protected String taille = "des arbres gigantesques";
	protected int gigantesque = 83;
	protected String Sherman = "General Sherman";
	protected String US = "Etats-Unis d'Amérique";
	

	public sequoia(String type, String branches, String fruit, int hauteur) {
		super(type, branches, fruit, hauteur);
	}
	public void presente() {
		super.presente();
		String nature = (feuillu) ? "feuillu" : "conifère";
		System.out.println("Je suis de plus un " + nature + ".");
		int longévité = (1000);
		System.out.println("Qui plus est, nous autres pouvons vivre plus de " + longévité + " ans, le plus vieux d'entre nous ayant 2200 ans !" );
		String taille = ("des arbres gigantesques");
		String US = ("Etats-Unis d'Amérique");
		String Sherman = ("General Sherman");
		System.out.println("Enfin, il est important de noter que nous autres sommes " + taille + ", notre plus grand représentant se trouvant aux " + US + " et se nommant ‘" + Sherman +"‘.");
		
	}

}
