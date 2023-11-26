package com.cardapio.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Guilherme
 */
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
