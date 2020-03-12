package com.pangu.foying.web.project.admin.dto.res;


import org.dozer.Mapping;

public class ResGetBaseNavigationDTO {
	@Mapping("id")
	private String primarykey;//主键Id

	@Mapping("mainId")
	private Integer id;

	@Mapping("parentId")
	private Integer pid;

	@Mapping("navigationType")
	private String navigationType;

	@Mapping("navigationName")
	private String navigationName;

	@Mapping("title")
	private String title;

	@Mapping("subTitle")
	private String subTitle;

	@Mapping("iconUrl")
	private String iconUrl;

	@Mapping("linkUrl")
	private String linkUrl;

	@Mapping("sortCode")
	private Integer sortCode;

	@Mapping("actionType")
	private String actionType;

	@Mapping("isSys")
	private String isSys;

	public String getIsSys() {
		return isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}

	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
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

	@Mapping("remark")
	private String remark;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getIsLock() {
		return isLock;
	}

	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

	@Mapping("isLock")
	private String isLock;

	private int classLayer;//表示第几层

	private String isLeaf;//表示是否为叶子节点

	private String expanded = "true";//表示是否扩展

	public String getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getClassLayer() {
		return classLayer;
	}

	public void setClassLayer(int classLayer) {
		this.classLayer = classLayer;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getExpanded() {
		return expanded;
	}

	public void setExpanded(String expanded) {
		this.expanded = expanded;
	}
}
