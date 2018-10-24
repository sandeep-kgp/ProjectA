/**
 * 
 */
package nc.dhhs.nccss.acts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import nc.dhhs.nccss.acts.dao.SwapDAO;
import nc.dhhs.nccss.acts.dao.rowmap.SwapRowMapper;
import nc.dhhs.nccss.acts.ecoa.beans.SwapDb;
import nc.dhhs.nccss.acts.ecoa.web.config.WebsiteConfiguration;

/**
 * @author Phani Konuru
 *
 */
@Repository
public class SwapDaoImpl implements SwapDAO
{

	protected final Logger		logger		= Logger.getLogger(SwapDaoImpl.class);

	private JdbcTemplate		jdbcTemplate;

	private SimpleJdbcCall		procCurrentSchema;

	private static final String	SCREEN_SP	= "FKWEB_R_SCHEMA_TIME";

	@Autowired
	// @Required
	public void setDataSource(DataSource dataSource)
	{

		logger.debug("\n********** IN SwapDaoImpl: SETDATASOURCE**********\n");

		this.jdbcTemplate = new JdbcTemplate(dataSource);

		this.jdbcTemplate.setSkipUndeclaredResults(true);

		//schema for this SP should point to region original schema
		procCurrentSchema = new SimpleJdbcCall(jdbcTemplate).withoutProcedureColumnMetaDataAccess().withSchemaName(WebsiteConfiguration.getRegiondbSchema()).withProcedureName("FKWEB_R_SCHEMA_TIME");

	}

	/*
	 * (non-Javadoc)
	 * @see nc.dhhs.nccss.acts.dao.AlertDAO#retrieveMessages()
	 */
	@SuppressWarnings("unchecked")
	public List<SwapDb> getCurrentSchema() throws SQLException

	{
		logger.debug("\n********** IN SwapDaoImpl: getCurrentSchema()" + "**********\n");

		procCurrentSchema.returningResultSet("currDb", new SwapRowMapper());

		SqlParameterSource in = new MapSqlParameterSource();

		Map<String, Object> results = procCurrentSchema.execute(in);

		return (List<SwapDb>) results.get("currDb");
	}

}
