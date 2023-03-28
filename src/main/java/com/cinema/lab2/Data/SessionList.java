package com.cinema.lab2.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.cinema.lab2.Classes.Session;
/**
 * This class represents a list of sessions.
 * It contains a static final list of sessions initialized in the constructor.
 */
public class SessionList {
    // A static final list of sessions
    public static final List<Session> SESSIONS = new ArrayList<>(){{
        // Initializing the sessions
        add(new Session(LocalDateTime.of(2022, 1, 1, 10, 0), FilmList.FILMS.get(0), 100));
        add(new Session(LocalDateTime.of(2022, 1, 1, 12, 0), FilmList.FILMS.get(1), 50));
        add(new Session(LocalDateTime.of(2022, 1, 1, 14, 0), FilmList.FILMS.get(2), 75));
        add(new Session(LocalDateTime.of(2022, 1, 1, 16, 0), FilmList.FILMS.get(3), 150));
        add(new Session(LocalDateTime.of(2022, 1, 2, 10, 0), FilmList.FILMS.get(4), 200));
        add(new Session(LocalDateTime.of(2022, 1, 2, 12, 0), FilmList.FILMS.get(5), 50));
        add(new Session(LocalDateTime.of(2022, 1, 2, 14, 0), FilmList.FILMS.get(0), 75));
        add(new Session(LocalDateTime.of(2022, 1, 2, 16, 0), FilmList.FILMS.get(1), 150));
        add(new Session(LocalDateTime.of(2022, 1, 3, 10, 0), FilmList.FILMS.get(2), 100));
        add(new Session(LocalDateTime.of(2022, 1, 3, 12, 0), FilmList.FILMS.get(3), 50));
    }};
}