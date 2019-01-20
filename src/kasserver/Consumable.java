/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasserver;

public class Consumable {
    private Integer alcoholPercentage,orderId;
    private Double price;
    private String name,category,type;

    public Consumable (String name, Double price)
    {
        this.name = name;
        this.price = price;
    }
    public Double getPrice()
    {
        return price;
    }
    public Integer getOrderid(){return orderId;}
    public String getName(){return name;}
}
