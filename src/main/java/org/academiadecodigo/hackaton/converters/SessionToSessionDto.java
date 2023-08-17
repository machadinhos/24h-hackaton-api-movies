package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.persistence.model.Session;

public class SessionToSessionDto extends AbstractConverter<Session, SessionDto> {

    @Override
    public SessionDto convert (Session session) {

        SessionDto sessionDto = new SessionDto();

        sessionDto.setId(session.getId());
        sessionDto.setRoom(session.getRoom());
        sessionDto.setSeats(session.getSeats());
        sessionDto.setMovie(session.getMovie());
        sessionDto.setAvailable(session.isAvailable());
        sessionDto.setMinute(session.getMinute());
        sessionDto.setHour(session.getHour());
        sessionDto.setDay(session.getDay());
        sessionDto.setMonth(session.getMonth());
        sessionDto.setYear(session.getYear());

        return sessionDto;
    }

}
