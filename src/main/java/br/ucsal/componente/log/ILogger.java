package br.ucsal.componente.log;

public interface ILogger {
	
	static Logger getInstance(){
		return null;
	};	
	
	void setLevel(LogLevel level);
	
	void log(String message, LogLevel level);
	
	String getColorForLogLevel(LogLevel level);
}
