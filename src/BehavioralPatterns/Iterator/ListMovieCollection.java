package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

// Коллекция фильмов на основе List
// Этот класс управляет коллекцией фильмов, хранящихся в списке, и предоставляет итератор для обхода
public class ListMovieCollection {
    private List<String> movies;

    // Конструктор: инициализирует пустой список для хранения фильмов
    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    // Метод addMovie(): добавляет новый фильм в коллекцию
    public void addMovie(String movie) {
        movies.add(movie);
    }

    // Метод createIterator(): возвращает итератор для обхода фильмов в списке
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);
    }
}