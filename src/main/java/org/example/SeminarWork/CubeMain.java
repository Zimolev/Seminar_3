package org.example.SeminarWork;

import java.util.*;

public class CubeMain {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "black","Дерево");
        Cube cube2 = new Cube(4, "red","Still");
        Cube cube3 = new Cube(3, "yellow","Still");
        Cube cube4 = new Cube(5, "yellow","Дерево");
        Cube cube5 = new Cube(5, "yellow","Дерево");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);


        /**Найти:
         - количество кубиков желтого цвета и их суммарный объем;
         - количество деревянных кубиков с ребром 3 см
         */
        Integer k = 0;
        Integer sumValue = 0;
        Integer kWood = 0;

        for (Cube cube:cubeList) {
            if (cube.getColor().equals("yellow")) {
                k++;
                sumValue += cube.volumeCube();
            }
            if (cube.getMaterial().equals("Дерево") && cube.getSize() == 3){
                kWood++;
            }
        }
        System.out.println("количество кубиков желтого цвета и их суммарный объем " + k + " " + sumValue);
        System.out.println("количество деревянных кубиков с ребром 3 см " + kWood);
        HashSet cubeSet = (HashSet) unicColection(cubeList);
        for (Object cube:cubeSet) {
            System.out.println(cube);
        }
    }

    private static Collection unicColection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
