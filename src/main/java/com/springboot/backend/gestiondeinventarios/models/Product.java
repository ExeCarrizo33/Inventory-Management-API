package com.springboot.backend.gestiondeinventarios.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{notBlank.string.product}")
    private String name;

    @NotBlank(message = "{notBlank.string.product}")
    private String description;

    @DecimalMin(value = "0.0", message = "{decimalMin.price.product}")
    private double price;

    @CreationTimestamp
    private LocalDate create_At;


    private LocalDate update_At;




}
