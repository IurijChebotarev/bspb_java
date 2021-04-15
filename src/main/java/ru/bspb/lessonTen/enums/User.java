package ru.bspb.lessonTen.enums;

public enum User {
    GEORGE("George");

    private String user;

    public final String user() {
        return user;
    }

    User(String user) {
        this.user = user;
    }
}
