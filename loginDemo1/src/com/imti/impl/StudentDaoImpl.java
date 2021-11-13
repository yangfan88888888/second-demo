package com.imti.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.imti.dao.StudentDao;
import com.imti.model.Student;
import com.imti.util.DbUtil;

/**@文件名: StudentDaoImpl.java
 * @类功能说明: 
 * @作者: YangFan
 * @Email: 2693040638@qq.com
 * @日期: 2021年7月11日下午6:23:57
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangFan</li> 
 * 	 <li>日期: 2021年7月11日下午6:23:57</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class StudentDaoImpl implements StudentDao{

	@Override
	public Student login(Student student) {
		String sql="select * from smm where t_delflag=0 and t_name=? and t_pwd=?";
		Connection conn=DbUtil.getConn();
		PreparedStatement pstm=null;
		Student student1=null;
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setString(1, student.getT_name());
			pstm.setString(2, student.getT_pwd());
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				student1=new Student(rs.getString("t_name"),rs.getString("t_pwd"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return student1;
	}
	

}
