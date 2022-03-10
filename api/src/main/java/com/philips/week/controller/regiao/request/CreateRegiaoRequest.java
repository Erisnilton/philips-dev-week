package com.philips.week.controller.regiao.request;

import com.philips.week.core.domain.Regiao;

import javax.validation.constraints.NotNull;

public record CreateRegiaoRequest(

        @NotNull
        String regiao,

        @NotNull
        Integer totalExames
){
    public Regiao toRegiao() {

        return Regiao.create().regiao(regiao).total_exames(totalExames);
    }
}