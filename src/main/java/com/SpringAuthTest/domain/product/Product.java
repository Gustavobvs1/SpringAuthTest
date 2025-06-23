package com.SpringAuthTest.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "products")
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    public Product(ProductRequestDTO data) {
        this.name = data.name();
        this.price = data.price();
    }
}
