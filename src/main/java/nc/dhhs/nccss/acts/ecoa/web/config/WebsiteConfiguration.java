/**
 * 
 */
package nc.dhhs.nccss.acts.ecoa.web.config;

import java.util.ResourceBundle;

/**
 * @author Vijay Peddapalli
 *
 */
public class WebsiteConfiguration
{

	private static Long		businessAreaId		= null;

	private static String	appIDReqNCID		= "";

	private static String	appPwdReqNCID		= "";

	private static String	searchOp			= "";

	private static String	dbSchema			= "";

	private static String	dbSchemaSQL			= "";

	private static String	regiondbSchema		= "";

	private static int		maxGraceLogins		= 0;

	private static String	otherEmail			= "";

	private static String	primaryEmail		= "";

	private static String	cseOfficeLocator	= "";

	private static String	emailNotify			= "";

	private static String	technicalEmail		= "";

	private static String	byPassNCIDAuth		= "";

	private static String	deployedEnv			= "";

	/**
	 * @return the maxGraceLogins
	 */
	public static int getMaxGraceLogins()
	{
		return maxGraceLogins;
	}

	/**
	 * @param maxGraceLogins
	 *            the maxGraceLogins to set
	 */
	public static void setMaxGraceLogins(int maxGraceLogins)
	{
		WebsiteConfiguration.maxGraceLogins = maxGraceLogins;
	}

	/**
	 * @return the maxRegFailAttempts
	 */
	public static int getMaxRegFailAttempts()
	{
		return MaxRegFailAttempts;
	}

	/**
	 * @param maxRegFailAttempts
	 *            the maxRegFailAttempts to set
	 */
	public static void setMaxRegFailAttempts(int maxRegFailAttempts)
	{
		MaxRegFailAttempts = maxRegFailAttempts;
	}

	private static int MaxRegFailAttempts = 0;

	/**
	 * @return the dbSchemaSQL
	 */
	public static String getDbSchemaSQL()
	{
		return dbSchemaSQL;
	}

	/**
	 * @param dbSchemaSQL
	 *            the dbSchemaSQL to set
	 */
	public static void setDbSchemaSQL(String dbSchemaSQL)
	{
		WebsiteConfiguration.dbSchemaSQL = dbSchemaSQL;
	}

	static
	{
		ResourceBundle rb = null;
		try
		{
			rb = ResourceBundle.getBundle("config");

			if (rb.containsKey("appIDReqNCID"))
			{
				appIDReqNCID = rb.getString("appIDReqNCID");
			}

			if (rb.containsKey("appPwdReqNCID"))
			{
				appPwdReqNCID = rb.getString("appPwdReqNCID");
			}

			if (rb.containsKey("searchOp"))
			{
				searchOp = rb.getString("searchOp");
			}

			if (rb.containsKey("businessAreaId"))
			{
				setBusinessAreaId(Long.parseLong(rb.getString("businessAreaId")));
			}

			if (rb.containsKey("dbSchema"))
			{
				setDbSchema(rb.getString("dbSchema"));
			}

			if (rb.containsKey("dbSchemaSQL"))
			{
				setDbSchemaSQL(rb.getString("dbSchemaSQL"));
			}

			if (rb.containsKey("regiondbSchema"))
			{
				setRegiondbSchema(rb.getString("regiondbSchema"));
			}

			if (rb.containsKey("maxGraceLogins"))
			{
				setMaxGraceLogins(Integer.parseInt(rb.getString("maxGraceLogins")));
			}

			if (rb.containsKey("maxRegFailAttempts"))
			{
				setMaxRegFailAttempts(Integer.parseInt(rb.getString("maxRegFailAttempts")));
			}

			if (rb.containsKey("otherEmail"))
			{
				setOtherEmail(rb.getString("otherEmail"));
			}

			if (rb.containsKey("application.primaryEmail"))
			{
				setPrimaryEmail(rb.getString("application.primaryEmail"));
			}

			if (rb.containsKey("cseOfficeLocator"))
			{
				setCseOfficeLocator(rb.getString("cseOfficeLocator"));
			}

			if (rb.containsKey("application.emailMsgNotify"))
			{
				setEmailNotify(rb.getString("application.emailMsgNotify"));
			}

			if (rb.containsKey("technicalEmail"))
			{
				setTechnicalEmail(rb.getString("technicalEmail"));
			}

			if (rb.containsKey("byPassNCIDAuth"))
			{
				setByPassNCIDAuth(rb.getString("byPassNCIDAuth"));
			}
			if (rb.containsKey("deployedEnv"))
			{
				setDeployedEnv(rb.getString("deployedEnv"));
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	// method just used to load properties
	public static void init()
	{
	}

	/**
	 * @return the byPassNCIDAuth
	 */
	public static String getByPassNCIDAuth()
	{
		return byPassNCIDAuth;
	}

	/**
	 * @param byPassNCIDAuth
	 *            the byPassNCIDAuth to set
	 */
	public static void setByPassNCIDAuth(String byPassNCIDAuth)
	{
		WebsiteConfiguration.byPassNCIDAuth = byPassNCIDAuth;
	}

	/**
	 * @return the deployedEnv
	 */
	public static String getDeployedEnv()
	{
		return deployedEnv;
	}

	/**
	 * @param deployedEnv
	 *            the deployedEnv to set
	 */
	public static void setDeployedEnv(String deployedEnv)
	{
		WebsiteConfiguration.deployedEnv = deployedEnv;
	}

	/**
	 * @return
	 */
	public static String getAppIDReqNCID()
	{
		return appIDReqNCID;
	}

	public static void setAppIDReqNCID(String appIDReqNCID)
	{
		WebsiteConfiguration.appIDReqNCID = appIDReqNCID;
	}

	public static String getAppPwdReqNCID()
	{
		return appPwdReqNCID;
	}

	/**
	 * @param appPwdReqNCID
	 */
	public static void setAppPwdReqNCID(String appPwdReqNCID)
	{
		WebsiteConfiguration.appPwdReqNCID = appPwdReqNCID;
	}

	/**
	 * @return
	 */
	public static String getSearchOp()
	{
		return searchOp;
	}

	/**
	 * @return the dbSchema
	 */
	public static String getDbSchema()
	{
		return dbSchema;
	}

	/**
	 * @param dbSchema
	 *            the dbSchema to set
	 */
	public static void setDbSchema(String dbSchema)
	{
		WebsiteConfiguration.dbSchema = dbSchema;
	}

	/**
	 * @return the regiondbSchema
	 */
	public static String getRegiondbSchema()
	{
		return regiondbSchema;
	}

	/**
	 * @param regiondbSchema
	 *            the regiondbSchema to set
	 */
	public static void setRegiondbSchema(String regiondbSchema)
	{
		WebsiteConfiguration.regiondbSchema = regiondbSchema;
	}

	/**
	 * @param searchOp
	 */
	public static void setSearchOp(String searchOp)
	{
		WebsiteConfiguration.searchOp = searchOp;
	}

	/**
	 * @return the applicationId
	 */
	public static Long getBusinessAreaId()
	{
		return businessAreaId;
	}

	/**
	 * @param applicationId
	 *            the applicationId to set
	 */
	public static void setBusinessAreaId(Long businessAreaId)
	{
		WebsiteConfiguration.businessAreaId = businessAreaId;
	}

	/**
	 * @return the otherEmaul
	 */
	public static String getOtherEmail()
	{
		return otherEmail;
	}

	/**
	 * @param otherEmail
	 *            the otherEmail to set
	 */
	public static void setOtherEmail(String otherEmail)
	{
		WebsiteConfiguration.otherEmail = otherEmail;
	}

	/**
	 * @return the primaryEmail
	 */
	public static String getPrimaryEmail()
	{
		return primaryEmail;
	}

	/**
	 * @param primaryEmail
	 *            the primaryEmail to set
	 */
	public static void setPrimaryEmail(String primaryEmail)
	{
		WebsiteConfiguration.primaryEmail = primaryEmail;
	}

	/**
	 * @return the cseOfficeLocator
	 */
	public static String getCseOfficeLocator()
	{
		return cseOfficeLocator;
	}

	/**
	 * @param cseOfficeLocator
	 *            the cseOfficeLocator to set
	 */
	public static void setCseOfficeLocator(String cseOfficeLocator)
	{
		WebsiteConfiguration.cseOfficeLocator = cseOfficeLocator;
	}

	/**
	 * @return the emailNotify
	 */
	public static String getEmailNotify()
	{
		return emailNotify;
	}

	/**
	 * @param emailNotify
	 *            the emailNotify to set
	 */
	public static void setEmailNotify(String emailNotify)
	{
		WebsiteConfiguration.emailNotify = emailNotify;
	}

	/**
	 * @return the technicalEmail
	 */
	public static String getTechnicalEmail()
	{
		return technicalEmail;
	}

	/**
	 * @param technicalEmail
	 *            the technicalEmail to set
	 */
	public static void setTechnicalEmail(String technicalEmail)
	{
		WebsiteConfiguration.technicalEmail = technicalEmail;
	}

}
