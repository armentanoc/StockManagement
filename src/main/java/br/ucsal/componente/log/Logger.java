package br.ucsal.componente.log;

public class Logger implements ILogger {
	
	private static Logger instance;
	private LogLevel level = LogLevel.INFO;
	
	// So new Logger() is not possible outside this class (private constructor)
	private Logger() { }
	
	public static Logger getInstance() {
		
		if(instance == null) 
			instance = new Logger();
		
		return instance;
	}
	
	public void setLevel(LogLevel level) {
		this.level = level;
	}
	
	public void log(String message, LogLevel level) {
	    if (level.getValue() >= this.level.getValue()) {
	        String color = getColorForLogLevel(level);
	        System.out.println(color + "[LOGGER][" + level + "] " + message + "\u001B[0m");
	    }
	}

	public String getColorForLogLevel(LogLevel level) {
	    switch (level) {
	        case INFO:
	            return "\u001B[32m"; // green 
	        case WARNING:
	            return "\u001B[33m"; // yellow 
	        case ERROR:
	            return "\u001B[31m"; // red 
	        default:
	        	return "\u001B[37m"; // white 
	    }
	}
}
