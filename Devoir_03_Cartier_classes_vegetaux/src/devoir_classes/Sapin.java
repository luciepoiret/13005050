package devoir_classes;

public class Sapin extends Vegetal {
	protected boolean feuillu = false;
	protected boolean épine = true;

	public Sapin(String type, String branches, String fruit, int hauteur) {
		super(type, branches, fruit, hauteur);
		
			}
	public void presente () {
		super.presente();
		String nature = (feuillu) ? "feuillu" : "conifère";
		String nature_des_feuilles = (épine) ? "épines" : "feuilles" ;
		System.out.println("Je suis de plus un " + nature + ".");
		System.out.println("Enfin, contrairement à de nombreux autres arbres, j'ai des " + nature_des_feuilles + " que ne je perds pas en hiver !");
	}

}
