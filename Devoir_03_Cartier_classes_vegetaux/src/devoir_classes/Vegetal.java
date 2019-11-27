package devoir_classes;

public abstract class Vegetal {
	private String famille;
	private String nbr_de_branches;
	private String Fruit;
	private int Hauteur;
	
	public Vegetal(String type, String branches, String fruit, int hauteur) {
		famille = type;
		nbr_de_branches = branches;
		Fruit = fruit;
		Hauteur = hauteur;
	}
	
	public void presente() {
		System.out.println("Je suis un représentant de la famille des" + famille + "et j'ai" + nbr_de_branches + "de branches, mon fruit est le" + Fruit + ", et je fais " + Hauteur + " mètres de haut en moyenne !");
	}

	

}
