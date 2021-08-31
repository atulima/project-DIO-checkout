package br.ecommerce.checkout.service;



import java.util.Optional;

import br.ecommerce.checkout.entity.CheckoutEntity;
import br.ecommerce.checkout.resources.checkout.CheckoutRequest;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    // Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
