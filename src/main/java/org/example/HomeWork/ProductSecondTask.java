package org.example.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
@NoArgsConstructor
@Data
@AllArgsConstructor

public class ProductSecondTask {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer sort;
}
