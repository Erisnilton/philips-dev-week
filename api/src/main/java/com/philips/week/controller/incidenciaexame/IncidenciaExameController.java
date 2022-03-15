package com.philips.week.controller.incidenciaexame;

import com.philips.week.controller.faixaetaria.response.FindByIdentifierFaixaEtariaResponse;
import com.philips.week.controller.incidenciaexame.request.IncidenciaExameRequest;
import com.philips.week.controller.incidenciaexame.response.IncidenciaExameResponse;
import com.philips.week.core.us.incidenciaexame.CreateIncidenciaExameUS;
import com.philips.week.core.us.incidenciaexame.DeleteIncidenciaExameUS;
import com.philips.week.core.us.incidenciaexame.FindByIdentifierIncidenteExameUS;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/incidencias-exames")
@Tag(name = "Incidencias Exames", description = "The Incidência API")
public record IncidenciaExameController(
        CreateIncidenciaExameUS createIncidenciaExameUS,
        FindByIdentifierIncidenteExameUS findByIdentifierIncidenteExameUS,
        DeleteIncidenciaExameUS deleteIncidenciaExameUS
)  {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new Incidente Exame")
    public IncidenciaExameResponse create(@RequestBody @Valid IncidenciaExameRequest request) {

        var incidenteExame = createIncidenciaExameUS.apply(request.toIncidenciaExame());
        return  IncidenciaExameResponse.fromIncidenciaExame(incidenteExame);

    }

    @GetMapping("{identifier}")
    @Operation(summary = "Find a incidencia exame by identifier")
    public IncidenciaExameResponse findByIdentifier(@PathVariable String identifier) {

        return findByIdentifierIncidenteExameUS.apply(identifier, IncidenciaExameResponse.class);

    }

    @DeleteMapping("{identifier}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Delete a Incidente Exame")
    public void delete(@PathVariable String identifier) {
        deleteIncidenciaExameUS.apply(identifier);
    }
}
