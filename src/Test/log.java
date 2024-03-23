package Test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log {
	
	public static Logger logger = Logger.getLogger(log.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		
		String s= "Abc";
		int a= 10;
		char c= 'a';
		double f = 1.3;
		Integer in = 276356757;
		
		
		//Trace (600) - function entry or exit and variable values
		//debug(500) - used for developing and testing
		//info (400)- used to print the api response, etc
		//warn (300)- potential risk
		//error(200) - unexpected error encountered
		//fatal(100) - affects severely the application with core component
		
//		severity wise - | up to down arrow
//		error
//		warning
//		info
//		debug
//		trace
		
		
		logger.trace("trace");
		logger.info(s);
		logger.debug(a);
		logger.error(c);
		logger.fatal(f);
		logger.warn(in);

	}

}
