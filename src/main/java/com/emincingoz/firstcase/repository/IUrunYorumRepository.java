package com.emincingoz.firstcase.repository;

import com.emincingoz.firstcase.domain.model.UrunYorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface IUrunYorumRepository extends JpaRepository<UrunYorum, Long> {

    // Bir ürüne ait yorumları listeleyen bir metot
    @Query(value = "select u from UrunYorum u join u.urun r where r.id = :urunId")
    List<UrunYorum> getAllByUrunId(Long urunId);

    // Verilen tarih aralıklarında belirli bir ürüne yapılmış olan yorumları gösteren bir metot
    @Query(value = "select u from UrunYorum u join u.urun r where r.id = :urunId and u.commentDate > :beginDate and u.commentDate < :endDate")
    List<UrunYorum> getAllUrunYorumsBetweenDatesByUrunId(@Param("urunId") Long urunId, @Param("beginDate") Instant beginDate, @Param("endDate") Instant endDate);

    // Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot
    @Query(value = "select u from UrunYorum u join u.kullanici r where r.id = :kullaniciId")
    List<UrunYorum> getAllByKullaniciId(Long kullaniciId);

    // Bir kullanıcının belirli tarihler aralığında yapmış olduğu yorumları gösteren bir metot
    @Query(value = "select u from UrunYorum u join u.kullanici r where r.id = :kullaniciId and u.commentDate > :beginDate and u.commentDate < :endDate")
    List<UrunYorum> getAllUrunYorumsBetweenDatesByKullaniciId(@Param("kullaniciId") Long kullaniciId, @Param("beginDate") Instant beginDate, @Param("endDate") Instant endDate);

}
