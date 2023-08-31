package logger;

public abstract class abstractlogmaster implements logmaster {
	logmaster next;
	public abstractlogmaster(logmaster o){
		next=o;
	}
}
