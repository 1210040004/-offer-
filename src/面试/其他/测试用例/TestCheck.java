package 面试.其他.测试用例;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args){
        Calculate calculate=new Calculate();
        Class clazz=calculate.getClass();
        //clazz.getAnnotation();
        Method[] methods=clazz.getMethods();
        for(Method method:methods)
        {
            try {
                method.invoke(calculate);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
//            if(method.isAnnotationPresent(Check.class))
//            {
//                method.invoke(calculate);
//            }
        }
    }
}