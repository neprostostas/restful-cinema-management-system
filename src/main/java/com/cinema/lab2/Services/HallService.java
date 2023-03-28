package com.cinema.lab2.Services;
import com.cinema.lab2.Classes.Hall;
import com.cinema.lab2.Data.HallList;
import java.util.ArrayList;
import java.util.List;
/**
 * HallService provides CRUD (Create, Read, Update, Delete) operations for the Hall class.
 * It contains a static list of halls, which serves as a source of data.
 */
public class HallService {

    // Static list of halls, serving as a source of data
    private static final List<Hall> halls = new ArrayList<>(HallList.HALLS);

    /**
     * Returns a list of all the halls in the static list.
     * @return A List<Hall> object containing all the halls.
     */
    public static List<Hall> getAllHalls() {
        return halls;
    }

    /**
     * Returns a Hall object for the specified hall ID.
     * @param id The ID of the hall to retrieve.
     * @return The Hall object for the specified ID, or null if no such hall exists.
     */
    public static Hall getHallById(int id) {
        return halls.get(id);
    }

    /**
     * Adds a new Hall object to the end of the static list.
     * @param hall The Hall object to add.
     */
    public static void addHall(Hall hall) {
        halls.add(hall);
    }

    /**
     * Updates an existing Hall object in the static list.
     * @param index The index of the hall to update.
     * @param hall The updated Hall object.
     */
    public static void updateHall(int index, Hall hall) {
        halls.set(index, hall);
    }

    /**
     * Deletes an existing Hall object from the static list.
     * @param index The index of the hall to delete.
     */
    public static void deleteHall(int index) {
        halls.remove(index);
    }
}