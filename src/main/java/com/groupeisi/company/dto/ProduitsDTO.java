package com.groupeisi.company.dto;

public class ProduitsDTO {
    private Long id;
    private String ref;
    private String name;
    private Double stock;
    private Long userId;

    // Constructors
    public ProduitsDTO() {}

    public ProduitsDTO(String ref, String name, Double stock, Long userId) {
        this.ref = ref;
        this.name = name;
        this.stock = stock;
        this.userId = userId;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getStock() { return stock; }
    public void setStock(Double stock) { this.stock = stock; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}