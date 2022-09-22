package com.vodafone.es.marketplace.shippingorder.util;

import com.vodafone.es.marketplace.shippingorder.model.Characteristic;
import com.vodafone.es.marketplace.shippingorder.model.Note;
import com.vodafone.es.marketplace.shippingorder.model.RelatedPartyWithContactInfo;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrder;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderCreate;
import com.vodafone.es.marketplace.shippingorder.model.ShippingOrderItem;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-21T09:57:29+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class ShippingOrderCreateMapperImpl implements ShippingOrderCreateMapper {

    @Override
    public ShippingOrder map(ShippingOrderCreate create) {
        if ( create == null ) {
            return null;
        }

        ShippingOrder shippingOrder = new ShippingOrder();

        shippingOrder.setStatus( create.getStatus() );
        List<Note> list = create.getNote();
        if ( list != null ) {
            shippingOrder.setNote( new ArrayList<Note>( list ) );
        }
        shippingOrder.setPlaceFrom( create.getPlaceFrom() );
        shippingOrder.setPlaceTo( create.getPlaceTo() );
        shippingOrder.setProductOrder( create.getProductOrder() );
        List<RelatedPartyWithContactInfo> list1 = create.getRelatedParty();
        if ( list1 != null ) {
            shippingOrder.setRelatedParty( new ArrayList<RelatedPartyWithContactInfo>( list1 ) );
        }
        shippingOrder.setRelatedShippingOrder( create.getRelatedShippingOrder() );
        shippingOrder.setShippingInstruction( create.getShippingInstruction() );
        List<Characteristic> list2 = create.getShippingOrderCharacteristic();
        if ( list2 != null ) {
            shippingOrder.setShippingOrderCharacteristic( new ArrayList<Characteristic>( list2 ) );
        }
        List<ShippingOrderItem> list3 = create.getShippingOrderItem();
        if ( list3 != null ) {
            shippingOrder.setShippingOrderItem( new ArrayList<ShippingOrderItem>( list3 ) );
        }
        shippingOrder.setShippingOrderOffering( create.getShippingOrderOffering() );
        shippingOrder.setShippingOrderPrice( create.getShippingOrderPrice() );
        shippingOrder.setBaseType( create.getBaseType() );
        shippingOrder.setSchemaLocation( create.getSchemaLocation() );
        shippingOrder.setType( create.getType() );

        return shippingOrder;
    }
}
