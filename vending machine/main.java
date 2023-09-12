
public class main {

	public static void main(String[] args) {
		item a=new item("cococola",20);
		item b=new item("lays chips",20);
		item c=new item("kurkure",30);
		item d=new item("mirinda",30);
		vendingmachine v=new vendingmachine();
		//items are added to the machine.
		v.additemtoinventory(0, a);
		v.additemtoinventory(0, a);
		v.additemtoinventory(0, a);
		v.additemtoinventory(0, a);
		v.additemtoinventory(0, a);
		v.additemtoinventory(1, b);
		v.additemtoinventory(1, b);
		v.additemtoinventory(1, b);
		v.additemtoinventory(2, c);
		v.additemtoinventory(2, c);
		v.additemtoinventory(3, d);
		
		
		v.s.insertcashbutton(10, v);
		v.s.insertcashbutton(100, v);
		v.s.insertcashbutton(30, v);
		v.s.selectproductbutton( v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(1, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(1, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(0, v);
		v.s.choosingtheproduct(1, v);
		
		v.s.dispachproductsbutton(v);
	}

}
