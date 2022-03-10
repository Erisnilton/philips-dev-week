package com.philips.week.controller.regiao;

import com.philips.week.controller.regiao.request.CreateRegiaoRequest;
import com.philips.week.controller.regiao.response.CreateRegiaoResponse;
import com.philips.week.core.us.regiao.CreateRegiaoUS;
import com.philips.week.core.us.regiao.DeleteRegiaoUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/regioes")
@Tag(name = "Regiões", description = "the Região API")
public record RegiaoController(CreateRegiaoUS createRegiaoUS, DeleteRegiaoUS deleteRegiaoUS) {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new region", tags = {"Regiões"})
    public CreateRegiaoResponse create(@RequestBody @Valid CreateRegiaoRequest request) {

        var regiao = createRegiaoUS.apply(request.toRegiao());

        return CreateRegiaoResponse.fromRegiao(regiao);

    }

    @DeleteMapping("{identifier}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Delete a Region", tags = {"Regiões"})
    public void delete(@PathVariable String identifier) {

        deleteRegiaoUS.apply(identifier);

    }
}
