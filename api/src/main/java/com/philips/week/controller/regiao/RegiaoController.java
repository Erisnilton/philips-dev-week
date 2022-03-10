package com.philips.week.controller.regiao;

import com.philips.week.controller.regiao.request.CreateRegiaoRequest;
import com.philips.week.controller.regiao.response.CreateRegiaoResponse;
import com.philips.week.core.us.regiao.CreateRegiaoUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/regioes")
@Tag(name = "Regiões", description = "the Região API")
public record RegiaoController(CreateRegiaoUS createRegiaoUS) {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new region", tags = {"Regiões"})
    public CreateRegiaoResponse create(@RequestBody @Valid CreateRegiaoRequest request) {

        var regiao = createRegiaoUS.apply(request.toRegiao());

        return CreateRegiaoResponse.fromRegiao(regiao);

    }
}
