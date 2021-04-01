package ru.bspb.lessonEight;

public enum Levels {
    WARN("WARN"),
    INFO("INFO"),
    DEBUG("DEBUG");

    private String level;

    public final String level() {
        return level;
    }

    Levels(String level) {
        this.level = level;
    }
}
