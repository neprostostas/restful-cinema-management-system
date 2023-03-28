package com.cinema.lab2.Controllers;
import com.cinema.lab2.Classes.Film;
import com.cinema.lab2.Classes.Hall;
import com.cinema.lab2.Classes.Session;
import com.cinema.lab2.Services.FilmService;
import com.cinema.lab2.Services.HallService;
import com.cinema.lab2.Services.SessionService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * REST API controller for the Cinema app. Provides endpoints for managing films, halls, and sessions.
 */
@RestController
@RequestMapping("/cinema")
public class CinemaController {

    /**
     * Get all films.
     *
     * @return list of all films
     */
    @GetMapping("/films")
    public List<Film> getAllFilms() {
        return FilmService.getAllFilms();
    }

    /**
     * Get film by id.
     *
     * @param id the id of the film
     * @return the film with the given id
     */
    @GetMapping("/films/{id}")
    public Film getFilmById(@PathVariable int id) {
        return FilmService.getFilmById(id);
    }

    /**
     * Add a new film.
     *
     * @param film the film to add
     */
    @PostMapping("/films")
    public void addFilm(@RequestBody Film film) {
        FilmService.addFilm(film);
    }

    /**
     * Update a film.
     *
     * @param id   the id of the film to update
     * @param film the updated film
     */
    @PutMapping("/films/{id}")
    public void updateFilm(@PathVariable int id, @RequestBody Film film) {
        FilmService.updateFilm(id, film);
    }

    /**
     * Delete a film.
     *
     * @param id the id of the film to delete
     */
    @DeleteMapping("/films/{id}")
    public void deleteFilm(@PathVariable int id) {
        FilmService.deleteFilm(id);
    }

    /**
     * Get all halls.
     *
     * @return list of all halls
     */
    @GetMapping("/halls")
    public List<Hall> getAllHalls() {
        return HallService.getAllHalls();
    }

    /**
     * Get hall by id.
     *
     * @param id the id of the hall
     * @return the hall with the given id
     */
    @GetMapping("/halls/{id}")
    public Hall getHallById(@PathVariable int id) {
        return HallService.getHallById(id);
    }

    /**
     * Add a new hall.
     *
     * @param hall the hall to add
     */
    @PostMapping("/halls")
    public void addHall(@RequestBody Hall hall) {
        HallService.addHall(hall);
    }

    /**
     * Update a hall.
     *
     * @param id   the id of the hall to update
     * @param hall the updated hall
     */
    @PutMapping("/halls/{id}")
    public void updateHall(@PathVariable int id, @RequestBody Hall hall) {
        HallService.updateHall(id, hall);
    }

    /**
     * Delete a hall.
     *
     * @param id the id of the hall to delete
     */
    @DeleteMapping("/halls/{id}")
    public void deleteHall(@PathVariable int id) {
        HallService.deleteHall(id);
    }

    /**
     * Get all sessions.
     *
     * @return list of all sessions
     */
    @GetMapping("/sessions")
    public List<Session> getAllSessions() {
        return SessionService.getAllSessions();
    }

    /**
     * Get session by id.
     *
     * @param id the id of the session
     * @return the session with the given id
     */
    @GetMapping("/sessions/{id}")
    public Session getSessionById(@PathVariable int id) {
        return SessionService.getSessionById(id);
    }

    /**
     * Create new session.
     *
     * @param filmId         the id of the film for the session
     * @param hallId         the id of the hall for the session
     * @param dateTimeStr    the date and time of the session, in ISO format (e.g. "2022-01-01T15:30:00")
     * @param availableSeats the number of available seats for the session
     */
    @PostMapping("/sessions")
    public void createSession(@RequestParam(name = "film") int filmId,
                              @RequestParam(name = "hall") int hallId,
                              @RequestParam(name = "dateTime") String dateTimeStr,
                              @RequestParam(name = "availableSeats") int availableSeats) {
        Film film = FilmService.getFilmById(filmId);
        Hall hall = HallService.getHallById(hallId);
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);

        Session session = new Session(dateTime, film, availableSeats);
        hall.setCapacity(hall.getCapacity() - availableSeats);
        SessionService.addSession(session);
    }

    /**
     * Update a session.
     *
     * @param id             the id of the session to update
     * @param filmId         the id of the film for the session
     * @param hallId         the id of the hall for the session
     * @param dateTimeStr    the date and time of the session, in ISO format (e.g. "2022-01-01T15:30:00")
     * @param availableSeats the number of available seats for the session
     */
    @PutMapping("/sessions/{id}")
    public void updateSession(@PathVariable int id, @RequestParam(name = "film") int filmId,
                              @RequestParam(name = "hall") int hallId,
                              @RequestParam(name = "dateTime") String dateTimeStr,
                              @RequestParam(name = "availableSeats") int availableSeats) {
        Film film = FilmService.getFilmById(filmId);
        Hall hall = HallService.getHallById(hallId);
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);

        Session session = new Session(dateTime, film, availableSeats);
        hall.setCapacity(hall.getCapacity() - availableSeats);
        SessionService.updateSession(id, session);
    }

    /**
     * Delete a session.
     *
     * @param id the id of the session to delete
     */
    @DeleteMapping("/sessions/{id}")
    public void deleteSession(@PathVariable int id) {
        SessionService.deleteSession(id);
    }
}