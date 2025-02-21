package ru.flynt3650.pc_server.util.exceptions;

public class PcNotFoundException extends RuntimeException {

    public PcNotFoundException(String message) {
        super(message);
    }
}
