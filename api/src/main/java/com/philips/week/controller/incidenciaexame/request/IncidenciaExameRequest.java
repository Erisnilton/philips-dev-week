package com.philips.week.controller.incidenciaexame.request;

import com.philips.week.core.domain.IncidenciaExame;

import javax.validation.constraints.NotNull;

public record IncidenciaExameRequest(

        @NotNull
        Integer regiao_id,

        @NotNull
        Integer mes,

        @NotNull
        Integer faixa_id,

        @NotNull
        Integer qnt_exames
) {

    public IncidenciaExame toIncidenciaExame() {

        return  IncidenciaExame.create()
                .regiao_id(regiao_id)
                .mes(mes)
                .faixa_id(faixa_id)
                .qnt_exames(qnt_exames);

    }
}
