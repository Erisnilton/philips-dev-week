package com.philips.week.controller.faixaetaria.request;

import com.philips.week.core.domain.FaixaEtaria;

import javax.validation.constraints.NotNull;

public record CreateFaixaEtariaRequest(
        @NotNull
        Integer faixa_n,

        @NotNull
        Integer faixa_i,

        String descricao) {

    public FaixaEtaria toFaixaEtaria() {

        return FaixaEtaria.create()
                .faixa_n(faixa_n)
                .faixa_i(faixa_i)
                .descricao(descricao);
    }

}
