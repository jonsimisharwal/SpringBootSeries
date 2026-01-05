package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserClassHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public UserClassHibernate() {
    }

    public UserClassHibernate(Long id,String name){
        this.id=id;
        this.name=name;
    }

    public UserClassHibernate(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId(){
        return id;
    }
}
