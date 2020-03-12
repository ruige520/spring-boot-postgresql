package com.pangu.foying.web.project.admin.dto.req;


import org.hibernate.validator.constraints.NotEmpty;

/**
 * 修改组织机构请求
 * @author 陈漫斌
 *
 */
public class ReqEditBaseOrganizeDTO {
	@NotEmpty(message = "id不能为空")
	private String id;
	private Integer parentId;
	@NotEmpty(message = "机构名称不能为空")
	private String organizeName;
	@NotEmpty(message = "机构编码不能为空")
	private String organizeEnCode;
	private String name;
	private String mobilePhone;
	private String weChat;
	private String telephone;
	private String email;
	private String fax;
	private String address;
	private String remark;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getOrganizeName() {
		return organizeName;
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
