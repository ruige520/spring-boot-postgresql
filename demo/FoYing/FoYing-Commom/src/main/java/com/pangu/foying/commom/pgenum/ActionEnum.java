package com.pangu.foying.commom.pgenum;

/**
 * 统一管理操作枚举
 * @author 陈漫斌
 * @version  0.1,19/7/2017
 *
 */
public enum ActionEnum {
	/**
     * 所有
     */
	All("所有"),
   
	/**
     * 显示
     */
	Show("显示"),
    
	/**
     * 查看
     */
	view("查看"),

	/**
     * 查看
     */
	list("查看列表"),

    /**
     * 添加
     */
	add("添加"),

	/**
	 * 修改
	 */
    update("修改"),
    
    /**
     * 删除
     */
    delete("删除"),
    
    /**
     * 审核
     */
    Audit("审核"),
    
    /**
     * 回复
     */
    Reply("回复"),
    
    /**
     * 确认
     */
    Confirm("确认"),
  
    /**
     * 取消
     */
    Cancel("取消"),

    /**
     * 取消
     */
    Evaluate("评价"),

    /**
     * 作废
     */
    Invalid("作废"),
    
    /**
     * 生成
     */
    Build("生成"),
    
    /**
     * 安装
     */
    Install("安装"),
    
    /**
     * 卸载
     */
    Unload("卸载"),
    
    /**
     * 登录
     */
    Login("登录"),
    
    /**
     * 备份
     */
    logout("登出"),
    
    /**
     * 还原
     */
    export("导出"),

    /**
     * 导入
     */
    imports("导入"),

    /**
     * 备份
     */
    Backup("备份"),

    /**
     * 还原
     */
    Restore("还原"),

    /**
     * 替换
     */
    Replace("替换"),

    /**
     * 支付
     */
    Pay("支付"),

    /**
     * 退款
     */
    Refund("退款"),

    /**
     * 注册
     */
    Register("注册");

 
    
	private String describe = "";
	private ActionEnum(String describe){
		this.describe = describe;
	}
	
	/**
	 * 获取枚举对应的中文描述
	 * @return
	 */
	public String getDescribe() {
		return describe;
	}
}