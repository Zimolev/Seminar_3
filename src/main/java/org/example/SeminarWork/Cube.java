package org.example.SeminarWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 Найти:
 - количество кубиков желтого цвета и их суммарный объем;
 - количество деревянных кубиков с ребром 3 см
 */
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cube {
        private Integer size;
        private String color;
        private String material;

        public Integer volumeCube(){
                return size * size * size;
        }
}

