package MonPackage;

public class ProgConseiller {

	public static void main(String[] args) 
	{
		int n;
		boolean TestVide;
		n = Saisie.lire_int("Combien de Comptes voulez vous créer");
		
		 PortefeuilleClient MonPortefeuille = new PortefeuilleClient();
		 
		 // creation de la collection 
		 MonPortefeuille.AjouteObjet(n);
		 // Affiche de tous les objets de la collection 
		 MonPortefeuille.AfficheTout();
		 //  Test pour savoir si 



		//tesete git
		
	}

}
