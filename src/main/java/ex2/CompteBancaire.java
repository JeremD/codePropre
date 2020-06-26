package ex2;

/**
 * Compte bancaire de type compte courant
 * 
 * @author DIGINAMIC, Jeremy
 */
public class CompteBancaire {

	/** solde du compte */
	protected double solde;

	/** valeur du decouvert */
	protected double decouvert;

	/** type de compte */
	public static final String TYPE_COMPTE = "Compte courant";

	/**
	 * Constructeur
	 * 
	 * @param solde     solde du compte
	 * @param decouvert découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajouter un montant du compte
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débiter un montant du compte
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
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
