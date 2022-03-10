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
public class IncidenciaExame extends AbstractEntity {

    private Integer Regiao_id;

    private Integer Mes;

    private Long Faixa_id;

    private Integer Qnt_exames;

    public static IncidenciaExame create() {

        return new IncidenciaExame();

    }

}
