package com.emincingoz.firstcase.controller;

import com.emincingoz.firstcase.manager.urunYorum.IUrunYorumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("api/urunyorum")
@RequiredArgsConstructor
public class UrunYorumController {

    private final IUrunYorumService urunYorumService;

    @GetMapping("/get-all-by-urun-id/{id}")
    public ResponseEntity<?> getAllUrunYorumByUrunId(@PathVariable("id") Long urunId) {
        return ResponseEntity.ok(urunYorumService.getAllUrunYorumByUrunId(urunId));
    }

    /**
     * Aşağıdaki gibi bir adres kullanılır.
     * http://localhost:8080/api/urunyorum/get-all-urun-yorum-between-dates-by-urun-id?urun-id=1&begin-date=2022-07-11T18:45:06.694967Z&end-date=2022-09-05T18:45:06.694967Z
     * */
    @GetMapping("/get-all-urun-yorum-between-dates-by-urun-id")
    public ResponseEntity<?> getAllUrunYorumBetweenDatesByUrunId(@RequestParam(value = "urun-id", required = true) Long urunId,
                                                     @RequestParam(value = "begin-date", required = true) Instant beginDate,
                                                     @RequestParam(value = "end-date", required = true) Instant endDate) {
        return ResponseEntity.ok(urunYorumService.getAllUrunYorumBetweenDatesByUrunId(urunId, beginDate, endDate));
    }

    @GetMapping("/get-all-by-kullanici-id/{id}")
    public ResponseEntity<?> getAllUrunYorumByKullaniciId(@PathVariable("id") Long kullaniciId) {
        return ResponseEntity.ok(urunYorumService.getAllUrunYorumByKullaniciId(kullaniciId));
    }

    /**
     * Aşağıdaki gibi bir adres kullanılır.
     * http://localhost:8080/api/urunyorum/get-all-urun-yorum-between-dates-by-kullanici-id?kullanici-id=1&begin-date=2022-07-11T18:45:06.694967Z&end-date=2022-09-05T18:45:06.694967Z
     * */
    @GetMapping("/get-all-urun-yorum-between-dates-by-kullanici-id")
    public ResponseEntity<?> getAllUrunYorumBetweenDatesByKullaniciId(@RequestParam(value = "kullanici-id", required = true) Long kullaniciId,
                                                             @RequestParam(value = "begin-date", required = true) Instant beginDate,
                                                             @RequestParam(value = "end-date", required = true) Instant endDate) {
        return ResponseEntity.ok(urunYorumService.getAllUrunYorumBetweenDatesByKullaniciId(kullaniciId, beginDate, endDate));
    }
}
