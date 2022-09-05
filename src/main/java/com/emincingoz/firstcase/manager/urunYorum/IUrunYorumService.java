package com.emincingoz.firstcase.manager.urunYorum;

import com.emincingoz.firstcase.domain.dto.urunYorum.UrunYorumDTO;

import java.time.Instant;
import java.util.List;

public interface IUrunYorumService {

    List<UrunYorumDTO> getAllUrunYorumByUrunId(Long urunId);

    List<UrunYorumDTO> getAllUrunYorumBetweenDatesByUrunId(Long urunId, Instant beginDate, Instant endDate);

    List<UrunYorumDTO> getAllUrunYorumByKullaniciId(Long kullaniciId);

    List<UrunYorumDTO> getAllUrunYorumBetweenDatesByKullaniciId(Long kullaniciId, Instant beginDate, Instant endDate);
}
