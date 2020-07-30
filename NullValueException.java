package ru.ruselprom.signs;

public class NullValueException extends Exception {
    public NullValueException() {
    }

    public NullValueException(String message) {
        super(message);
    }

    public NullValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
