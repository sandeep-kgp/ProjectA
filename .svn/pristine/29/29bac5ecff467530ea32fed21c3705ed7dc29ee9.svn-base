package nc.dhhs.nccss.acts.dao.impl;

import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import nc.dhhs.nccss.acts.dao.CodeLookUpDao;
import nc.dhhs.nccss.acts.dao.rowmap.CodeLookUpRowMapper;
import nc.dhhs.nccss.acts.ecoa.beans.CodeLookUp;
import nc.dhhs.nccss.acts.ecoa.web.config.WebsiteConfiguration;

/**
 * @author Phani Konuru
 *
 */
@Repository
public class CodeLookUpDaoImpl implements CodeLookUpDao
{

	protected final Logger		logger		= Logger.getLogger(CodeLookUpDaoImpl.class);

	private JdbcTemplate		jdbcTemplate;

	private SimpleJdbcCall		procCaseApplication1;

	private static final String	SCREEN_SP	= "APP_RESP";

	// function call for annual service fee
	protected final String		SQL_FEES	= "select " + WebsiteConfiguration.getDbSchema() + ".FK_FUNC_R_RTN_CODE_DTL('FFYNFEESFEES      REVDATE') " + "FROM SYSIBM.SYSDUMMY1";

	@Autowired
	//@Required
	public void setDataSource(DataSource dataSource)
	{

		logger.debug("\n********** IN CaseApplicationDaoImpl: SETDATASOURCE**********\n");

		this.jdbcTemplate = new JdbcTemplate(dataSource);

		this.jdbcTemplate.setSkipUndeclaredResults(true);

		//this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		procCaseApplication1 = new SimpleJdbcCall(jdbcTemplate).withoutProcedureColumnMetaDataAccess().withSchemaName(WebsiteConfiguration.getDbSchema()).withProcedureName("FKWEB_R_CODE_LOOKUP");
	}

	@SuppressWarnings("unchecked")
	public List<CodeLookUp> getCodeLookup(String lookup) throws SQLException
	{

		//logger.debug("\n********** IN CaseApplicationDaoImpl: getCaseApplicationByAppId(applID:" + applId + ")" + "**********\n");

		procCaseApplication1.declareParameters(new SqlParameter("CODETYPE", Types.CHAR)).returningResultSet("lookup", new CodeLookUpRowMapper());

		SqlParameterSource in = new MapSqlParameterSource().addValue("CODETYPE", lookup);

		Map<String, Object> results = procCaseApplication1.execute(in);

		return (List<CodeLookUp>) results.get("lookup");
	}

	/*
	 * (non-Javadoc)
	 * @see nc.dhhs.nccss.acts.dao.CodeLookUpDao#getApplFees()
	 */
	@SuppressWarnings("unchecked")
	public String getApplFees() throws SQLException
	{
		logger.info("\n********** IN CodeLookUpDaoImpl: getApplFees()**********\n");
		
		String feesStr = jdbcTemplate.queryForObject(SQL_FEES, String.class).toString();

		return feesStr;
	}

}
