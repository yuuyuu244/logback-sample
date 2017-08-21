import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

public class WPSLogger {
    private static WPSLogger instance = null;
    private Logger logger = null;
    
    
    public static synchronized WPSLogger getLogger(String logbackFilePath){
        if(instance == null){ 
          instance = new WPSLogger(logbackFilePath);
        }
        return instance;
    }
    
    
    public WPSLogger(String logbackFilePath) {
        logger = LoggerFactory.getLogger("wps");
        initLogConfigFile(logbackFilePath);
        
    }
    
    private void initLogConfigFile(String logbackFilePath) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(lc);
        lc.reset();
        
        try {
            configurator.doConfigure(logbackFilePath);
        } catch (JoranException e) {
        }
    }
    
    public void trace(String msg) {
        logger.trace("TRACE: " + msg); 
    }
    
    public void warning(String msg) {
        logger.error("WARNING: " + msg);
        
    }
    
    public void fatal(String msg) {
        logger.error("FATAL: " + msg);
    }
    


}
