package com.philips.week.controller.faixaetaria.response;

import com.philips.week.core.domain.FaixaEtaria;

public record FindAllFaixaEtariaResponse(
        String identifier, Integer faixa_n, Integer faixa_i, String descricao) {

    public static FindAllFaixaEtariaResponse fromFaixaEtaria(FaixaEtaria faixaEtaria) {

        return new FindAllFaixaEtariaResponse(
                faixaEtaria.identifier(),
                faixaEtaria.faixa_n(),
                faixaEtaria.faixa_i(),
                faixaEtaria.descricao()
        );

    }
}
