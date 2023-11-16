import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BookOrderProcessor {
    private PriorityQueue<BookOrder> orderQueue;

    // Constructor to initialize the orderQueue
    public BookOrderProcessor() {
        orderQueue = new PriorityQueue<BookOrder>();
    }

    // Your implementation for enqueueOrder method here
    public void enqueueOrder(BookOrder order) {
        orderQueue.add(order);
    }

    // Your implementation for processOrders method here
    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            BookOrder order = orderQueue.remove();
            System.out.println("Title: " + order.getBookTitle() + " - " + order.getQuantity());
        }
    }

    // Your implementation for getTotalOrders method here
    public int getTotalOrders() {
        return orderQueue.size();
    }
}
