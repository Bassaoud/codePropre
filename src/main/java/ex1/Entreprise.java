package ex1;

import java.util.Date;

public class Entreprise {
	/** le numero de Siret de l'entreprise*/
	public int siret;
	/** le nom de l'entreprise*/
	public String nom;
	/** l'adresse de l'entreprise*/
	public String adresse;
	/** la date de création de l'entreprise*/
	public Date dateCreation;
	
	/** le capital maximum de l'entreprise*/
	public static final int capitalMax = 3000000;
	
	/** Le constructeur Entreprise
	 * 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param date_Creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}
	
	/** Affiche le statut*/
	public void AfficherStatut(){
		
	}
	
	/**
	 * @return le siret
	 */
	public int getSiret() {
		return siret;
	}
	/**
	 * @param le siret 
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}
	/**
	 * 
	 * @return le nom
	 */

	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param le nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * 
	 * @return l'adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * 
	 * @param l'adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * 
	 * @return la date de creation de l'entreprise
	 */
	public Date getDate_Creation() {
		return dateCreation;
	}
	/**
	 * 
	 * @param dateCreation
	 */
	public void setDate_Creation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * 
	 * @return le capital maximum
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}
	
}
