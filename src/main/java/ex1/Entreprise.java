package ex1;

import java.util.Date;

public class Entreprise {

	/** Siret **/
	private int Siret;
	/** Nom **/
	private String Nom;
	/** adresse **/
	private String adresse;
	/** dateCreation **/
	private Date dateCreation;

	/** capitalMax **/
	public static final int capitalMax = 3000000;

	/**
	 * Constructeur
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		Siret = siret;
		Nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Getter pour siret
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return Siret;
	}

	/**
	 * Setter pour siret
	 * 
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		Siret = siret;
	}

	/**
	 * Getter pour nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	/**
	 * Getter pour adresse
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter pour adresse
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter pour dateCreation
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter pour dateCreation
	 * 
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
