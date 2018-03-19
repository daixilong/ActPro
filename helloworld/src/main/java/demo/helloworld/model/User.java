package demo.helloworld.model;
import org.beetl.sql.core.TailBean;

import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/* 
* 
* gen by beetlsql 2018-03-19
*/
public class User extends TailBean {
	
	private Integer id ;
	//用户角色
	private Integer roleId ;
	private String pwd ;
	//用户名称
	private String userName ;
	private Date createDate ;
	private Date modifyDate ;
	
	public User() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**用户角色
	*@return 
	*/
	public Integer getRoleId(){
		return  roleId;
	}
	/**用户角色
	*@param  roleId
	*/
	public void setRoleId(Integer roleId ){
		this.roleId = roleId;
	}
	
	public String getPwd(){
		return  pwd;
	}
	public void setPwd(String pwd ){
		this.pwd = pwd;
	}
	
	/**用户名称
	*@return 
	*/
	public String getUserName(){
		return  userName;
	}
	/**用户名称
	*@param  userName
	*/
	public void setUserName(String userName ){
		this.userName = userName;
	}
	
	public Date getCreateDate(){
		return  createDate;
	}
	public void setCreateDate(Date createDate ){
		this.createDate = createDate;
	}
	
	public Date getModifyDate(){
		return  modifyDate;
	}
	public void setModifyDate(Date modifyDate ){
		this.modifyDate = modifyDate;
	}
	

}
