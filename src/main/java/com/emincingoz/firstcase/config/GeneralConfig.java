package com.emincingoz.firstcase.config;

import com.emincingoz.firstcase.domain.model.Kullanici;
import com.emincingoz.firstcase.domain.model.Urun;
import com.emincingoz.firstcase.domain.model.UrunYorum;
import com.emincingoz.firstcase.repository.IKullaniciRepository;
import com.emincingoz.firstcase.repository.IUrunRepository;
import com.emincingoz.firstcase.repository.IUrunYorumRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Configuration
public class GeneralConfig {

    @Bean
    CommandLineRunner commandLineRunner(IKullaniciRepository kullaniciRepository,
                                        IUrunRepository urunRepository,
                                        IUrunYorumRepository urunYorumRepository) {
        return args -> {
            Kullanici kullanici1 = new Kullanici("name1", "surname1", "email1", "phone1");
            Kullanici kullanici2 = new Kullanici("name2", "surname2", "email2", "phone2");
            Kullanici kullanici3 = new Kullanici("name3", "surname3", "email3", "phone3");
            Kullanici kullanici4 = new Kullanici("name4", "surname4", "email4", "phone4");

            kullaniciRepository.saveAll(List.of(kullanici1, kullanici2, kullanici3, kullanici4));

            Urun urun1 = new Urun("name1", 13.30, LocalDateTime.of(2022, 6, 7, 10, 30).toInstant(ZoneOffset.UTC));
            Urun urun2 = new Urun("name2", 14.30, LocalDateTime.of(2022, 7, 12, 11, 30).toInstant(ZoneOffset.UTC));
            Urun urun3 = new Urun("name3", 15.30, LocalDateTime.of(2022, 8, 14, 12, 30).toInstant(ZoneOffset.UTC));
            Urun urun4 = new Urun("name4", 16.30, LocalDateTime.of(2022, 9, 16, 13, 30).toInstant(ZoneOffset.UTC));
            Urun urun5 = new Urun("name5", 17.30, LocalDateTime.of(2022, 10, 18, 14, 30).toInstant(ZoneOffset.UTC));
            Urun urun6 = new Urun("name6", 18.30, LocalDateTime.of(2022, 11, 20, 15, 30).toInstant(ZoneOffset.UTC));

            urunRepository.saveAll(List.of(urun1, urun2, urun3, urun4, urun5, urun6));

            UrunYorum urunYorum1 = new UrunYorum("comment1", LocalDateTime.of(2022, 5, 10, 13, 10).toInstant(ZoneOffset.UTC), Long.valueOf(1), Long.valueOf(1));
            UrunYorum urunYorum2 = new UrunYorum("comment2", LocalDateTime.of(2022, 6, 10, 13, 10).toInstant(ZoneOffset.UTC), Long.valueOf(2), Long.valueOf(1));
            UrunYorum urunYorum3 = new UrunYorum("comment3", LocalDateTime.of(2022, 7, 10, 13, 10).toInstant(ZoneOffset.UTC), Long.valueOf(2), Long.valueOf(1));
            UrunYorum urunYorum4 = new UrunYorum("comment4", LocalDateTime.of(2022, 8, 10, 13, 10).toInstant(ZoneOffset.UTC), Long.valueOf(2), Long.valueOf(1));
            UrunYorum urunYorum5 = new UrunYorum("comment5", LocalDateTime.of(2022, 9, 10, 13, 10).toInstant(ZoneOffset.UTC), Long.valueOf(3), Long.valueOf(2));
            UrunYorum urunYorum6 = new UrunYorum("comment6", LocalDateTime.of(2022, 7, 13, 23, 10).toInstant(ZoneOffset.UTC), Long.valueOf(3), Long.valueOf(3));

            urunYorumRepository.saveAll(List.of(urunYorum1, urunYorum2, urunYorum3, urunYorum4, urunYorum5, urunYorum6));
        };
    }
}
