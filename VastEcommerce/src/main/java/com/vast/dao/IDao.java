package com.vast.dao;

import java.util.Set;

import com.vast.vo.Product;

public interface IDao {

	Set<Product> getProduct(String category);
}
