package controller;

import model.Category;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CategoryService;
import service.IService;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService = new ProductService();
    private final CategoryService categoryService = new CategoryService();
    List<Product> products = productService.findAll();
    List<Category> categoryList = categoryService.findAll();

    @GetMapping("")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreat(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product",new Product());
        modelAndView.addObject("categoryList", categoryList);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView create(int idC, Product product, RedirectAttributes redirectAttributes){
        product.setCategory(categoryService.findById(idC));
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product", productService.findById(id));
        modelAndView.addObject("categoryList", categoryList);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(int idC, Product product){
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        product.setCategory(categoryService.findById(idC));
        productService.update(product.getId(), product);
        return modelAndView;
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView delete(Product product){
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        productService.remove(product.getId());
        return modelAndView;
    }


    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product", productService.findById(id));
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("search");
        List<Product> productList = productService.findByName(name);
        modelAndView.addObject("products", productList);
        return modelAndView;
    }
}
