package com.pangu.foying.web.commom.constant;

/**
 * 中国行政地区等级
 * @author 陈漫斌
 * @version  0.1,14/9/2017
 */
public enum AreaLevelEnum {
	/**
     * 国家级
     */
	Country(0, "中国"),
	/**
	 * 省（直辖市，自治区，特别行区）级
	 */
	Province(1, "省（直辖市，自治区，特别行区）级"),
	/**
	 * 市（地区 盟）级
	 */
	City(2, "市（地区 盟）级"),
	/**
	 * 县（区，市）级
	 */
	Xian(3, "县（区，市）级"),
	
	/**
	 * 乡（镇，街道办事处）级
	 */
	Town(4, "乡（镇，街道办事处）级"),
	/**
	 * 村（社区）级
	 */
	Village(5, "村（社区）级");
   
	private int level;
	private String describe = "";
	private AreaLevelEnum(int level, String describe){
		this.level = level;
		this.describe = describe;
	}
	public int getLevel() {
		return level;
	}
	public String getDescribe() {
		return describe;
	}
	
	public static String getDescribe(int level){
		switch (level) {
			case 1: return AreaLevelEnum.Province.getDescribe();
			case 2: return AreaLevelEnum.City.getDescribe();
			case 3: return AreaLevelEnum.Xian.getDescribe();
			case 4: return AreaLevelEnum.Town.getDescribe();
			case 5: return AreaLevelEnum.Village.getDescribe();
		}
		return null;
	}
}
