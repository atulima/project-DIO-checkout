package br.ecommerce.checkout.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {

    Optional<CheckoutEntity> findByCode(String code);
}
