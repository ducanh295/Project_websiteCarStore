package com.bkap.repositories;

import com.bkap.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
 
public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByAccountId(String accountId);
} 