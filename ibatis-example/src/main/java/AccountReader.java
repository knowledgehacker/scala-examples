import java.util.List;
import java.io.Reader;
import java.io.IOException;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class AccountReader {
	private static final Logger LOG = LoggerFactory.getLogger(AccountReader.class);
	
	private SqlMapClient _sqlMapClient;

	public AccountReader(String resource) {
		try {
			_sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(Resources.getResourceAsReader (resource));
		} catch(IOException ioe) {
			LOG.error(ioe.toString());
		}
	}

	public void read(String userName) {
		if(_sqlMapClient == null) {
			LOG.error("sql map client hasn't been initialized");
			return;
		}

		try {
			List<Account> accounts = (List<Account>)_sqlMapClient.queryForList("getAccounts", userName);
			for(Account account: accounts)
				System.out.println(account);
		} catch(SQLException sqle) {
			LOG.error(sqle.toString());
		}
	}
}
