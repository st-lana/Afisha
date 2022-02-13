package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

class AfishaManagerTest {

    private MovieItem movie1 = new MovieItem(1, 111, "Бладшот", "Боевик");
    private MovieItem movie2 = new MovieItem(2, 122, "Вперед", "Мультфильм");
    private MovieItem movie3 = new MovieItem(3, 133, "Отель 'Белград'", "Комедия");
    private MovieItem movie4 = new MovieItem(4, 144, "Джентльмены", "Боевик");
    private MovieItem movie5 = new MovieItem(5, 155, "Человек-невидимка", "Ужасы");
    private MovieItem movie6 = new MovieItem(6, 166, "Тролли.Мировой тур", "Мультфильм");
    private MovieItem movie7 = new MovieItem(1, 1, "Номер один", "Комедия");


    @Test
    public void shouldAddMovies() {
        AfishaManager manager = new AfishaManager();

        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);

    }

    @Test
    public void shouldFindAllMovies() {
        AfishaManager manager = new AfishaManager();
        manager.findAll();


    }

    @Test
    public void shouldGetInReverseOrder() {
        AfishaManager manager = new AfishaManager();
        manager.getAll();

    }


}