package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class AfishaManager {
    private MovieItem[] items = new MovieItem[0];

    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }


    public MovieItem[] getAll() {
//        int resultLength;
//        if () {
//            resultLength = ???
//        } else {
//            resultLength = ???
//        }
//  MovieItem[] result = new MovieItem[resultLength];
//        for (???) {
//            // заполняем result из массива что лежит в поле
//            // в обратном порядке
//        }
//        AfishaManager manager = new AfishaManager();
//        MovieItem[] items = manager.findAll();
         MovieItem[] result = new MovieItem[items.length];
            for (int i = 0; i < result.length - 1; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }

    }







