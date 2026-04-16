package com.groupeisi.company.dto;

import java.util.Date;

public class AchatsDTO {
    private Long id;
    private Date dateP;
    private Double quantity;
    private Long productId;
    private Long userId;

    // Constructors
    public AchatsDTO() {}

    public AchatsDTO(Date dateP, Double quantity, Long productId, Long userId) {
        this.dateP = dateP;
        this.quantity = quantity;
        this.productId = productId;
        this.userId = userId;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getDateP() { return dateP; }
    public void setDateP(Date dateP) { this.dateP = dateP; }
    public Double getQuantity() { return quantity; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}