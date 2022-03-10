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
public class Regiao extends AbstractEntity {

    private String regiao;

    private Integer total_exames;

    public static Regiao create() {

        return new Regiao();

    }
}
