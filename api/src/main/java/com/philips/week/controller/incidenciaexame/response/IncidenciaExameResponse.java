package com.philips.week.controller.incidenciaexame.response;

import com.philips.week.core.domain.IncidenciaExame;

import javax.validation.constraints.NotNull;

public record IncidenciaExameResponse(

        String identifier,

        Integer regiao_id,

        Integer mes,

        Integer faixa_id,

        Integer qnt_exames
) {

    public static IncidenciaExameResponse fromIncidenciaExame(IncidenciaExame incidenciaExame) {

        return new IncidenciaExameResponse(

                incidenciaExame.identifier(),

                incidenciaExame.regiao_id(),

                incidenciaExame.mes(),

                incidenciaExame.faixa_id(),

                incidenciaExame.qnt_exames()
        );

    }

}
