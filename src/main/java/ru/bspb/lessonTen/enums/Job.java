package ru.bspb.lessonTen.enums;

public enum Job {
    DEVELOPER("Developer"),
    TESTER("Tester"),
    MANAGER("Manager");

    private String job;

    public final String job() {
        return job;
    }

    Job(String job) {
        this.job = job;
    }
}
