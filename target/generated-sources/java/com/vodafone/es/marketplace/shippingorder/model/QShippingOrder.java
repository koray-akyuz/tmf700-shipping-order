package com.vodafone.es.marketplace.shippingorder.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShippingOrder is a Querydsl query type for ShippingOrder
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShippingOrder extends EntityPathBase<ShippingOrder> {

    private static final long serialVersionUID = 164325877L;

    public static final QShippingOrder shippingOrder = new QShippingOrder("shippingOrder");

    public final StringPath baseType = createString("baseType");

    public final DateTimePath<java.time.OffsetDateTime> creationDate = createDateTime("creationDate", java.time.OffsetDateTime.class);

    public final StringPath href = createString("href");

    public final StringPath id = createString("id");

    public final DateTimePath<java.time.OffsetDateTime> lastUpdateDate = createDateTime("lastUpdateDate", java.time.OffsetDateTime.class);

    public final ListPath<Note, SimplePath<Note>> note = this.<Note, SimplePath<Note>>createList("note", Note.class, SimplePath.class, PathInits.DIRECT2);

    public final SimplePath<RelatedPlaceRefOrValue> placeFrom = createSimple("placeFrom", RelatedPlaceRefOrValue.class);

    public final SimplePath<RelatedPlaceRefOrValue> placeTo = createSimple("placeTo", RelatedPlaceRefOrValue.class);

    public final SimplePath<ProductOrderRef> productOrder = createSimple("productOrder", ProductOrderRef.class);

    public final ListPath<RelatedPartyWithContactInfo, SimplePath<RelatedPartyWithContactInfo>> relatedParty = this.<RelatedPartyWithContactInfo, SimplePath<RelatedPartyWithContactInfo>>createList("relatedParty", RelatedPartyWithContactInfo.class, SimplePath.class, PathInits.DIRECT2);

    public final SimplePath<RelatedShippingOrder> relatedShippingOrder = createSimple("relatedShippingOrder", RelatedShippingOrder.class);

    public final StringPath schemaLocation = createString("schemaLocation");

    public final SimplePath<ShippingInstruction> shippingInstruction = createSimple("shippingInstruction", ShippingInstruction.class);

    public final ListPath<Characteristic, SimplePath<Characteristic>> shippingOrderCharacteristic = this.<Characteristic, SimplePath<Characteristic>>createList("shippingOrderCharacteristic", Characteristic.class, SimplePath.class, PathInits.DIRECT2);

    public final ListPath<ShippingOrderItem, SimplePath<ShippingOrderItem>> shippingOrderItem = this.<ShippingOrderItem, SimplePath<ShippingOrderItem>>createList("shippingOrderItem", ShippingOrderItem.class, SimplePath.class, PathInits.DIRECT2);

    public final SimplePath<ProductOfferingRef> shippingOrderOffering = createSimple("shippingOrderOffering", ProductOfferingRef.class);

    public final SimplePath<ProductPrice> shippingOrderPrice = createSimple("shippingOrderPrice", ProductPrice.class);

    public final StringPath status = createString("status");

    public final StringPath type = createString("type");

    public QShippingOrder(String variable) {
        super(ShippingOrder.class, forVariable(variable));
    }

    public QShippingOrder(Path<? extends ShippingOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShippingOrder(PathMetadata metadata) {
        super(ShippingOrder.class, metadata);
    }

}

