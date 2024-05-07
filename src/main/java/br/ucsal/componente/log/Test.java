package br.ucsal.componente.log;

public class Test {
	private ILogger logger = Logger.getInstance();
	
	public Test() {
		testLevel(LogLevel.INFO);
		testLevel(LogLevel.WARNING);
		testLevel(LogLevel.ERROR);
	}
	
	public void testLevel(LogLevel level) {
		System.out.println("\nLevel: "+level);
		logger.setLevel(level);
		logger.log("This is a info", LogLevel.INFO);
		logger.log("This is a warning", LogLevel.WARNING);
		logger.log("This is an error", LogLevel.ERROR);
	}
}
