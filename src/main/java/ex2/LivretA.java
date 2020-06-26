package ex2;

/**
 * Compte bancaire de type livret A
 * 
 * @author DIGINAMIC, Jeremy
 */
public class LivretA extends CompteBancaire {

	/** taux de rémunération */
	protected double tauxRemuneration;

	/** type de compte */
	public static final String TYPE_COMPTE = "Livret A";

	/**
	 * Constructeur
	 * 
	 * @param solde            solde du compte
	 * @param decouvert        découvert autorisé
	 * @param tauxRemuneration taux de rémunération
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Débiter un montant du Livret A
	 * 
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Appliquer une rémunération annuelle
	 */
	public void appliquerRemunerationAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public String getType() {
		return TYPE_COMPTE;
	}

}
