package com.emincingoz.firstcase.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "kullanici")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50, message = "name can be max 50 characters")
    @Column(name = "name")
    private String name;

    @Size(max = 50, message = "surname can be max 50 characters")
    @Column(name = "surname")
    private String surname;

    @Size(max = 50, message = "email can be max 50 characters")
    @Column(name = "email")
    private String email;

    @Size(max = 15, message = "phone number can be max 15 characters")
    @Column(name = "phone_number")
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(targetEntity=UrunYorum.class, mappedBy="kullanici", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UrunYorum> urunYorumList;

    public Kullanici(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
