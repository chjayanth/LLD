package logger;

public class cmdplatform implements platform{
	
	public cmdplatform(){
		
	}
	@Override
	public void printlog(String message) {
		
		System.out.println("Cmd printing log " + message);
	}

}
