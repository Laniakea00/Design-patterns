package BehavioralPatterns.Iterator;

// Итератор для коллекции фильмов на основе массива
// Этот класс позволяет пройтись по фильмам, хранящимся в массиве
public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position;

    // Конструктор: принимает массив фильмов и устанавливает начальную позицию
    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
        this.position = 0;
    }

    // Метод hasNext(): проверяет, есть ли еще элементы для обхода
    @Override
    public boolean hasNext() {
        return position < movies.length;
    }

    // Метод next(): возвращает следующий элемент и увеличивает текущую позицию
    @Override
    public String next() {
        return movies[position++];
    }
}