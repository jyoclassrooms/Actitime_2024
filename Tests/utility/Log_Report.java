package utility;

import org.apache.log4j.Logger;

public class Log_Report
{
    private Logger log=null;
    
	public void log_info(String msg)
	{
		log=Logger.getLogger("devpinoyLogger");
		log.info(msg);
	}
	
	public void log_error(String msg)
	{
		log=Logger.getLogger("devpinoyLogger");
		log.error(msg);
	}
	
	
}
