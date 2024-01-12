package com.example.demo;

import jakarta.persistence.*;

@Entity
public class UserTekwill { // JPA - Contract(Interfata) ,  Hibernate(Impplementare)


    public UserTekwill() {}

    public UserTekwill(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
