package com.vodafone.es.marketplace.shippingorder.repository;

import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingOrderRepository extends MongoRepository<ShippingOrder, String>, QuerydslPredicateExecutor<ShippingOrder> {

}
