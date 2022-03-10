package com.philips.week.controller.faixaetaria;

import com.philips.week.controller.faixaetaria.request.CreateFaixaEtariaRequest;
import com.philips.week.controller.faixaetaria.response.CreateFaixaEtariaResponse;
import com.philips.week.core.us.faixaetaria.CreateFaixaEtariaUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/faixa-etarias")
@Tag(name = "Faixas Etárias", description = "the faixa etária API")
public record FaixaEtariaController(CreateFaixaEtariaUS createFaixaEtariaUS) {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new Faixa Etária", tags = {"Faixas Etárias"})
    public CreateFaixaEtariaResponse newFaixaEtaria(@RequestBody @Valid CreateFaixaEtariaRequest request) {

        var faixaEtaria = createFaixaEtariaUS.apply(request.toFaixaEtaria());

        return CreateFaixaEtariaResponse.fromFaixaEtaria(faixaEtaria);

    }
}
