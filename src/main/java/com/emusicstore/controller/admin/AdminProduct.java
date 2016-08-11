package com.emusicstore.controller.admin;

import com.emusicstore.model.Product;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by RAHUL on 8/10/2016.
 */

@Controller
@RequestMapping("/admin")
public class AdminProduct {

    private Path path;

    @Autowired
    private ProductService productService;
    @RequestMapping("/product/addProduct")
    public String addProduct(Model model)
    {
        Product product = new Product();
        product.setProductCategory("instrument");
        product.setProductCondition("new");
        product.setProductStatus("active");

        model.addAttribute("product",product);
        return "addProduct";
    }

    //@Valid is to check for fields
    //@ModelAttribute is used to grab product object
    //@BindingResult is going to check for errors
    //HttpServletRequest is going to get the path to the image
    @RequestMapping(value = "/product/addProduct",method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") Product product,
                                 BindingResult result, HttpServletRequest request)
    {
        if(result.hasErrors())
        {
            return "addProduct";
        }

        productService.addProduct(product);

        MultipartFile productImage = product.getProductImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory+"\\WEB-INF\\resources\\images\\"+product.getProductId()+".png");

        if(productImage!=null && !productImage.isEmpty())
        {
            try{
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e)
            {
                e.printStackTrace();
                throw new RuntimeException("Product image saving failed",e);
            }
        }
        return "redirect:/admin/productInventory";
    }
}
