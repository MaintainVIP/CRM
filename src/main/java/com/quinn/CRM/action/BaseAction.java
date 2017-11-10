package com.quinn.CRM.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.ParameterizedType;


public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
    //1.封装数据
    private T t;
    @Override
    public T getModel() {
        return t;
    }
    //1.1实例化t
    public BaseAction(){

        try {
        //1 获得T运行时Class
            ParameterizedType paramType = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class<T> clazz = (Class<T>) paramType.getActualTypeArguments()[0];
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
