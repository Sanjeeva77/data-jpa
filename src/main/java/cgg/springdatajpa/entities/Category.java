package cgg.springdatajpa.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Category {

    @Id
    private int categoryId;
    private String categoryName;

    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Products> products;
}
