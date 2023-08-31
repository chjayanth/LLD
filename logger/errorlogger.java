package logger;

public class errorlogger extends abstractlogmaster{
	public errorlogger(logmaster o){
		super(o);
	}
	public errorlogger(){
		super(null);
	}
	@Override
	public void callplatforms(logtype type, logmapclass l, String message) {
		if(type==logtype.error){
			l.notifyplatforms(type,message);
		}
		else{
			this.next.callplatforms(type,l,message);
		}
		
	}
	
	
}
