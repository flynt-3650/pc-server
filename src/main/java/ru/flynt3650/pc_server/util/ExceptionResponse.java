package ru.flynt3650.pc_server.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private long timestamp;
    private String message;

}
