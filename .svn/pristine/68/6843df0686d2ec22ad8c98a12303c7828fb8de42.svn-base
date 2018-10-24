/**
 * 
 */
package nc.dhhs.nccss.acts.ecoa.web.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import nc.dhhs.nccss.acts.ecoa.beans.SwapDb;
import nc.dhhs.nccss.acts.ecoa.web.service.SwapService;
import nc.dhhs.nccss.acts.dao.SwapDAO;

/**
 * @author Phani Konuru
 *
 */
public class SwapServiceImpl implements SwapService
{
	@Autowired
	private SwapDAO			swapDao;

	protected final Logger	logger	= Logger.getLogger(SwapServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * @see nc.dhhs.nccss.acts.ecoa.web.service.AlertService#getCSSNewsAlert()
	 */
	@Transactional(readOnly = true)
	public List<SwapDb> getCurrentSchema() throws SQLException
	{
		logger.debug("\n********** IN SwapServiceImpl: getCurrentSchema() **********\n");

		return swapDao.getCurrentSchema();

	}

}
