package org.academiadecodigo.hackaton.converters.javabank;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.academiadecodigo.hackaton.persistence.model.Session;

public class SessionDtoToSession implements Converter<SessionDtoToSession, Session> {

    @Override
    public Session convert (SessionDtoToSession sessionDtoToSession) {

        return null;
    }


    @Override
    public JavaType getInputType (TypeFactory typeFactory) {

        return null;
    }


    @Override
    public JavaType getOutputType (TypeFactory typeFactory) {

        return null;
    }

}
