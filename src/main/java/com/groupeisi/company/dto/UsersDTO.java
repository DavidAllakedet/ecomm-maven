package com.groupeisi.company.dto;

public class UsersDTO {
    private Long id;
    private String email;
    private String password;

    // Constructors
    public UsersDTO() {}

    public UsersDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}