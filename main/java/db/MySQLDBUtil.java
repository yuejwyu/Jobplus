package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "laiproject-instance.c1zcd3d1jldl.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
