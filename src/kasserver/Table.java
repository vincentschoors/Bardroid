/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasserver;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Order> orderList;
    private Integer tableId;
    public Table()
    {
        orderList = new ArrayList<Order>();
    }
    public void addOrder(Order order)
    {
        orderList.add(order);
    }
    public List<Order> getOrderList()
    {
        return this.orderList;
    }
}
