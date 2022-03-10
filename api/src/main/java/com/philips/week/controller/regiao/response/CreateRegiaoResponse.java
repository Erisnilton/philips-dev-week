package com.philips.week.controller.regiao.response;

import com.philips.week.core.domain.Regiao;

public record CreateRegiaoResponse(

        String identifier,
        String regiao,
        Integer totalExame
) {
    public static CreateRegiaoResponse fromRegiao(Regiao regiao) {

        return new CreateRegiaoResponse(

                regiao.identifier(),

                regiao.regiao(),

                regiao.total_exames()
        );
    }
}
