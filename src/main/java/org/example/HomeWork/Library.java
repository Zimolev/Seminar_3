package org.example.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены,
 * года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Library {
    private String titles;
    private String FIO;
    private Integer price;
    private Integer yearOfPublication;
    private Integer numberOfPages;
}
