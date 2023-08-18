INSERT INTO movie (id, version, actors, description, director, duration, genre, title)
VALUES (1, 0, 'Brad Pitt', 'description', 'Quentin Tarantino', 153,
        'War film',
        'Inglorious Basterds'),
       (2, 0, 'actor1,actor2', 'description', 'director', 120, 'genre',
        'title');

INSERT INTO room (id, version)
VALUES (1, 0),
       (2, 0);

INSERT INTO session (id, version, day, hour, isAvailable, minute, month, year, movie_id,
                     room_id)
VALUES (1, 0, 1, 14, 1, 0, 1, 2023, 1, 1),
       (2, 0, 1, 17, 1, 0, 1, 2023, 1, 1);

INSERT INTO seat (id, version, isAvailable, seatNumber, session_id)
VALUES (1, 0, 1, 1, 1),
       (2, 0, 1, 2, 1),
       (4, 0, 1, 4, 1),
       (5, 0, 1, 5, 1),
       (3, 0, 1, 3, 1),
       (6, 0, 1, 6, 1),
       (7, 0, 1, 7, 1),
       (8, 0, 1, 8, 1),
       (9, 0, 1, 9, 1),
       (10, 0, 1, 10, 1);