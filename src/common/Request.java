package common;

import java.io.Serializable;

public class Request<T> implements Serializable {
    public final String command;
    public final T entity;

    public Request(String command, T entity) {
        this.command = command;
        this.entity = entity;
    }
}
