package com.emincingoz.firstcase.controller;

import com.emincingoz.firstcase.manager.urun.IUrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/urun")
@RequiredArgsConstructor
public class UrunController {

    private final IUrunService urunService;

    @GetMapping("/get-all-uruns-date-expired")
    public ResponseEntity<?> getAllUrunsDateExpired() {
        return ResponseEntity.ok(urunService.getAllUrunsDateExpired());
    }

    @GetMapping("/get-all-uruns-date-not-expired")
    public ResponseEntity<?> getAllUrunsDateNotExpired() {
        return ResponseEntity.ok(urunService.getAllUrunsDateNotExpired());
    }
}
