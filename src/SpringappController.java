import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



public class SpringappController implements Controller {
	 /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());


	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
	
		logger.info("SpringappController - returning hello view");
		Date d=new Date();
        return new ModelAndView("hello","Date",d);
		 
	}
}
