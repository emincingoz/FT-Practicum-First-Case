package com.emincingoz.firstcase.repository;

import com.emincingoz.firstcase.domain.model.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface IUrunRepository extends JpaRepository<Urun, Long> {

    // Son kullanma tarihi geçmiş ürünleri listeleyen bir metot
    @Query(value = "select u from Urun u where u.expirationDate < :currentDate")
    List<Urun> getAllUrunsDateExpired(@Param("currentDate")Instant currentDate);

    @Query(value = "select u from Urun u where u.expirationDate > :currentDate or u.expirationDate is null")
    List<Urun> getAllUrunsDateNotExpired(@Param("currentDate")Instant currentDate);
}
