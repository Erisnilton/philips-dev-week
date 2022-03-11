package com.philips.week.controller.incidenciaexame;

import com.philips.week.controller.incidenciaexame.request.IncidenciaExameRequest;
import com.philips.week.controller.incidenciaexame.response.IncidenciaExameResponse;
import com.philips.week.core.us.incidenciaexame.CreateIncidenciaExameUS;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/incidencias-exames")
@Tag(name = "Incidencias Exames", description = "The Incidência API")
public record IncidenciaExameController(CreateIncidenciaExameUS createIncidenciaExameUS)  {

    @PostMapping
    @ResponseStatus(CREATED)
    public IncidenciaExameResponse create(@RequestBody @Valid IncidenciaExameRequest request) {

        var incidenteExame = createIncidenciaExameUS.apply(request.toIncidenciaExame());
        return  IncidenciaExameResponse.fromIncidenciaExame(incidenteExame);

    }
}
