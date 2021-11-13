package com.imti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**@文件名: Util.java
 * @类功能说明: 
 * @作者: YangFan
 * @Email: 2693040638@qq.com
 * @日期: 2021年7月11日下午6:04:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangFan</li> 
 * 	 <li>日期: 2021年7月11日下午6:04:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class DbUtil {
	private static String jdbcDriver="com.mysql.jdbc.Driver";
	private static String jdbcUrl="jdbc:mysql://localhost:3306/example";
	private static String userName="root";
	private static String password="123456";
	
	public static Connection getConn() {
		Connection conn=null;
		try {
			Class.forName(jdbcDriver);
			
			try {
				conn=DriverManager.getConnection(jdbcUrl, userName, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}	



}
