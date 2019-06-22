package com.design.patterns;

import org.junit.*;

public class ShoppingCartTest {


    @Test
    public void testStrategy() {
        ShoppingCart cart = new ShoppingCart();


        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        cart.addItem(item1);
        cart.addItem(item2);
        //pay by credit cart
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "123456754544", "786", "12/15"));

        CreditCardStrategy creditCardStrategy = new CreditCardStrategy("test", "121212", "344", "12/12");

    }
}
