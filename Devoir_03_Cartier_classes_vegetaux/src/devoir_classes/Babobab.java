package devoir_classes;

public class Babobab extends Plus_gros_Baobab implements Feuillu {
	private String nom;
	protected String cavité = "« fausse cavité »";
	
	public Babobab(String type, String branches, String fruit, int hauteur) {
		super(type, branches, fruit, hauteur);
		feuillu(nom);
	}

	@Override
	public void feuillu(String nom) {
		feuillu = true;
		this.nom = nom;
		
	}

	@Override
	public String nom() {
		return this.nom;
	}
	public void cavite() {
		String cavité = "« fausse cavité »";
		System.out.println("De plus, nous autres avons une croissance unique de nos troncs qui résulte de la fusion de plusieurs troncs organisés en cercle et laissant en leur centre une " + cavité+", à l'intérieure de laquelle il est parfois possible de rentrer !");	
	}
}
