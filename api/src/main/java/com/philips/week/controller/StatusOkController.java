package com.philips.week.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Map.of;

@RestController
@RequestMapping
@Tag(name = "status", description = "the status API")
public class StatusOkController {


    @GetMapping
    @Operation(summary = "Status ok", tags = {"status"})
    public Map<String, String> ok() {
        return of("status", "ok");
    }

}
