package qa.thelibertymitual.bdd.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleLogger {
	
	
	public static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
public static void log(String msg) {
	logger.log(Level.INFO,msg);
}
}
