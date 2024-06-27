package MonPackage;
import java.util.*;
import java.util.ArrayList;

public class PortefeuilleClient {
	

	
	private ArrayList<Compte> CollectComptes;
	private int nbr;
	
	
	public PortefeuilleClient()
	{
		CollectComptes = new ArrayList<Compte>();
		nbr = 0;
	}
	


	public ArrayList<Compte> getCollectComptes() {
		return CollectComptes;
	}

	public void setCollectComptes(ArrayList<Compte> collectComptes) {
		CollectComptes = collectComptes;
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	} 
	
	// autres methodes 
	
	public void AjouteObjet (int n)
	{
		for (int I = 0; I<n; I++)
		{
			Compte UnCompte = new Compte();
			CollectComptes.add(UnCompte);
			nbr++;
					
			
		}
			
	}
	
	public void AfficheTout()
	{
		System.out.println("voici la liste de vos clients :");
		ListIterator it = CollectComptes.listIterator();
		while (it.hasNext())
		{
			Object Obj = it.next();
			Compte UnCompte = (Compte) Obj;
			UnCompte.AfficheCompte();
			
		}
	}
	

}
