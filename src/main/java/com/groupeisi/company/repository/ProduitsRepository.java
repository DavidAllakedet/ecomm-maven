package com.groupeisi.company.repository;

import com.groupeisi.company.entities.Produits;
import com.groupeisi.company.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Long> {
    List<Produits> findByUser(Users user);
}