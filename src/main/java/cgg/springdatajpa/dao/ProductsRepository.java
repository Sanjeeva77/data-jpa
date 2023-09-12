package cgg.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.entities.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer> {

}
