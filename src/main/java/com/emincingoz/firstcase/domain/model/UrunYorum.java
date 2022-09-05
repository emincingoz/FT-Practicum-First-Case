package com.emincingoz.firstcase.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Table(name = "urunYorum")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UrunYorum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 500, message = "comment can be max 500 characters")
    @Column(name = "comment")
    private String comment;

    @Column(name = "comment_date")
    private Instant commentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="urun_id", insertable = false, updatable = false, nullable = false)
    @JsonIgnore
    private Urun urun;

    @Column(name = "urun_id")
    private Long urunId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="kullanici_id", insertable = false, updatable = false, nullable = false)
    @JsonIgnore
    private Kullanici kullanici;

    @Column(name = "kullanici_id")
    private Long kullaniciId;

    public UrunYorum(String comment, Instant commentDate, Long urunId, Long kullaniciId) {
        this.comment = comment;
        this.commentDate = commentDate;
        this.urunId = urunId;
        this.kullaniciId = kullaniciId;
    }
}
