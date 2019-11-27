package devoir_classes;

public class Plus_gros_Baobab extends Vegetal {
	protected boolean feuillu = true;
	protected int longévité = 3000;
	protected String au_sol = "au sol";
	protected String lourde = "lourde";

	public Plus_gros_Baobab(String type, String branches, String fruit, int hauteur) {
		super(type, branches, fruit, hauteur);
		}
	public void presente() {
		super.presente();
		String nature = (feuillu) ? "feuillu" : "conifère";
		System.out.println("Je suis de plus un " + nature + ".");
		int longévite = (3000);
		System.out.println("Qui plus est, j'ai vécu " + longévite + " ans ! En effet, certains botanistes théorisent que quelques Baobabs pourraient avoir jusqu'à 6000 ans !");
		String au_sol = ("au sol");
		String lourde = ("lourdes");
		System.out.println("Enfin, une de mes branche est tellement "+ lourde + " qu'elle traine " + au_sol + " !" );
	}

}
