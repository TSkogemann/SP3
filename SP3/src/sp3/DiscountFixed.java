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
public class DiscountFixed extends DiscountType {

    double discount = 0.1; // 10% on all

    @Override
    public double calcDiscount(double pricePerItem, int quantity) {
        return pricePerItem * discount * quantity;
    }

}
