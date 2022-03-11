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

    private Integer regiao_id;

    private Integer mes;

    private Integer faixa_id;

    private Integer qnt_exames;

    public static IncidenciaExame create() {

        return new IncidenciaExame();

    }

}
