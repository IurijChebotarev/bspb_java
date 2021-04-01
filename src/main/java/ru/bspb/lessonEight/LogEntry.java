package ru.bspb.lessonEight;

public class LogEntry {
    private String timestamp;
    private String level;
    private String message;

    public LogEntry() {
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogEntry(String timestamp, String level, String message) {
        super();
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }

    @Override
    public String toString() {
        return "LogEntry [timestamp=" + timestamp + ", level=" + level + ", message=" + message + "]";
    }
}
