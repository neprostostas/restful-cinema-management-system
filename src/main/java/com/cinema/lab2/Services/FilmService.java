package com.cinema.lab2.Services;
import com.cinema.lab2.Classes.Film;
import com.cinema.lab2.Data.FilmList;
import java.util.ArrayList;
import java.util.List;
/**
 * FilmService provides CRUD (Create, Read, Update, Delete) operations for the Film class.
 * It contains a static list of films, which serves as a source of data.
 */
public class FilmService {

    // Static list of films, serving as a source of data
    private static final List<Film> films = new ArrayList<>(FilmList.FILMS);

    /**
     * Returns a list of all the films in the static list.
     * @return A List<Film> object containing all the films.
     */
    public static List<Film> getAllFilms() {
        return films;
    }

    /**
     * Returns a Film object for the specified film ID.
     * @param id The ID of the film to retrieve.
     * @return The Film object for the specified ID, or null if no such film exists.
     */
    public static Film getFilmById(int id) {
        return films.get(id);
    }

    /**
     * Adds a new Film object to the end of the static list.
     * @param film The Film object to add.
     */
    public static void addFilm(Film film) {
        films.add(film);
    }

    /**
     * Updates an existing Film object in the static list.
     * @param index The index of the film to update.
     * @param film The updated Film object.
     */
    public static void updateFilm(int index, Film film) {
        films.set(index, film);
    }

    /**
     * Deletes an existing Film object from the static list.
     * @param index The index of the film to delete.
     */
    public static void deleteFilm(int index) {
        films.remove(index);
    }

}