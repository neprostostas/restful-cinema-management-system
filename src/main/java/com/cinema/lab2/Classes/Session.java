package com.cinema.lab2.Classes;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Session class represents a film session with a specific date and available seats.
 * It also contains a reference to the Film being shown during the session.
 */
public class Session {
    private LocalDateTime dateTime;
    private Film film;
    private int availableSeats;
    private static final List<Session> sessions = new ArrayList<>();

    /**
     * Default constructor for Session class
     */
    public Session() {
    }

    /**
     * Constructs a new Session object with a specific date, Film and number of available seats.
     * @param dateTime the date and time of the session.
     * @param film the film being shown during the session.
     * @param availableSeats the number of available seats for the session.
     */
    public Session(LocalDateTime dateTime, Film film, int availableSeats) {
        this.dateTime = dateTime;
        this.film = film;
        this.availableSeats = availableSeats;
    }

    /**
     * Returns the date and time of the session.
     * @return the date and time of the session.
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the date and time of the session.
     * @param dateTime the date and time of the session.
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Returns the film being shown during the session.
     * @return the film being shown during the session.
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Sets the film being shown during the session.
     * @param film the film being shown during the session.
     */
    public void setFilm(Film film) {
        this.film = film;
    }

    /**
     * Returns the number of available seats for the session.
     * @return the number of available seats for the session.
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the number of available seats for the session.
     * @param availableSeats the number of available seats for the session.
     */
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    /**
     * Returns a list of all the sessions stored in the system.
     * @return a list of all the sessions stored in the system.
     */
    public static List<Session> getAllSessions() {
        return sessions;
    }

    /**
     * Adds a new session to the system.
     * @param session the new session to be added to the system.
     */
    public static void addSession(Session session) {
        sessions.add(session);
    }

    /**
     * Updates an existing session in the system.
     * @param index the index of the session to be updated.
     * @param session the updated session object.
     */
    public static void updateSession(int index, Session session) {
        sessions.set(index, session);
    }
}