package com.philips.week.excepctions;

import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Builder
public class HttpErrorInfo {
    private final ZonedDateTime timestamp = ZonedDateTime.now();
    private final String message;
}
