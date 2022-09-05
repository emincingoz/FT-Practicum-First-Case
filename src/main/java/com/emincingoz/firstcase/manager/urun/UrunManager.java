package com.emincingoz.firstcase.manager.urun;

import com.emincingoz.firstcase.domain.dto.urun.UrunDTO;
import com.emincingoz.firstcase.repository.IUrunRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunManager implements IUrunService{

    private final IUrunRepository urunRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<UrunDTO> getAllUrunsDateExpired() {
        return modelMapper.map(urunRepository.getAllUrunsDateExpired(Instant.now()), new TypeToken<List<UrunDTO>>() {}.getType());
    }

    @Override
    public List<UrunDTO> getAllUrunsDateNotExpired() {
        return modelMapper.map(urunRepository.getAllUrunsDateNotExpired(Instant.now()), new TypeToken<List<UrunDTO>>() {}.getType());
    }
}
