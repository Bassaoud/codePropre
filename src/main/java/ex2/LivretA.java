package ex2;

/** Livret A (LA)
 * @author DIGINAMIC
 */

public class LivretA extends CompteBancaire {

	/** tauxRemuneration */
	private double tauxRemuneration;
	
	/**
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
	 * Calcul le nouveau solde
	 */
	public void appliquerRemuAnnuelle(){
		double RemuAnnuelle = this.getSolde()+this.getSolde()*this.tauxRemuneration/100;
		this.setSolde(RemuAnnuelle);

	}

	
	/** Ajouter un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde()-montant);
		}	
	}
	
	/**
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Retourne taux de rémunération
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}