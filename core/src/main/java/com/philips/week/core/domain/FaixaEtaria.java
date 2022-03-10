package com.philips.week.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@Accessors(chain = true, fluent = true)
@EqualsAndHashCode(callSuper = true)
public class FaixaEtaria extends AbstractEntity {

    private Integer faixa_n;
    private Integer faixa_i;
    private String descricao;

    public static FaixaEtaria create() {

        return new FaixaEtaria();

    }

}