package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.academiadecodigo.hackaton.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionDtoToSession {


    private SessionService sessionService;


    @Autowired
    public void setSessionService (SessionService sessionService) {

        this.sessionService = sessionService;
    }


    public Session convert (SessionDto sessionDto) {

        Session session = (sessionDto.getId() != null ? sessionService.get(sessionDto.getId()) : new Session());

        session.setRoom(sessionDto.getRoom());
        session.setSeats(sessionDto.getSeats());
        session.setMovie(sessionDto.getMovie());
        session.setAvailable(session.isAvailable());
        session.setMinute(sessionDto.getMinute());
        session.setHour(sessionDto.getHour());
        session.setDay(sessionDto.getDay());
        session.setMonth(sessionDto.getMonth());
        session.setYear(sessionDto.getYear());

        return session;
    }

}
