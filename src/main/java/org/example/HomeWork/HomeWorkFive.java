package org.example.HomeWork;

/**
 * при входном массиве, вернуть массив массивов со всеми перестановками его элементов.
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class HomeWorkFive {
    int[] array = {1, 2, 3};

    void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}





