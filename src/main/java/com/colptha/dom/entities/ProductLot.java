package com.colptha.dom.entities;

import com.colptha.dom.enums.ProductId;
import com.colptha.dom.enums.ShipmentType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Colptha on 4/4/17.
 */
@Embeddable
public class ProductLot {
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private ProductId productId;

    private Date createdOn;
    private Date updatedOn;
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;

    public ProductLot() {
    }

    public ProductLot(ProductId productId, Integer quantity) {
        this.quantity = quantity;
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductId getProductId() {
        return productId;
    }

    public void setProductId(ProductId productId) {
        this.productId = productId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }


    void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    void updateTimeStamps() {
        if (createdOn == null) {
            updatedOn = new Date();
            createdOn = new Date();
        }
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
