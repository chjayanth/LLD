import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




public class vendingmachine {
	state s;
	int totalmoney;
	Map<Integer,item> m; //integer to item map .
	Map<item,Integer> countmap; //how may of such are present.
	ArrayList<item> arr;  //basket
	public vendingmachine(){
		s=new idealstate();
		totalmoney=0;
		arr=new ArrayList<item>();
		m=new HashMap<Integer,item>();
		countmap=new HashMap<item,Integer>();
	}
	
	public void additemtoinventory(int itemno ,item i){
		m.put(itemno, i);
		if(countmap.containsKey(i)){
			int x=countmap.get(i);
			countmap.put(i, x+1);
		}
		else{
			countmap.put(i, 1);
		}
		System.out.println("item added  to inventory");

		return;
	}
	
	public void additemtobasket(int itemno ){
		item i=m.get(itemno);
		int count=countmap.get(i);
		int price=i.price;
		if(0<=(totalmoney-price) && count!=0){
			totalmoney=totalmoney-price;
			arr.add(i);
			int x=countmap.get(i);
			countmap.put(i, x-1);
			System.out.println("item added to basket ");
		}
		else{
			System.out.println("insufficient funds ");
		}

		return;
	}

	public void dispachproducts() {
		int n=arr.size();
		if(n==0){
			System.out.println("no item to dispache.");
		}
		else{
			int i=0;
			while(i<n){
				System.out.println(arr.get(i).name);
				i++;
			}
			System.out.println("item are dispached.");
		}
		
		return;
	}
}
