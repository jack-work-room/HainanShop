package net.shop.base.service;

import com.baomidou.mybatisplus.service.IService;

public interface BaseService<T> extends IService<T> {

    T update(T entity);

}
