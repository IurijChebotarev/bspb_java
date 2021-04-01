package ru.bspb.lessonEight;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;

import static ru.bspb.lessonEight.Utillities.*;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path path=collectAllLogs();
        List<LogEntry> list=stringLogsToPojo(path);
        List<LogEntry> result=filtredLog(list, Levels.INFO);
        System.out.println(result.toString());
    }
}
