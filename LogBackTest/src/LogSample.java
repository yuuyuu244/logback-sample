import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogSample {
	final String className = "LogSample.class";
	protected static Logger logger = LoggerFactory.getLogger( "LogSample" );
	
	public static void main(String args[]) {
        logger.info("info: {}", 1);
        logger.warn("warn: {}", 2);
        logger.error("error: {}", 3);
    }
	
}
