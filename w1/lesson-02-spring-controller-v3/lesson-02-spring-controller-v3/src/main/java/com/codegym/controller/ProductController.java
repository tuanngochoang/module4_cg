package com.codegym.controller;

import com.codegym.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1L, "Quần Jean",
                "Quần Jean đen, ống loe", 350.0, 10));
        products.add(new Product(2L, "Áo Sơ mi",
                "Áo sơ mi trắng, tay dài", 250.0, 10));
        products.add(new Product(3L, "Áo khoác",
                "Áo khoác da beo, đen", 300.0, 10));
    }

    // Solution 1,2: Using Model or ModelMap
//    @GetMapping
//    public String getProducts(Model model, ModelMap modelMap) {
////        model.addAttribute("products", products);
//        modelMap.addAttribute("products", products);
//        return "product/list";
//    }

    // Solution 3: Using ModelAndView
    @GetMapping
    public ModelAndView getProducts() {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("{id}")
    public String getProductDetail(@PathVariable Long id, Model model) {
        for (Product product: products) {
            if (product.getId().equals(id)) {
                model.addAttribute("product", product);
                return "product/detail";
            }
        }
        model.addAttribute("productDetailNotFound",
                "Không tìm thấy sản phẩm nào có id là: " + id);
        return "product/list";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam String productName, Model model) {
        List<Product> productsFound = new ArrayList<>();
        for (Product product: products) {
            if (product.getName().contains(productName)) {
                productsFound.add(product);
            }
        }

        if (productsFound.isEmpty()) {
            model.addAttribute("productNotFound",
                "Không tìm thấy sản phẩm nào có tên là: " + productName);
        } else {
            model.addAttribute("products", productsFound);
        }

        return "product/list";
    }
}
