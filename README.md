# Technologies of distributed systems and parallel computing

## Lab 2 | RESTful веб сервіси

## 👻 Author

Created by **Stanislav Kinash** / **neprostostas**

# 🎥 Cinema Management System 🍿

The `Cinema Management System` is a Java program that allows users to manage films, halls, and sessions.

## 🎞️ FilmList

The `FilmList` class represents a list of films. It contains a static final list of films that is initialized in the constructor.

### Usage 👨‍💻

To use the `FilmList` class, you can simply access the static final `FILMS` list, which contains all the films in the list. Each film in the list is represented by an instance of the `Film` class.

## 🏰 HallList

The `HallList` class represents a list of halls. It contains a static final list of halls initialized in the constructor.

### Usage 👨‍💻

To use this program, simply import the `Hall` and `HallList` classes, and you can access the list of halls by calling `HallList.HALLS`.

## 🕰️ SessionList

The `SessionList` class represents a list of sessions. It contains a static final list of sessions initialized in the constructor.

### Usage 👨‍💻

To use this program, simply import the `Session` and `SessionList` classes, and you can access the list of sessions by calling `SessionList.SESSIONS`. Each session contains information about the film being shown, the date and time of the session, and the number of available seats.

## 🎬 Film Service

The `Film Service` provides CRUD (Create, Read, Update, Delete) operations for a `Film` class. This program contains a static list of films, which serves as a source of data. The `FilmService` class contains methods to perform each of the CRUD operations on this list.

### Implementation 💻

The `FilmService` class is implemented using the following methods:

#### `getAllFilms()`

This method returns a list of all the films in the static list. It returns a `List<Film>` object containing all the films.

#### `getFilmById(int id)`

This method returns a `Film` object for a specified film ID. It takes an `int` ID parameter and returns the `Film` object for the specified ID, or `null` if no such film exists.

#### `addFilm(Film film)`

This method adds a new `Film` object to the end of the static list. It takes a `Film` object as a parameter and adds it to the list.

#### `updateFilm(int index, Film film)`

This method updates an existing `Film` object in the static list.
It takes an `int` index parameter and a `Film` object, and updates the film at the specified index with the new film object.

#### `deleteFilm(int index)`

This method deletes an existing `Film` object from the static list. It takes an `int` index parameter and removes the film at the specified index from the list.

### Usage 👨‍💻

To use the `FilmService` class, simply call one of its methods with the appropriate parameters. For example, to get a list of all the films, you can call the `getAllFilms()` method.

To add a new film to the list, you can create a new `Film` object and pass it to the `addFilm()` method.

To update an existing film in the list, you can get the index of the film to update and create a new `Film` object with the updated information.

To delete an existing film from the list, you can get the index of the film and call the `deleteFilm()` method.

Please note that this program uses a static list of films, which means that any changes made to the list will be visible to all instances of the `FilmService` class.

## 🏰 Hall Service

The `Hall Service` provides CRUD (Create, Read, Update, Delete) operations for a `Hall` class. It contains a static list of halls, which serves as a source of data.

### Implementation 💻

The `HallService` class is implemented using the following methods:

#### `getAllHalls()`

This method returns a list of all the halls in the static list. It returns a `List<Hall>` object containing all the halls.

#### `getHallById(int id)`

This method returns a `Hall` object for a specified hall ID. It takes an `int` ID parameter and returns the `Hall` object for the specified ID or `null` if there is no such hall.

#### `addHall(Hall hall)`

This method adds a new `Hall` object to the end of the static list. It takes a `Hall` object as a parameter and adds it to the list.

#### `updateHall(int index, Hall hall)`

This method updates an existing `Hall` object in the static list. It takes an `int` index parameter and a `Hall` object, and updates the hall at the specified index with the new hall object.

#### `deleteHall(int index)`

This method deletes an existing `Hall` object from the static list. It takes an `int` index parameter and removes the hall at the specified index from the list.

### Usage 👨‍💻

To use the `HallService` class, simply call one of its methods with the appropriate parameters. For example, to get a list of all the halls, you can call the `getAllHalls()` method.

To add a new hall to the list, you can create a new `Hall` object and pass it to the `addHall()` method.

To update an existing hall in the list, you can get the index of the hall to update and create a new `Hall` object with the updated information.

To delete an existing hall from the list, you can get the index of the hall and call the `deleteHall()` method.

Please note that this program uses a static list of halls, which means that any changes made to the list will be visible to all instances of the `HallService` class.

## 🎟️ Session Service

The `Session Service` provides CRUD (Create, Read, Update, Delete) operations for a `Session` class. It contains a static list of sessions, which serves as a source of data.

### Implementation 💻

The `SessionService` class is implemented using the following methods:

#### `getAllSessions()`

This method returns a list of all the sessions in the static list. It returns a `List<Session>` object containing all the sessions.

#### `getSessionById(int id)`

This method returns a `Session` object for a specified session ID. It takes an `int` ID parameter and returns the `Session` object for the specified ID or `null` if there is no such session.

#### `addSession(Session session)`

This method adds a new `Session` object to the end of the static list. It takes a `Session` object as a parameter and adds it to the list.

#### `updateSession(int index, Session session)`

This method updates an existing `Session` object in the static list. It takes an `int` index parameter and a `Session` object, and updates the session at the specified index with the new session object.

#### `deleteSession(int index)`

This method deletes an existing `Session` object from the static list. It takes an `int` index parameter and removes the session at the specified index from the list.

### Usage 👨‍💻

To use the `SessionService` class, simply call one of its methods with the appropriate parameters. For example, to get a list of all the sessions, you can call the `getAllSessions()` method.

To add a new session to the list, you can create a new `Session` object and pass it to the `addSession()` method.

To update an existing session in the list, you can get the index of the session to update and create a new `Session` object with the updated information.

To delete an existing session from the list, you can get the index of the session and call the `deleteSession()` method.

Please note that this program uses static lists, which means that any changes made to the list will be visible to all instances of the respective service class.

## 🚨 Note

Please note that this program uses static lists, which means that any changes made to the list will be visible to all instances of the respective service class.

## 📫 Contact

If you have any questions or concerns, please contact the author at **neprostostas.gg@gmail.com**