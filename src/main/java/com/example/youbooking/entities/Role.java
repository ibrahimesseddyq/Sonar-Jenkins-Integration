package com.example.youbooking.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "role")
    private List<User> users;



    @JsonIgnore
    public List<User> getUsers() {
        return users;
    }
    @JsonSetter
    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role(String nom, List<User> users) {
        this.nom = nom;
        this.users = users;

    }


}
