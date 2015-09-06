package com.wellgoon.utils;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 项目名称：wellgoon
 * 项目包名：com.wellgoon.utils
 * 类    名：BaseDao
 * 创 建 人：Rocky
 * 创 建 于：2015/7/28
 */
public class BaseDao<T> extends HibernateDaoSupport {
    /**
     * 构造方法
     */
    public BaseDao() {
    }

    /**
     * 添加一个对象
     * @param t
     * @return
     */
    public T add(T obj){
        this.getHibernateTemplate().save(obj);
        return obj;
    }

    /**
     * 更新一个对象
     * @param obj
     * @return
     */
    public T update(T obj){
        this.getHibernateTemplate().update(obj);
        return obj;
    }

    /**
     * 删除一个对象
     * @param obj
     * @return
     */
    public T del(T obj){
        this.getHibernateTemplate().delete(obj);
        return obj;
    }

    public T get(T obj){
//        this.getHibernateTemplate().get();
        return obj;
    }
}
