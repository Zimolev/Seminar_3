package org.example.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
 * название которых содержит «высший».
 */
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductFirstTask {
    private String name;
    private int sort;
    private int price;

}
