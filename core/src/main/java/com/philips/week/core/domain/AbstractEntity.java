package com.philips.week.core.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Accessors(chain = true, fluent = true)
public abstract class AbstractEntity {

    private String id;

    @Indexed(unique = true)
    private String identifier;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updateAt;

    private boolean deleted;

    @Version
    private int version;

    public AbstractEntity() {
        this.identifier = UUID.randomUUID().toString();
        this.deleted = false;
    }

}