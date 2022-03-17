package com.philips.week.controller.incidenciaexame.response;

public record FindByIdentifierIncidenciaExameResponse(

        String identifier,

        Integer regiao_id,

        Integer mes,

        Integer faixa_id,

        Integer qnt_exames
) {
}
