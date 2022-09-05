package com.emincingoz.firstcase.repository;

import com.emincingoz.firstcase.domain.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKullaniciRepository extends JpaRepository<Kullanici, Long> {


}
