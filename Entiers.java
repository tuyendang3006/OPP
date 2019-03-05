package TP1;

public class Entiers {
	private int tableau[];
	private int tailleTableau;
	private int nombreElement;

	/**
	 * Constructeur
	 * @param taille
	 */
	public Entiers(int taille) {
		// TODO Auto-generated constructor stub
		this.tailleTableau = taille;
		this.tableau = new int[taille];
		this.nombreElement = 0;
	}

	/**
	 * insere un element dans la pile ordonnée
	 * @param element element a inserer dans la pile
	 */
	public void inserer (int element){
		int place = 0;
		int i = 0;
		boolean existe = false;

		// trouve la place ou mettre l'element
		while (i < this.nombreElement){
			if (element == this.tableau[i]) existe = true;
			if (element > this.tableau[i]) place = i+1;
			i++;
		}

		if (existe != true) {


			if (this.plein()){
				System.out.println("tableau plein");
			} else {

				// décale ce qui est après l'element
				for (int j = this.nombreElement ; j>place ; j--){
					this.tableau[j] = this.tableau[j-1];
				}

				this.tableau[place] = element;
				this.nombreElement++;
			}
		} else {
			System.out.println("l' element existe déjà");
		}
	}		



	/**
	 * supprime un élément de la pile ordonée
	 * @param element l'élément a supprimer
	 */
	public void supprimer (int element){
		int place = this.place(element);
		if (place != -1) {
			if (place < this.nombreElement){
				for (int j = place ; j < this.nombreElement ; ++j) {
					this.tableau[j] = this.tableau[j+1];
				}
				this.nombreElement--;
			}
		} else {
			System.out.println("la valeur existe pas");
		}
	}

	/**
	 * teste si l'élément existe
	 * @param element a tester
	 * @return true : l'élement existe, false : l'élément n'existe pas
	 */
	public boolean existe (int element){
		for (int i=0; i < this.nombreElement; i++){
			if (this.tableau[i] == element) return true;
		}
		return false;

	}

	/**
	 * trouve la place d'un élement
	 * @param element renvoi la place d'un élément dans la pile
	 * @return
	 */
	public int place (int element){
		for (int i=0; i < this.nombreElement; i++){
			if (this.tableau[i] == element) return  i;
		}
		return -1;
	}

	/**
	 * teste si la pile est pleine
	 * @return true -> pile pleine false -> pile non pleine
	 */
	public boolean plein (){
		return this.nombreElement == this.tailleTableau;
	}


	public void print (){
		for (int i = 0; i < this.nombreElement; i++){
			System.out.print(this.tableau[i]+ " -> ");
		}
		System.out.println();
	}


	public int[] getTableau() {return tableau;}

	public int getTailleTableau() {return tailleTableau;}

	public int getNombreElement() {return nombreElement;}

	public void setTableau(int[] tableau) {this.tableau = tableau;}

	public void setTailleTableau(int tailleTableau) {this.tailleTableau = tailleTableau;}

	public void setNombreElement(int nombreElement) {this.nombreElement = nombreElement;}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entiers pile = new Entiers(10);

		System.out.println("1)");
		pile.inserer(1);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


		System.out.println("2)");
		pile.inserer(1);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


		System.out.println("3)");
		pile.inserer(99);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


		System.out.println("4)");
		pile.inserer(777);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


		System.out.println("5)");
		pile.supprimer(99);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


		System.out.println("6)");
		pile.inserer(99);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();
		
		System.out.println("7)");
		pile.supprimer(8888);
		System.out.print("PILE : ");
		pile.print();
		System.out.println("Nombre d'élément : " + pile.getNombreElement());
		System.out.println();


	}

}
