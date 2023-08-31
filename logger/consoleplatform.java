package logger;

public class consoleplatform implements platform{
	public consoleplatform(){
		
	}

	@Override
	public void printlog(String message) {
		System.out.println("Console printing log   " + message);
		
	}
	
}
