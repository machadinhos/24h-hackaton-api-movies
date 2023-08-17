package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.academiadecodigo.hackaton.services.RoomService;
import org.academiadecodigo.hackaton.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionDtoToSession {


    private SessionService sessionService;
    private RoomService roomService;


    @Autowired
    public void setSessionService (SessionService sessionService) {

        this.sessionService = sessionService;
    }


    @Autowired
    public void setRoomService (RoomService roomService) {

        this.roomService = roomService;
    }


    public Session convert (SessionDto sessionDto) {

        Session session = (sessionDto.getId() != null ? sessionService.get(sessionDto.getId()) : new Session());

        session.setId(sessionDto.getId());
        session.setRoom(roomService.get(sessionDto.getRoomNumber()));
        session.setAvailable(session.isAvailable());
        session.setMinute(sessionDto.getMinute());
        session.setHour(sessionDto.getHour());
        session.setDay(sessionDto.getDay());
        session.setMonth(sessionDto.getMonth());
        session.setYear(sessionDto.getYear());

        return session;
    }

}
