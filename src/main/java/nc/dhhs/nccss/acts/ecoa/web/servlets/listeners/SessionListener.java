package nc.dhhs.nccss.acts.ecoa.web.servlets.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import nc.dhhs.nccss.acts.ecoa.web.config.WebsiteConfiguration;
import nc.dhhs.nccss.acts.ecoa.web.service.SwapService;
import nc.dhhs.nccss.acts.ecoa.beans.SwapDb;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * 
 * 
 * @author Vijay Peddapalli
 * @author Phani Konuru
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener
{
	protected final Logger logger = Logger.getLogger(SessionListener.class);

	/*
	 * (non-Javadoc)
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se)
	{
		// TODO Auto-generated method stub
		try
		{
			/* get the current schema in use and if different than the region original schema, add the details to the session attribute
			*/ 
			HttpSession session = se.getSession();
			SwapService swapService = (SwapService) WebApplicationContextUtils.getWebApplicationContext(se.getSession().getServletContext()).getBean("swapService");
			List<SwapDb> currSchema = swapService.getCurrentSchema();
			if (currSchema != null && currSchema.size() > 0)
			{
				if (!currSchema.get(0).getCurrentSchema().trim().equalsIgnoreCase(WebsiteConfiguration.getRegiondbSchema().trim()))
				{
					session.setAttribute("currSchema", currSchema.get(0));
				}
			}

		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.
	 * http.HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se)
	{
		// TODO Auto-generated method stub

	}

}
