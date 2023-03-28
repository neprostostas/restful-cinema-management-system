package com.cinema.lab2.Services;
import com.cinema.lab2.Classes.Session;
import com.cinema.lab2.Data.SessionList;

import java.util.List;
/**
 * SessionService provides CRUD (Create, Read, Update, Delete) operations for the Session class.
 * It contains a static list of sessions, which serves as a source of data.
 */
public class SessionService {

    // Static list of sessions, serving as a source of data
    private static final List<Session> sessions = SessionList.SESSIONS;

    /**
     * Returns a list of all the sessions in the static list.
     * @return A List<Session> object containing all the sessions.
     */
    public static List<Session> getAllSessions() {
        return sessions;
    }

    /**
     * Returns a Session object for the specified session ID.
     * @param id The ID of the session to retrieve.
     * @return The Session object for the specified ID, or null if no such session exists.
     */
    public static Session getSessionById(int id) {
        return sessions.get(id);
    }

    /**
     * Adds a new Session object to the end of the static list.
     * @param session The Session object to add.
     */
    public static void addSession(Session session) {
        sessions.add(session);
    }

    /**
     * Updates an existing Session object in the static list.
     * @param index The index of the session to update.
     * @param session The updated Session object.
     */
    public static void updateSession(int index, Session session) {
        sessions.set(index, session);
    }

    /**
     * Deletes an existing Session object from the static list.
     * @param index The index of the session to delete.
     */
    public static void deleteSession(int index) {
        sessions.remove(index);
    }
}