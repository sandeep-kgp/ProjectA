/**
 * 
 */
package nc.dhhs.nccss.acts.dao.rowmap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import nc.dhhs.nccss.acts.ecoa.beans.SwapDb;

/**
 * @author Phani Konuru
 *
 */
public class SwapRowMapper implements RowMapper<SwapDb>
{

	protected final Logger logger = Logger.getLogger(SwapRowMapper.class);

	/*
	 * (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet,
	 * int)
	 */

	@Override
	public SwapDb mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		logger.debug("IN: SwapRowMapper- mapRow");

		SwapDb currSchema = new SwapDb();

		if (rs.getString("CD_SCHEMA") != null && !rs.getString("CD_SCHEMA").equals(""))
		{
			currSchema.setCurrentSchema(rs.getString("CD_SCHEMA"));
		}

		if (rs.getDate("DT_DATA_AS_OF") != null && !rs.getDate("DT_DATA_AS_OF").toString().equals(""))
		{
			currSchema.setDataAsDt(rs.getDate("DT_DATA_AS_OF"));
		}

		if (rs.getString("TM_DATA_AS_OF") != null && !rs.getString("TM_DATA_AS_OF").toString().equals(""))
		{
			currSchema.setDataAsTm(rs.getString("TM_DATA_AS_OF"));
		}

		return currSchema;
	}

}
