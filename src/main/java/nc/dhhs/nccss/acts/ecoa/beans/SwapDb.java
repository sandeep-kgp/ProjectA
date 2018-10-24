/**
 * 
 */
package nc.dhhs.nccss.acts.ecoa.beans;

import java.io.Serializable;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import nc.dhhs.nccss.acts.ecoa.web.util.AppConstants;

/**
 * @author Phani Konuru
 *
 */

public class SwapDb implements Serializable
{

	private static final long	serialVersionUID	= 2045898402954117406L;

	protected final Logger		logger				= Logger.getLogger(SwapDb.class);

	private String				currentSchema		= "";

	private Date				dataAsDt;

	private String				dataAsTm			= "";

	SimpleDateFormat			DATE_FORMAT			= new SimpleDateFormat("yyyy-MM-dd");

	SimpleDateFormat			DATE_FORMAT_SCREEN	= new SimpleDateFormat("MM/dd/yyyy");

	/**
	 * @return the currentSchema
	 */
	public String getCurrentSchema()
	{
		return currentSchema;
	}

	/**
	 * @param currentSchema
	 *            the currentSchema to set
	 */
	public void setCurrentSchema(String currentSchema)
	{
		this.currentSchema = currentSchema;
	}

	/**
	 * @return the dataAsDt
	 */
	public Date getDataAsDt()
	{
		return dataAsDt;
	}

	/**
	 * @return
	 */
	public String getDataAsDtStrPg()
	{
		if (dataAsDt == null) return "";
		else
			return DATE_FORMAT_SCREEN.format(dataAsDt).trim().equals(AppConstants.PAGE_DEFAULT_DATE) ? "" : DATE_FORMAT_SCREEN.format(dataAsDt).trim() + ", " + dataAsTm;
	}

	/**
	 * @param dataAsDt
	 *            the dataAsDt to set
	 */
	public void setDataAsDt(Date dataAsDt)
	{
		this.dataAsDt = dataAsDt;
	}

	/**
	 * @return the dataAsTm
	 */
	public String getDataAsTm()
	{
		return dataAsTm.trim();
	}

	/**
	 * @param dataAsTm
	 *            the dataAsTm to set
	 */
	public void setDataAsTm(String dataAsTm)
	{
		this.dataAsTm = dataAsTm;
	}

}
