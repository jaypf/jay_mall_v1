package cn.enjoy.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SysRole implements Serializable{

	
	
	public SysRole(){}
	
	public SysRole(String roleName,String roleDesc){
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String roleCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_name
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String roleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_desc
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String roleDesc;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.sys_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String sysCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.create_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.create_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String createUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.update_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String updateUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.update_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.isDefault
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private Byte isdefault;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.id
	 * @return  the value of sys_role.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.id
	 * @param id  the value for sys_role.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}


	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_code
	 * @return  the value of sys_role.role_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_code
	 * @param roleCode  the value for sys_role.role_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode == null ? null : roleCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_name
	 * @return  the value of sys_role.role_name
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_name
	 * @param roleName  the value for sys_role.role_name
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_desc
	 * @return  the value of sys_role.role_desc
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getRoleDesc() {
		return roleDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_desc
	 * @param roleDesc  the value for sys_role.role_desc
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc == null ? null : roleDesc.trim();
	}


	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.sys_code
	 * @return  the value of sys_role.sys_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getSysCode() {
		return sysCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.sys_code
	 * @param sysCode  the value for sys_role.sys_code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode == null ? null : sysCode.trim();
	}


	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.create_time
	 * @return  the value of sys_role.create_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.create_time
	 * @param createTime  the value for sys_role.create_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.create_user
	 * @return  the value of sys_role.create_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.create_user
	 * @param createUser  the value for sys_role.create_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser == null ? null : createUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.update_user
	 * @return  the value of sys_role.update_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.update_user
	 * @param updateUser  the value for sys_role.update_user
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.update_time
	 * @return  the value of sys_role.update_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.update_time
	 * @param updateTime  the value for sys_role.update_time
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.isDefault
	 * @return  the value of sys_role.isDefault
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Byte getIsdefault() {
		return isdefault;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.isDefault
	 * @param isdefault  the value for sys_role.isDefault
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setIsdefault(Byte isdefault) {
		this.isdefault = isdefault;
	}
}