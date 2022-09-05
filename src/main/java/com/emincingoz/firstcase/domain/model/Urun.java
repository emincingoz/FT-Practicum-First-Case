package com.emincingoz.firstcase.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "urun")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Nullable
    @Column(name = "expiration_date")
    private Instant expirationDate;

    @JsonIgnore
    @OneToMany(targetEntity=UrunYorum.class, mappedBy="urun", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UrunYorum> urunYorumList;

    public Urun(String name, Double price, @Nullable Instant expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
}
