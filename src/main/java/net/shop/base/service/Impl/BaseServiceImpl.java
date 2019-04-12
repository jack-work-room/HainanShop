package net.shop.base.service.Impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sun.xml.internal.rngom.parse.host.Base;
import net.shop.base.entity.BaseEntity;
import net.shop.base.service.BaseService;

import java.util.Date;

public class BaseServiceImpl<T> extends ServiceImpl<BaseMapper<T>, T> implements BaseService<T> {

    @Override
    public boolean insert(T entity){
        if(entity instanceof BaseEntity){
            BaseEntity baseEntity = (BaseEntity)entity;
            baseEntity.setCreateDate(new Date());
            baseEntity.setModifyDate(new Date());
        }
        return super.insert(entity);
    }


    @Override
    public T update(T entity) {
        if(entity instanceof BaseEntity){
            BaseEntity baseEntity = (BaseEntity)entity;
            baseEntity.setModifyDate(new Date());
        }
        super.updateById(entity);
        return entity;
    }
}
