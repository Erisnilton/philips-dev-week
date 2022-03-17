package com.philips.week.controller.regiao;

import com.philips.week.controller.regiao.request.CreateRegiaoRequest;
import com.philips.week.controller.regiao.response.CreateRegiaoResponse;
import com.philips.week.controller.regiao.response.FindAllRegioesResponse;
import com.philips.week.controller.regiao.response.FindByIdentifierRegiaoResponse;
import com.philips.week.core.us.regiao.CreateRegiaoUS;
import com.philips.week.core.us.regiao.DeleteRegiaoUS;
import com.philips.week.core.us.regiao.FindAllRegioesUS;
import com.philips.week.core.us.regiao.FindByIdentifierRegiaoUS;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/regioes")
@Tag(name = "Regiões", description = "the Região API")
public record RegiaoController(
        CreateRegiaoUS createRegiaoUS,
        FindAllRegioesUS findAllRegioesUS,
        DeleteRegiaoUS deleteRegiaoUS,
        FindByIdentifierRegiaoUS findByIdentifierRegiaoUS
) {

    @PostMapping
    @ResponseStatus(CREATED)
    @Operation(summary = "Create a new region")
    public CreateRegiaoResponse create(@RequestBody @Valid CreateRegiaoRequest request) {

        var regiao = createRegiaoUS.apply(request.toRegiao());

        return CreateRegiaoResponse.fromRegiao(regiao);

    }

    @GetMapping
    @Operation(summary = "List all region")
    public List<FindAllRegioesResponse> findAll() {
        return  findAllRegioesUS.apply()
                .stream().
                map(FindAllRegioesResponse::fromRegiao)
                .toList();
    }

    @GetMapping("{identifier}")
    @Operation(summary = "Find a Age Group by identifier")
    public FindByIdentifierRegiaoResponse findByIdentifier(@PathVariable String identifier) {

        return findByIdentifierRegiaoUS.apply(identifier, FindByIdentifierRegiaoResponse.class);

    }

    @DeleteMapping("{identifier}")
    @ResponseStatus(NO_CONTENT)
    @Operation(summary = "Delete a Region")
    public void delete(@PathVariable String identifier) {

        deleteRegiaoUS.apply(identifier);

    }
}
