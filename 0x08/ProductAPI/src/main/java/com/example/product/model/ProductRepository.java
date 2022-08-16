package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        if (list.isEmpty())
            throw new NullPointerException("Lista vázia");
        return list;
    }

    public Product getProductById(Long id) {
        return list.stream().filter(x -> x.getId().equals(id)).findFirst().get();
    }

    public void addProduct(Product s) {
        if (s == null)
            throw new IllegalArgumentException("Product vazio");
        list.add(s);
    }

    public void updateProduct(Product s) {
        Integer index = list.indexOf(s);
        list.set(index, s);    }

    public void removeProduct(Product s) {
        if (list.contains(s))
            list.remove(s);
         else
            throw new NullPointerException("Produto não existe na lista");

    }

    public void addList(List<Product> listOfProducts) {
        if (!listOfProducts.isEmpty())
            list.addAll(listOfProducts);
    }
}
