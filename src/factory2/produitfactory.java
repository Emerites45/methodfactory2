package factory2;

public abstract class produitfactory {

	
	 public produitA getproduitA() {
		 return createproduitA();
	 }
	 
	 protected abstract produitA createproduitA(); 
	public produitfactory() {
		// TODO Auto-generated constructor stub
	}

}
