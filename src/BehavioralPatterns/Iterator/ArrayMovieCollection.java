package BehavioralPatterns.Iterator;

// Коллекция фильмов на основе массива
// Этот класс управляет коллекцией фильмов, хранящихся в массиве, и предоставляет итератор для обхода
public class ArrayMovieCollection {
    private String[] movies;
    private int size;

    // Конструктор: инициализирует массив с заданной емкостью для хранения фильмов
    public ArrayMovieCollection(int capacity) {
        movies = new String[capacity];
        size = 0;
    }

    // Метод addMovie(): добавляет новый фильм в коллекцию, если есть свободное место
    public void addMovie(String movie) {
        if (size < movies.length) {
            movies[size++] = movie;
        }
    }

    // Метод createIterator(): возвращает итератор для обхода фильмов в массиве
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);
    }
}
