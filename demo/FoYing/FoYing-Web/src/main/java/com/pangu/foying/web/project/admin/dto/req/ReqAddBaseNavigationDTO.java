package com.pangu.foying.web.project.admin.dto.req;

import org.hibernate.validator.constraints.NotEmpty;

public class ReqAddBaseNavigationDTO {

	@NotEmpty(message = "pid不能为空")
	private String parentId;
	@NotEmpty(message = "导航栏类型不能为空")
	private String navigationType;
	@NotEmpty(message = "导航栏名称不能为空")
	private String navigationName;
	@NotEmpty(message = "导航栏头不能为空")
	private String title;
	private String subTitle;
	private String iconUrl;
	private String linkUrl;
	private Boolean isLock;
	@NotEmpty(message = "actionType不能为空")
	private String actionType;
	private Boolean isSys;
	private String remark;
	private Integer sortCode;

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getNavigationType() {
		return navigationType;
	}

	public void setNavigationType(String navigationType) {
		this.navigationType = navigationType;
	}

	public String getNavigationName() {
		return navigationName;
	}

	public void setNavigationName(String navigationName) {
		this.navigationName = navigationName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Boolean getIsSys() {
		return isSys;
	}

	public void setIsSys(Boolean isSys) {
		this.isSys = isSys;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
	}
}
