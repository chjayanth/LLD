package logger;

public class infologger extends abstractlogmaster{
	public infologger(logmaster o){
			super(o);
	}
	public infologger(){
		super(null);
	}

	@Override
	public void callplatforms(logtype type, logmapclass l, String message) {
		if(type==logtype.info){
			l.notifyplatforms(type,message);
		}
		else{
			this.next.callplatforms(type,l,message);
		}
		
	}

	
	
}
