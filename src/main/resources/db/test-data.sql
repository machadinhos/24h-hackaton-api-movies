INSERT INTO movie (id, creationTime, updateTime, version, actors, description, director, duration, genre, title)
VALUES (1, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 'Brad Pitt', 'description', 'Quentin Tarantino', 153,
        'War film',
        'Inglorious Basterds'),
       (2, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 'actor1,actor2', 'description', 'director', 120, 'genre',
        'title');

INSERT INTO room (id, creationTime, updateTime, version)
VALUES (1, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0),
       (2, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0);

INSERT INTO session (id, creationTime, updateTime, version, day, hour, isAvailable, minute, month, year, movie_id,
                     room_id)
VALUES (1, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 14, 1, 0, 1, 2023, 1, 1),
       (2, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 17, 1, 0, 1, 2023, 1, 1);

INSERT INTO seat (id, creationTime, updateTime, version, isAvailable, seatNumber, session_id)
VALUES (1, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 1, 1),
       (2, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 2, 1),
       (3, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 3, 1),
       (4, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 4, 1),
       (5, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 5, 1),
       (6, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 6, 1),
       (7, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 7, 1),
       (8, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 8, 1),
       (9, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 9, 1),
       (10, '2019-01-01 00:00:00', '2019-01-01 00:00:00', 0, 1, 10, 1);