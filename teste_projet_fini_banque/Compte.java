package MonPackage;

public class Compte {
	
	
		
		 private String Titulaire;
		 private int NumeroCompte;
		 private double SoldeCompte;
		 private double DecouvertAutorise;
		
		public Compte() 
		{
			Titulaire= Saisie.lire_String("Quel est le nom du client ?");
			NumeroCompte= Saisie.lire_int("Quel est le numéro de ce compte ?");
			SoldeCompte= Saisie.lire_double("Quel est le solde intitial ?");
			DecouvertAutorise= Saisie.lire_double("Quel est le montant du découvert autorisé ?");
		}
		
		public void Consulter () 
		{
			System.out.println("Le solde de votre compte est de " +Solde+ "€");
		} 
		
		public  void Depot (double Somme)
		{
			Solde = Solde +Somme;
			
		}
		public  void Retrait (double Somme)
		{
			if ((Solde -Somme)< DecouvertAutorise)
			{
				System.out.println("Retrait impossible");
			}
			else Solde= Solde-Somme;
			
			
		}
		
		public  void AfficheCompte()
		{
			System.out.println ("Client "+ Titulaire + " votre compte dont le num�ro est  "+NumeroCompte + "Pr�sente un solde de  "+Solde +" € ");
	        System.out.println("Votre d�couvert autoris� est de  " + DecouvertAutorise + " €");
	}

		public String getTitulaire() {
			return Titulaire;
		}

		public void setTitulaire(String titulaire) {
			Titulaire = titulaire;
		}

		public int getNumeroCompte() {
			return NumeroCompte;
		}

		public void setNumeroCompte(int num) {
			NumeroCompte = num;
		}

		public double getSoldeCompte() {
			return SoldeCompte;
		}

		public void setSolde(double solde) {
			SoldeCompte = solde;
		}

		public double getDecouvertAutorise() {
			return DecouvertAutorise;
		}

		public void setDecouvertAutorise(double decouvert) {
			DecouvertAutorise = decouvert;
		}

	}


	

