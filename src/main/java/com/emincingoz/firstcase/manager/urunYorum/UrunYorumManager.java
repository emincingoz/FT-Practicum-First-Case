package com.emincingoz.firstcase.manager.urunYorum;

import com.emincingoz.firstcase.domain.dto.urunYorum.UrunYorumDTO;
import com.emincingoz.firstcase.repository.IUrunYorumRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunYorumManager implements IUrunYorumService {

    private final IUrunYorumRepository urunYorumRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UrunYorumDTO> getAllUrunYorumByUrunId(Long urunId) {
        return modelMapper.map(urunYorumRepository.getAllByUrunId(urunId), new TypeToken<List<UrunYorumDTO>>() {}.getType());
    }

    @Override
    public List<UrunYorumDTO> getAllUrunYorumBetweenDatesByUrunId(Long urunId, Instant beginDate, Instant endDate) {
        return modelMapper.map(
                urunYorumRepository.getAllUrunYorumsBetweenDatesByUrunId(urunId, beginDate, endDate),
                new TypeToken<List<UrunYorumDTO>>() {}.getType()
        );
    }

    @Override
    public List<UrunYorumDTO> getAllUrunYorumByKullaniciId(Long kullaniciId) {
        return modelMapper.map(urunYorumRepository.getAllByKullaniciId(kullaniciId), new TypeToken<List<UrunYorumDTO>>() {}.getType());
    }

    @Override
    public List<UrunYorumDTO> getAllUrunYorumBetweenDatesByKullaniciId(Long kullaniciId, Instant beginDate, Instant endDate) {
        return modelMapper.map(
                urunYorumRepository.getAllUrunYorumsBetweenDatesByKullaniciId(kullaniciId, beginDate, endDate),
                new TypeToken<List<UrunYorumDTO>>() {}.getType()
        );
    }
}
