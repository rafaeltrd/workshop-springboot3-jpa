package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class DataBaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -1647525185967125781L;

    public DataBaseException(String msg){
        super(msg);
    }
}
