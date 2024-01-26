package dev.xaine.echo.util.logging;

import dev.xaine.echo.util.crypt.Crypt;
import lombok.Getter;

public class CryptFileLogger implements Logger {

    @Getter
    private final Crypt crypt;

    public CryptFileLogger(Crypt crypt) {
        this.crypt = crypt;
    }

    @Override
    public void log(String message) {

    }

    @Override
    public void log(LogLevel level, String message) {

    }
}
