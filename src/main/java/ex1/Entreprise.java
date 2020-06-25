package ex1;

import java.util.Date;

/**
 * Représente les coordonées d'une entreprise
 * 
 * @author Jeremy
 *
 */
public class Entreprise {

	/** siret */
	public int siret;
	
	/** nom */
	public String nom;
	
	/** adresse */
	public String adresse;
	
	/** date de création */
	public Date dateCreation;
	
	/** capital maximal */
	public static final int CAPITAL_MAX = 3_000_000;
	
	/**
	 * Afficher les informations de l'entreprise
	 */
	public String afficherStatut() {
		return "Siret : " + this.siret + ", Nom : " + this.nom + ", Adresse : " + this.adresse + ", Date de création : " + this.dateCreation;
	}
	
}
