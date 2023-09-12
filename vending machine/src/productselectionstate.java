
public class productselectionstate implements state {
	public productselectionstate(){}
	@Override
	public void insertcashbutton(int x, vendingmachine v) {
		System.out.println("invalid");

	}

	@Override
	public void cancelrefund(vendingmachine v) {
		v.s=new idealstate();
		System.out.println("going to idealstate");
		System.out.println("canceled refund.");
		v.totalmoney=0;
		return;

	}

	@Override
	public void selectproductbutton(vendingmachine v) {
		System.out.println("invalid");
		return;

	}

	@Override
	public void choosingtheproduct(int itemno, vendingmachine v) {
		v.s=new productselectionstate();
		System.out.println("staying in productselectionstate");
		v.additemtobasket(itemno);
		return;
		
	}

	@Override
	public void dispachproductsbutton(vendingmachine v) {
		System.out.println("going to idealstate");
		v.s=new idealstate();
		v.dispachproducts();
		return;

	}

}
