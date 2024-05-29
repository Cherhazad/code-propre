package ex2;

/**
 * Représente un compte bancaire de type compte épargne qui est un compte
 * bancaire spécifique et hérite donc de paramètres de cette classe mère
 * 
 */
/**
 * 
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * 
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Getter pour tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour tauxRemuneration
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Méthode qui permet de calculer le taux de rémunération du compte épargne
	 * Livret A
	 * 
	 */
	public double appliquerRemunerationAnnuelle() {

		if (type.equals("LA")) {
			solde = solde + solde * tauxRemuneration / 100;
		}
		return solde;
	}

	public void debiterMontant(double montant) {
//	else if (type.equals("LA")) {
		if (solde - montant >= 0) {
			solde = solde - montant;
		}

		else {
			System.out.println("Votre solde de compte Livret A n'est pas suffisant.");
		}
	}
}

//}
