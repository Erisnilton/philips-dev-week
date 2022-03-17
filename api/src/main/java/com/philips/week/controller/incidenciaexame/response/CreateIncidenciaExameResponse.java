package com.philips.week.controller.incidenciaexame.response;

import com.philips.week.core.domain.IncidenciaExame;

public record CreateIncidenciaExameResponse(

        String identifier,

        Integer regiao_id,

        Integer mes,

        Integer faixa_id,

        Integer qnt_exames
) {

    public static CreateIncidenciaExameResponse fromIncidenciaExame(IncidenciaExame incidenciaExame) {

        return new CreateIncidenciaExameResponse(

                incidenciaExame.identifier(),

                incidenciaExame.regiao_id(),

                incidenciaExame.mes(),

                incidenciaExame.faixa_id(),

                incidenciaExame.qnt_exames()
        );

    }

}
