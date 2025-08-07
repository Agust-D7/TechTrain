public class ShoppingCart{
    // method to add items to cart
    public void addItem(String itemName)
    {
        //logic to add a single item to cart
            System.out.println(itemName + "added to the cart.");
            }

            //overload method to add items
            public void addItem(String itemName, int quantity)
            {
                System.out.println(quantity + " " + itemName + "s added to cart."); 
                }
                public void addItem(String itemName , int quantity , double price)
                {
                    double totalCost = quantity * price;
                        System.out.println(quantity + " " + itemName + "s added to cart. Total cost:$" + totalCost); 
                        }
                        public static void main(String[] args)
                        {
                            ShoppingCart cart= new ShoppingCart();
                                
                                    cart.addItem("T-Shirt ");
                                        cart.addItem("shoes", 2);
                                            cart.addItem("sunglasses",3,25.99);
                                            }
                                            }
}