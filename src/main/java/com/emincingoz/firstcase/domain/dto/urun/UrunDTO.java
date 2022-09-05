package com.emincingoz.firstcase.domain.dto.urun;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UrunDTO {
    private Long id;

    private String name;

    private Double price;

    private Instant expirationDate;
}
