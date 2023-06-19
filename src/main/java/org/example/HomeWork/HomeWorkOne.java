package org.example.HomeWork;
/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
 * название которых содержит «высший».
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class HomeWorkOne {
    public static void main(String[] args) {

        Random random = new Random();

        List<ProductFirstTask> productList = createList(random);

        findingMaxPrice(productList);

    }

    /**
     * @param productList принимает массив записей: наименование товара, сорт, цена
     * @apiNote находит наибольшую цену товаров 1го или 2-го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void findingMaxPrice(List<ProductFirstTask> productList) {
        List<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getSort() <= 2 &&
                    productList.get(i).getName().contains("Высший")) {
                priceList.add(productList.get(i).getPrice());
            }
        }
        System.out.println(priceList);
        System.out.println(Collections.max(priceList));
    }

    /**
     * @param random
     * @return ArrayList
     * @apiNote создает массив записей: наименование товара, сорт, цена
     */
    public static ArrayList<ProductFirstTask> createList(Random random) {
        ArrayList<ProductFirstTask> directoryList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ProductFirstTask product =
                    new ProductFirstTask("dscibq", random.nextInt(3), random.nextInt(10000));
            ProductFirstTask product1 =
                    new ProductFirstTask("Высший сорт", random.nextInt(3), random.nextInt(10000));
            ProductFirstTask product2 =
                    new ProductFirstTask("Высшего качества", random.nextInt(3), random.nextInt(10000));
            ProductFirstTask product3 =
                    new ProductFirstTask("Высший качества", random.nextInt(3), random.nextInt(10000));
            directoryList.add(product);
            directoryList.add(product1);
            directoryList.add(product2);
            directoryList.add(product3);
        }
        return directoryList;
    }
}
