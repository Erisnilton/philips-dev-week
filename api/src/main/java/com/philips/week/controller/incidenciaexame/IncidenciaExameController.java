package com.philips.week.controller.incidenciaexame;

import com.philips.week.controller.incidenciaexame.request.IncidenciaExameRequest;
import com.philips.week.controller.incidenciaexame.response.CreateIncidenciaExameResponse;
import com.philips.week.controller.incidenciaexame.response.FindAllIncidenciaExameResponse;
import com.philips.week.controller.regiao.response.FindByIdentifierRegiaoResponse;
import com.philips.week.core.us.incidenciaexame.CreateIncidenciaExameUS;
import com.philips.week.core.us.incidenciaexame.DeleteIncidenciaExameUS;
import com.philips.week.core.us.incidenciaexame.FindAllIncidenciaExamesUS;
import com.philips.week.core.us.incidenciaexame.FindByIdentifierIncidenteExameUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/incidencias-exames")
@Tag(name = "Incidencias Exames", description = "The Incidência API")
public record IncidenciaExameController(
        CreateIncidenciaExameUS createIncidenciaExameUS,
        FindAllIncidenciaExamesUS findAllIncidenciaExamesUS,
        FindByIdentifierIncidenteExameUS findByIdentifierIncidenteExameUS,
        DeleteIncidenciaExameUS deleteIncidenciaExameUS
)  {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new Incidente Exame")
    public CreateIncidenciaExameResponse create(@RequestBody @Valid IncidenciaExameRequest request) {

        var incidenteExame = createIncidenciaExameUS.apply(request.toIncidenciaExame());
        return  CreateIncidenciaExameResponse.fromIncidenciaExame(incidenteExame);

    }

    @GetMapping
    @Operation(summary = "List all Incidencias Exames")
    public List<FindAllIncidenciaExameResponse> findAll() {
        return findAllIncidenciaExamesUS.apply()
                .stream()
                .map(FindAllIncidenciaExameResponse::fromIncidenciaExame)
                .toList();
    }

    @GetMapping("{identifier}")
    @Operation(summary = "Find a incidencia exame by identifier")
    public FindByIdentifierRegiaoResponse findByIdentifier(@PathVariable String identifier) {

        return findByIdentifierIncidenteExameUS.apply(identifier, FindByIdentifierRegiaoResponse.class);

    }

    @DeleteMapping("{identifier}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Delete a Incidente Exame")
    public void delete(@PathVariable String identifier) {
        deleteIncidenciaExameUS.apply(identifier);
    }
}
