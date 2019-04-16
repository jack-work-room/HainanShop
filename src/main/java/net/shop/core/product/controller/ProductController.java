package net.shop.core.product.controller;

import net.shop.core.product.entity.Product;
import net.shop.core.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/findList")
    public List<Product> findListProduct(){

        return productServiceImpl.selectList(null);

    }

}
