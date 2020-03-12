package com.pangu.foying.commom.util;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description dto映射工具
 * @Date 2018/12/10 9:13
 * @Modified By
 */
public class DTOMappingUtil {
    private DTOMappingUtil(){
    }
    private static final Object synObj = new Object();
    private static DTOMappingUtil instance = null;

    /**
     * 获取dto映射工具实例，单例
     * @return
     */
    public static DTOMappingUtil getInstance(){
        synchronized (synObj) {
            if(instance == null){
                instance = new DTOMappingUtil();
                return instance;
            }else{
                return instance;
            }
        }
    }

    private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    /**
     * 将entity对象转化成dto对象
     * @param source
     * 源对象
     * @param destinationClass
     * 目标类型
     * @return
     */
    public <T> T map(Object source, Class<T> destinationClass){
        return dozerBeanMapper.map(source, destinationClass);
    }

    /**
     * 将entity对象转化成dto对象
     * @param source
     * 源对象
     * @param destination
     * 目标对象
     */
    public void map(Object source, Object destination){
        dozerBeanMapper.map(source, destination);
    }

    /**
     * 将entityList对象转化成dtoList对象
     * @param sourceList
     * 源对象列表
     * @param destinationClass
     * 目标类型
     * @return
     */
    public <T1,T2> List<T2> mapList(List<T1> sourceList, Class<T2> destinationClass){
        List<T2> destinationList = new ArrayList<T2>(sourceList.size());
        T2 destination = null;
        for(T1 source : sourceList){
            destination = dozerBeanMapper.map(source, destinationClass);
            destinationList.add(destination);
        }
        return destinationList;
    }

    public void destory(){
        dozerBeanMapper.destroy();
    }
}
