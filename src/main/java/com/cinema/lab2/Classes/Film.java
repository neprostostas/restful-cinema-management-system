package com.cinema.lab2.Classes;
/**
 * Represents a Film object with a name, release year, genre, and duration.
 */
public class Film {

    private String name;
    private int year;
    private String genre;
    private int duration;

    /**
     * Default constructor for Film class
     */
    public Film() {
    }

    /**
     * Constructor for Film class with four parameters: name, year, genre, and duration.
     * @param name      The name of the film.
     * @param year      The release year of the film.
     * @param genre     The genre of the film.
     * @param duration  The duration of the film in minutes.
     */
    public Film(String name, int year, String genre, int duration) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }

    /**
     * Returns the name of the film.
     * @return The name of the film.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the film.
     * @param name The name of the film.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the release year of the film.
     * @return The release year of the film.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the release year of the film.
     * @param year The release year of the film.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the genre of the film.
     * @return The genre of the film.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the film.
     * @param genre The genre of the film.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns the duration of the film in minutes.
     * @return The duration of the film in minutes.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the film in minutes.
     * @param duration The duration of the film in minutes.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Returns a string representation of the Film object with name, year, genre, and duration.
     * @return A string representation of the Film object with name, year, genre, and duration.
     */
    public String getFilmDetails() {
        return "Name: " + name + ", Year: " + year + ", Genre: " + genre + ", Duration: " + duration + " mins";
    }

    /**
     * Updates the attributes of the film with new values for name, year, genre, and duration.
     * @param name      The new name for the film.
     * @param year      The new release year for the film.
     * @param genre     The new genre for the film.
     * @param duration  The new duration in minutes for the film.
     */
    public void updateFilm(String name, int year, String genre, int duration) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }
}