/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasserver;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Consumable> drinkList;
    private Bartender bartender;
    public Order(Bartender bartender)
    {
        this.bartender = bartender;
        drinkList = new ArrayList<Consumable>();
    }
    public void addDrink(Consumable drink)
    {
        drinkList.add(drink);
    }
    public void removeDrink(Integer orderId)
    {
        Integer count = 0;
        for(Consumable d : drinkList) {
            if (d.getOrderid() == orderId)
            {
                drinkList.remove(count);
            }
            count++;
        }
    }
    public List<Consumable> getDrinkList()
    {
        return this.drinkList;

    }
    public Double getSubtotal()
    {
        Double subtotal= 0.0;
        for(Consumable d : drinkList)
            subtotal=+d.getPrice();
        return subtotal;
    }
}
