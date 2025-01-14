package pl.edu.vistula.firstrestapi.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    public Product() {}
    public Product(String name) {this.name=name;}
    public Long getId() {return id;}
    public String getName() {return name;}
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
}
