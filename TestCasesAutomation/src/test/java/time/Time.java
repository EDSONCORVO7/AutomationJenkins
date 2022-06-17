package time;

public class Time {
	public void Tiempo(int seconds) {
		
	    try {
	    	Thread.sleep(seconds);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    	
	    }
}

}