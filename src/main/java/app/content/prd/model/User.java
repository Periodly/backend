package app.content.prd.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "name")
    private String name;

    @Getter
    private String email;

    @Getter
    private String pass;

    public User() {

    }

    public User(String name, String email, String pass) {
        super();
        this.name = name;
        this.email = email;
        this.pass = pass;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}