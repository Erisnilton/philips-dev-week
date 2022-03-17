package com.philips.week.controller.regiao.response;

import com.philips.week.core.domain.Regiao;

public record FindAllRegioesResponse(

        String identifier,
        String regiao,
        Integer totalExame
) {
    public static FindAllRegioesResponse fromRegiao(Regiao regiao) {

        return new FindAllRegioesResponse(

                regiao.identifier(),

                regiao.regiao(),

                regiao.total_exames()
        );
    }
}
