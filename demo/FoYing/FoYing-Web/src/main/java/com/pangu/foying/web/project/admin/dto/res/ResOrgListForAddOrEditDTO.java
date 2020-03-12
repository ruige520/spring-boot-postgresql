package com.pangu.foying.web.project.admin.dto.res;

import org.dozer.Mapping;

/**
 * 返回组织机构列表（用于添加或修改机构时下拉选择父机构）
 * @author 陈漫斌
 *
 */
public class ResOrgListForAddOrEditDTO {
	protected Integer mainId;
	
	@Mapping("parentId")
	protected Integer pid;
	
	@Mapping("organizeName")
	protected String organizeName;
	
	protected int classLayer;//表示第几层
	
	protected String isLeaf;//表示是否为叶子节点
	
	protected String expanded = "true";//表示是否扩展

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

	public void setOrganizeName(String organizeName) {
		this.organizeName = organizeName;
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
