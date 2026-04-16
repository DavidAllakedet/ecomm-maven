package com.groupeisi.company.repository;

import com.groupeisi.company.entities.Achats;
import com.groupeisi.company.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AchatsRepository extends JpaRepository<Achats, Long> {
    List<Achats> findByUser(Users user);
}