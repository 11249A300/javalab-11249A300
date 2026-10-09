class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order placement started.");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Order placed successfully.");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order delivery Started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order delivered successfully.");
    }
}

public class FoodDelivery {
    public static void main (String[] args) {
        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        order.start();
        delivery.start();
    }
}
