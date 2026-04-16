package com.groupeisi.company.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "achats")
public class Achats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateP;
    private Double quantity;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produits produit;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getDateP() { return dateP; }
    public void setDateP(Date dateP) { this.dateP = dateP; }
    public Double getQuantity() { return quantity; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }
    public Produits getProduit() { return produit; }
    public void setProduit(Produits produit) { this.produit = produit; }
    public Users getUser() { return user; }
    public void setUser(Users user) { this.user = user; }
}