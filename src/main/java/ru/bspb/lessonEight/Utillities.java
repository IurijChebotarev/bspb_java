package ru.bspb.lessonEight;

import org.apache.commons.io.FileUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utillities {

    public static Path collectAllLogs() throws IOException, URISyntaxException {

        URL url = Utillities.class.getClassLoader().getResource("ru/bspb/lessonEight/");
        Path files = Path.of(url != null ? url.toURI() : null);
        Path tempFile = Files.createTempFile(files, "out", ".log");

        List<Path> linksList = Files.walk(Paths.get(String.valueOf(files)))
                .filter(Files::isRegularFile)
                .filter(file -> file.toString().endsWith(".log"))
                .collect(Collectors.toList());
        List<String> allLogsList;
        for (Path path : linksList) {
            allLogsList = Files.readAllLines(path);
            FileUtils.writeLines(tempFile.toFile(), allLogsList, true);

        }
        return tempFile;
    }

    public static List<LogEntry> stringLogsToPojo(Path tempFile) throws IOException {
        List<LogEntry> logEntryList = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(tempFile)) {
            String row = br.readLine();
            while (row != null) {
                String[] attributes = row.split("\\s-\\s{1}|\\s\\s", 3);
                LogEntry entry = getOneEntry(attributes);
                logEntryList.add(entry);
                row = br.readLine();
            }
        }
        Files.deleteIfExists(tempFile);
        return logEntryList;
    }

    private static LogEntry getOneEntry(String[] attributes) {
        String timestamp = attributes[0];
        String level = attributes[1];
        String message = attributes[2];
        LogEntry entry = new LogEntry(timestamp, level, message);

        return entry;
    }

    public static List<LogEntry> filtredLog(List<LogEntry> logs, Levels level) {
        return logs.stream()
                .filter(log -> log.getLevel().equals(level.name()))
                .collect(Collectors.toList());
    }

}










