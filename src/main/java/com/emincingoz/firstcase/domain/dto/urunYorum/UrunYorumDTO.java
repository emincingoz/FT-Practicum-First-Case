package com.emincingoz.firstcase.domain.dto.urunYorum;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UrunYorumDTO {
    private Long id;

    private String comment;

    private Instant commentDate;

    private Long urunId;

    private Long kullaniciId;
}
