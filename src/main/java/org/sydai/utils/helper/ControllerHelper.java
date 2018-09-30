package org.sydai.utils.helper;

import org.sydai.bean.Handler;
import org.sydai.bean.Request;
import org.sydai.utils.CollectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 控制器助手类
 * @author dsy
 */
public final class ControllerHelper {

    /**
     * 用于存放请求与处理器的映射关系（简称Action Map）
     */
    private static final Map<Request, Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        //获取所有的Controller类
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        if(CollectionUtil.isNotEmpty(controllerClassSet)){
            //遍历这些Controller类
            for(Class<?> controllerClass : controllerClassSet){
                //获取Controller类中定义的方法
            }
        }
    }

}
