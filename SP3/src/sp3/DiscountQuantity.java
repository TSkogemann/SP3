/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp3;

import javax.persistence.Entity;

/**
 *
 * @author Thomas Skogemann
 */

@Entity
public class DiscountQuantity extends DiscountType {

    int quantityForDiscount = 3;
    double discount = 0.2; // 20% on all if quantity is 3 or more
    
    @Override
    public double calcDiscount(double pricePerItem, int quantity) {
        return quantity >= quantityForDiscount ? pricePerItem * quantity * discount : 0;
    }

}
