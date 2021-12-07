package ysg.tkm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * H2DBへの接続、SQLの実行を管理するクラス
 * 
 * @author 作成者の名前
 * 2021/05/31
 */
public class H2Dao {
	private final String DB_URI = "jdbc:h2:/Users/takk/Java/jars/h2/db_file/test.mv.db";
	private Connection con;
	
	public H2Dao() throws SQLException {
		try {
			// DriverManager.getConnection(URI   , ユーザー名, パスワード(なし))
			con = DriverManager.getConnection(DB_URI, "sa", "");
			Statement stmt = con.createStatement();
			createTables(stmt);
			ResultSet result = stmt.executeQuery("select * from test;");

			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				System.out.println("ID: " + id + " Name: " + name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	public void createTables(Statement stmt) throws SQLException {
		String sql = "DROP TABLE IF EXISTS TEST;\n" + 
				"CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" + 
				"INSERT INTO TEST VALUES(1, 'Hello');\n" + 
				"INSERT INTO TEST VALUES(2, 'World');\n" + 
				"SELECT * FROM TEST ORDER BY ID;\n" + 
				"UPDATE TEST SET NAME='Hi' WHERE ID=1;\n" + 
				"DELETE FROM TEST WHERE ID=2;";
		stmt.execute(sql);
	}
	public void finalize() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con = null;
		}
		
	}
}
