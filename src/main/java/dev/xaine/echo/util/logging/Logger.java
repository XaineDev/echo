package dev.xaine.echo.util.logging;

public interface Logger {

    void log(String message);
    void log(LogLevel level, String message);

    enum LogLevel {
        INFO,
        WARN,
        DEBUG,
        ERROR,
        FATAL
    }
}
