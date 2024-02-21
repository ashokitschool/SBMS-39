package in.ashokit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean save() {
		
		String sql = "insert into book values(1, 'Java', 1000)";
		
		jdbcTemplate.execute(sql);
		
		return true;
	}

}









