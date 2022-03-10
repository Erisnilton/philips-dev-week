package com.philips.week.controller.faixaetaria.response;

import com.philips.week.core.domain.FaixaEtaria;

public record CreateFaixaEtariaResponse(
        String identifier, Integer faixa_n, Integer faixa_i, String descricao) {

    public static CreateFaixaEtariaResponse fromFaixaEtaria(FaixaEtaria faixaEtaria) {

        return new CreateFaixaEtariaResponse(
                faixaEtaria.identifier(),
                faixaEtaria.faixa_n(),
                faixaEtaria.faixa_i(),
                faixaEtaria.descricao()
        );

    }
}
