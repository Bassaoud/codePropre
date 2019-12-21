package ex2;

/** Compte bancaire (type=CC)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	
	/** Le type est soit un Compte courant(CC) ou un Livret A(LA) */
	private String type;
	
	/** constructeur CompteBancaire
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/** Ajoute montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Debite montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
	
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
		
	}
	
	/** Retourne le type de compte CC */
	public String getType() {
		return "CC";
	}
	
	/** Retourne le solde 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Affiche le solde
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Retourne le decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Affiche le decouvert
	 * @param decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
}
