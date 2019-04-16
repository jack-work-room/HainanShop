package net.shop.core.product.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import net.shop.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "xx_product")
@TableName(value = "xx_product")
public class Product extends BaseEntity {

    /** 商品名称 */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
