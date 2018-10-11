package org.sydai.bean;

/**
 * 返回数据对象
 * @author dsy
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel(){
        return model;
    }
}
