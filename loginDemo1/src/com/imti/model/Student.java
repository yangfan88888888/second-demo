package com.imti.model;
/**@文件名: Student.java
 * @类功能说明: 
 * @作者: YangFan
 * @Email: 2693040638@qq.com
 * @日期: 2021年7月11日下午6:18:50
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangFan</li> 
 * 	 <li>日期: 2021年7月11日下午6:18:50</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Student {
	
	private int t_id;
	private String t_name;
	private String t_pwd;
	private String t_createTime;
	private String t_remark;
	private int t_delflag;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String t_name, String t_pwd) {
		super();
		this.t_name = t_name;
		this.t_pwd = t_pwd;
	}
	public Student(int t_id, String t_name, String t_pwd, String t_createTime, String t_remark, int t_delflag) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_pwd = t_pwd;
		this.t_createTime = t_createTime;
		this.t_remark = t_remark;
		this.t_delflag = t_delflag;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_pwd() {
		return t_pwd;
	}
	public void setT_pwd(String t_pwd) {
		this.t_pwd = t_pwd;
	}
	public String getT_createTime() {
		return t_createTime;
	}
	public void setT_createTime(String t_createTime) {
		this.t_createTime = t_createTime;
	}
	public String getT_remark() {
		return t_remark;
	}
	public void setT_remark(String t_remark) {
		this.t_remark = t_remark;
	}
	public int getT_delflag() {
		return t_delflag;
	}
	public void setT_delflag(int t_delflag) {
		this.t_delflag = t_delflag;
	}
	
	
	

}
