package dev.xaine.echo.util.system;

public enum ECHO_EXIT_VALUES {
    SUCCESS(0),
    INVALID_LOAD_STATE(-10),
    DAEMON_INTERRUPTED(-11)
    ;

    private final int value;

    ECHO_EXIT_VALUES(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
