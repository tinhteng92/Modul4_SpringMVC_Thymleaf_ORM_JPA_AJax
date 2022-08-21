package service;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IService<Product> {
    public List<Product> products = new ArrayList<>();
    CategoryService categoryService = new CategoryService();
    public ProductService() {
        products.add(new Product(1, "3CE Velvet Lip Tint", 200, "https://lisa.vn/wp-content/uploads/2020/04/son-3ce-cloud-lip-tint-rest-day-cam-do-600x600-1.jpg", categoryService.categoryList.get(0), true));
        products.add(new Product(2, "Shu Umera 144", 300, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXXwwzLWc5rBs9C75o_DBhgXJRgY7xvDDb3A&usqp=CAU", categoryService.categoryList.get(0), false));
        products.add(new Product(2, "Sadoer", 250, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIpiR-Ax1fIzXPjmxYJoEkCZHeyje1fnnDbg&usqp=CAU", categoryService.categoryList.get(1), true));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p: products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        products.set(findIndex(id),product);
    }

    @Override
    public void remove(int id) {
        products.remove(findIndex(id));
    }

    public int findIndex(int id){
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>(products);
        List<Product> searchList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                searchList.add(list.get(i));
            }
        }
        return searchList;
    }

}
