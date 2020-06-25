package ex2;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}

	/**
	 * Ajouter un montant au solde
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

}
