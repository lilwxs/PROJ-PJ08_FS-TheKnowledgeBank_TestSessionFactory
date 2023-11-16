package com.all.knowledge.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer Id;
    @Column(name = "firstName", nullable = false, length = 45)
    private String FirstName;
    @Column(name = "lastName", nullable = false, length = 45)
    private String LastName;
    @Column(name = "username", nullable = false, length = 45, unique = true)
    private String Username;
    @Column(name = "password", nullable = false, length = 45)
    private String Password;
    @Column(name = "email", nullable = false, length = 45, unique = true)
    private String Email;
    @Column(name = "role", nullable = false, length = 45)
    private String Role;
    @Column(name = "dateJoin", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp DateJoin;

    // Getters and setters
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Timestamp getDateJoin() {
        return DateJoin;
    }

    public void setDateJoin(Timestamp dateJoin) {
        DateJoin = dateJoin;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                ", Role='" + Role + '\'' +
                ", DateJoin=" + DateJoin +
                '}';
    }
}
