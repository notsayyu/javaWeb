package org.sydai.utils.helper;

import org.sydai.utils.ClassUtil;

/**
 * 加载相应的Helper类
 * @author dsy
 */
public final class HelperLoader {

    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList){
            ClassUtil.loadClass(cls.getName(), true);
        }
    }

}