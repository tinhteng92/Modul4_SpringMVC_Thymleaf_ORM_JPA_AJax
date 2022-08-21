package service;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryService implements IService<Category> {
    public List<Category> categoryList = new ArrayList<>();

    public CategoryService() {
        categoryList.add(new Category(1,"Son" ));
        categoryList.add(new Category(2, "Phan"));
    }

    @Override
    public List<Category> findAll() {
        return new ArrayList<>(categoryList);
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public Category findById(int id) {
        for (Category c: categoryList){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }


    @Override
    public void update(int id, Category category) {

    }

    @Override
    public void remove(int id) {

    }
}
