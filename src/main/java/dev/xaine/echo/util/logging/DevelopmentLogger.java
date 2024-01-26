package dev.xaine.echo.util.logging;

public class DevelopmentLogger implements Logger {
    @Override
    public void log(String message) {
        log(LogLevel.INFO, message);
    }

    @Override
    public void log(LogLevel level, String message) {
        System.out.printf("[%s] %s%n", level.name(), message);
    }
}
