package ex3;

public class Animal {

	/** nom **/
	private String nom;
	/** type **/
	private String type;
	/** comportement **/
	private String comportement;
	
	/** Constructeur
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour type
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/** Setter pour type
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** Getter pour comportement
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/** Setter pour comportement
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	
	
}
