package com.philips.week.controller.regiao.response;

public record FindByIdentifierRegiaoResponse(
        String identifier,
        String regiao,
        Integer total_exames
) {
}
