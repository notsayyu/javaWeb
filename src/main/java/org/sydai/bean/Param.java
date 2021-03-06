package org.sydai.bean;

import org.sydai.utils.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 * @author dsy
 */
public final class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     */
    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     */
    public Map<String, Object> getMap(){
        return paramMap;
    }

}
