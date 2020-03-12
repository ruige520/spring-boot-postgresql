package com.pangu.foying.web.project.admin.dto.req;


import org.hibernate.validator.constraints.NotEmpty;

public class ReqUpdateBaseNavigationDTO {
	@NotEmpty(message = "id不能为空")
	private String id;
	@NotEmpty(message = "pid不能为空")
	private String parentId;
	@NotEmpty(message = "导航栏类型不能为空")
	private String navigationType;
	@NotEmpty(message = "导航栏头不能为空")
	private String title;
	private String subTitle;
	private String iconUrl;
	private String linkUrl;
	private Boolean isLock;
	private String actionType;
	private Boolean isSys;
	private String remark;
	private Integer sortCode;
	public String getId() {
		return id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Boolean getLock() {
		return isLock;
	}

	public void setLock(Boolean lock) {
		isLock = lock;
	}

	public Boolean getSys() {
		return isSys;
	}

	public void setSys(Boolean sys) {
		isSys = sys;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getNavigationType() {
		return navigationType;
	}
	public void setNavigationType(String navigationType) {
		this.navigationType = navigationType;
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
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
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
