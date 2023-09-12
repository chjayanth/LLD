
public class idealstate implements state {
 
	public idealstate(){
	}
	@Override
	public void insertcashbutton(int x, vendingmachine v) {
		v.totalmoney=v.totalmoney+x;
		System.out.println("going to hasmoneystate");
		System.out.println(x+ "cash has been inserted.");
		v.s=new hasmoneystate();
		return;
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
	public void choosingtheproduct(int x, vendingmachine v) {
		System.out.println("invalid");
		return;

	}

	@Override
	public void dispachproductsbutton(vendingmachine v) {
		System.out.println("invalid");
		return;

	}

}
