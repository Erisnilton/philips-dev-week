package com.philips.week.controller.faixaetaria;

import com.philips.week.controller.faixaetaria.request.CreateFaixaEtariaRequest;
import com.philips.week.controller.faixaetaria.response.CreateFaixaEtariaResponse;
import com.philips.week.controller.faixaetaria.response.FindAllFaixaEtariaResponse;
import com.philips.week.controller.faixaetaria.response.FindByIdentifierFaixaEtariaResponse;
import com.philips.week.core.us.faixaetaria.CreateFaixaEtariaUS;
import com.philips.week.core.us.faixaetaria.DeleteFaixaEtariaUS;
import com.philips.week.core.us.faixaetaria.FindAllFaixaEtariaUS;
import com.philips.week.core.us.faixaetaria.FindByIdentifierFaixaEtariaUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/faixa-etarias")
@Tag(name = "Faixas Etárias", description = "the faixa etária API")
public record FaixaEtariaController(
        CreateFaixaEtariaUS createFaixaEtariaUS,
        FindAllFaixaEtariaUS findAllFaixaEtariaUS,
        FindByIdentifierFaixaEtariaUS findByIdentifierFaixaEtariaUS,
        DeleteFaixaEtariaUS deleteFaixaEtariaUS) {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new Age Group", tags = {"Faixas Etárias"})
    public CreateFaixaEtariaResponse create(@RequestBody @Valid CreateFaixaEtariaRequest request) {

        var faixaEtaria = createFaixaEtariaUS.apply(request.toFaixaEtaria());

        return CreateFaixaEtariaResponse.fromFaixaEtaria(faixaEtaria);

    }

    @GetMapping
    @Operation(summary = "List all Age Group", tags = {"Faixas Etárias"})
    public List<FindAllFaixaEtariaResponse>findAll() {
        return  findAllFaixaEtariaUS.apply()
                .stream()
                    .map(FindAllFaixaEtariaResponse::fromFaixaEtaria)
                .toList();
    }


    @GetMapping("{identifier}")
    @Operation(summary = "Find a Age Group by identifier", tags = {"Faixas Etárias"})
    public FindByIdentifierFaixaEtariaResponse findByIdentifier(@PathVariable String identifier) {

        return findByIdentifierFaixaEtariaUS.apply(identifier, FindByIdentifierFaixaEtariaResponse.class);

    }

    @DeleteMapping("{identifier}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Delete a Age Group", tags = {"Faixas Etárias"})
    public void delete(@PathVariable String identifier) {

        deleteFaixaEtariaUS.apply(identifier);

    }
}
