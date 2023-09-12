package cgg.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
