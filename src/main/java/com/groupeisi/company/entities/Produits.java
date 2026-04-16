package com.groupeisi.company.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "produits")
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private String name;
    private Double stock;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Achats> achats;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ventes> ventes;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getStock() { return stock; }
    public void setStock(Double stock) { this.stock = stock; }
    public Users getUser() { return user; }
    public void setUser(Users user) { this.user = user; }
    public List<Achats> getAchats() { return achats; }
    public void setAchats(List<Achats> achats) { this.achats = achats; }
    public List<Ventes> getVentes() { return ventes; }
    public void setVentes(List<Ventes> ventes) { this.ventes = ventes; }
}