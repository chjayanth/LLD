package logger;

public class main {

	public static void main(String[] args) {
		logmaster l=new infologger();
		l=new errorlogger(l);
		l=new debuglogger(l);

		platform p1=new cmdplatform();
		platform p2=new consoleplatform();
		
		logmapclass m=new logmapclass();
		m.addplatform(logtype.info, p1);
		m.addplatform(logtype.info, p2);
		m.addplatform(logtype.error, p1);
		m.addplatform(logtype.debug, p2);
		
		l.callplatforms(logtype.info, m, "heloooo");
		l.callplatforms(logtype.error, m, "miss");
	}

}
