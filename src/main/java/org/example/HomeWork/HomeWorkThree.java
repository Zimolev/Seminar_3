package org.example.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkThree {
    public static void main(String[] args) {

        List<Library> libraryList = createLibrary();
        findBookTitles(libraryList);
    }

    /**
     * @return ArrayList
     * @apiNote Сведения о книге состоят из названия, фамилии автора, цены,
     * года издания и количества страниц.
     */
    public static ArrayList<Library> createLibrary() {
        ArrayList<Library> libraryArrayList = new ArrayList<>();
        libraryArrayList.add(new Library("Гарри Поттер и философский камень", "Джоан Ро́улинг", 500, 1997, 400));
        libraryArrayList.add(new Library("Гарри Поттер и Тайная комната", "Джоан Ро́улинг", 600, 1998, 450));
        libraryArrayList.add(new Library("Гарри Поттер и узник Азкабана", "Джоан Ро́улинг", 600, 1999, 450));
        libraryArrayList.add(new Library("Гарри Поттер и Кубок огня", "Джоан Ро́улинг", 700, 2000, 757));
        libraryArrayList.add(new Library("Гарри Поттер и Орден Феникса", "Джоан Ро́улинг", 800, 2003, 900));
        libraryArrayList.add(new Library("Гарри Поттер и Принц-полукровка", "Джоан Ро́улинг", 600, 2005, 500));
        libraryArrayList.add(new Library("Гарри Поттер и Дары Смерти", "Джоан Ро́улинг", 700, 2010, 700));
        libraryArrayList.add(new Library("Гарри Поттер и Проклятое дитя", "Джоан Ро́улинг", 300, 2016, 347));

        return libraryArrayList;
    }

    /**
     * @param libraries
     * @apiNote Находит названия книг,
     * в которых простое количество страниц, фамилия автора содержит «А»
     * и год издания после 2010 г, включительно.
     */
    public static void findBookTitles(List<Library> libraries) {
        List<String> titlesBooks = new ArrayList<>();
        for (Library book : libraries) {
            if (book.getYearOfPublication() >= 2010 &&
                    checkNaturalNumber(book.getNumberOfPages()) &&
                    book.getFIO().contains(String.valueOf('а'))) {
                titlesBooks.add(book.getTitles());
            }
        }
        System.out.println(titlesBooks);
    }

    /**
     * @param number, принимает на вход целое число
     * @return возвращает true or false
     * @apiNote Проверяет является ли число число простым
     */
    private static boolean checkNaturalNumber(int number) {
        int count = 2;
        while (count <= number / 2) {
            if (number % count == 0)
                return false;
            count++;
        }
        return true;
    }

}
