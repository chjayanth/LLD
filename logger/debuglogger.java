package logger;

public class debuglogger extends abstractlogmaster{
	public debuglogger(logmaster o){
		super(o);
	}
	public debuglogger(){
		super(null);
	}
	@Override
	public void callplatforms(logtype type, logmapclass l, String message) {
		if(type==logtype.debug){
			l.notifyplatforms(type,message);
		}
		else{
			this.next.callplatforms(type,l,message);
		}
		
	}

	
	
	
}
