package factory2;

public class produitfactory2  extends produitfactory{

	public produitfactory2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected produitA createproduitA() {
		return new produitA2();
	}

}
