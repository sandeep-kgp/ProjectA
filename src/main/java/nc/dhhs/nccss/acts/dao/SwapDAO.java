/**
 * 
 */
package nc.dhhs.nccss.acts.dao;

import java.sql.SQLException;
import java.util.List;

import nc.dhhs.nccss.acts.ecoa.beans.SwapDb;

/**
 * @author Phani Konuru
 *
 */
public interface SwapDAO
{

	/**
	 * @return
	 */
	public List<SwapDb> getCurrentSchema() throws SQLException;

}
