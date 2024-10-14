package BehavioralPatterns.Iterator;

import java.util.List;

// Итератор для коллекции фильмов на основе List
// Этот класс позволяет пройтись по фильмам, хранящимся в List
public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position;

    // Конструктор: принимает коллекцию фильмов и устанавливает начальную позицию
    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
        this.position = 0;
    }

    // Метод hasNext(): проверяет, есть ли еще элементы для обхода
    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    // Метод next(): возвращает следующий элемент и увеличивает текущую позицию
    @Override
    public String next() {
        return movies.get(position++);
    }
}
