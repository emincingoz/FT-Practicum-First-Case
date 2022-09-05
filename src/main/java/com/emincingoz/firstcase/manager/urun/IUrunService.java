package com.emincingoz.firstcase.manager.urun;

import com.emincingoz.firstcase.domain.dto.urun.UrunDTO;

import java.util.List;

public interface IUrunService {
    List<UrunDTO> getAllUrunsDateExpired();

    List<UrunDTO> getAllUrunsDateNotExpired();
}
