package com.pangu.foying.web.project.admin.dto.res;

import org.dozer.Mapping;

/**
 * 返回单个组织机构信息，用于前台修改
 * @author 陈漫斌
 *
 */
public class ResGetOrgForEditDTO {
	
	@Mapping("id")
	private String id;
	
	@Mapping("mainId")
	private Integer mainId;
	
	@Mapping("parentId")
	private Integer pid;
	
	@Mapping("organizeName")
	private String organizeName;
	
	@Mapping("organizeEnCode")
	private String organizeEnCode;
	
	@Mapping("name")
	private String name;
	
	@Mapping("mobilePhone")
	private String mobilePhone;
	
	@Mapping("weChat")
	private String weChat;
	
	@Mapping("telephone")
	private String telephone;
	
	@Mapping("email")
	private String email;
	
	@Mapping("fax")
	private String fax;
	
	@Mapping("address")
	private String address;
	
	@Mapping("remark")
	private String remark;

	@Mapping("sortCode")
	private Integer sortCode;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getMainId() {
		return mainId;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setMainId(Integer mainId) {
		this.mainId = mainId;
	}
	public String getOrganizeName() {
		return organizeName;
	}

	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
	}

	public void setOrganizeName(String organizeName) {
		this.organizeName = organizeName;
	}

	public String getOrganizeEnCode() {
		return organizeEnCode;
	}

	public void setOrganizeEnCode(String organizeEnCode) {
		this.organizeEnCode = organizeEnCode;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getWeChat() {
		return weChat;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
