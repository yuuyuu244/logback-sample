import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

public class LogBackSample {
    
    public static void main(String[] args) {
        WPSLogger logger = WPSLogger.getLogger("logback.xml");
        List<WPSLogger> test = new ArrayList<>();

        logger.fatal("error");
        logger.warning("message");
        logger.trace("trace");
    }

}
