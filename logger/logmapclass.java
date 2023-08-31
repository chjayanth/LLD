package logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class logmapclass {
	Map<logtype,ArrayList<platform>> m;
	logmapclass(){
		m=new HashMap<logtype,ArrayList<platform>>(); 
	}
	
	public void notifyplatforms(logtype type, String message) {
		ArrayList<platform> arr=m.get(type);
		int i=0;
		int n=arr.size();
		while(i<n){
			arr.get(i).printlog(message);
			i++;
		}
		
	}
	public void addplatform(logtype type,platform p){
		if(m.containsKey(type)){
			ArrayList<platform> arr=m.get(type);
			arr.add(p);
		}
		else{
			ArrayList<platform> arr=new ArrayList<platform>();
			arr.add(p);
			m.put(type, arr);
		}
	}
	//implement remove also sometime.
}
