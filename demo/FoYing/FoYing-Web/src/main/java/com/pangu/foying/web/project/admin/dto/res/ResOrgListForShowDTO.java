package com.pangu.foying.web.project.admin.dto.res;

import org.dozer.Mapping;

import java.sql.Timestamp;

/**
 *返回组织机构列表（用于前台页面展示）
 * @author 陈漫斌
 *
 */
public class ResOrgListForShowDTO {
	@Mapping("id")
	protected String primarykey;//主键id
	
	@Mapping("mainId")
	protected Integer id;//mainId
	
	@Mapping("parentId")
	protected Integer pid;
	
	@Mapping("organizeEnCode")
	protected String enCode;
	
	@Mapping("addTime")
	protected Timestamp addTime;
	
	@Mapping("remark")
	protected String remark;
	
	@Mapping("organizeName")
	protected String organizeName;
	
	protected int classLayer;//表示第几层
	
	protected String isLeaf;//表示是否为叶子节点
	
	protected String expanded = "true";//表示是否扩展

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

	public String getEnCode() {
		return enCode;
	}

	public void setEnCode(String enCode) {
		this.enCode = enCode;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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
