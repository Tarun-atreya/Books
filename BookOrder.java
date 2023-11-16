public class BookOrder implements Comparable<BookOrder> {
    private String bookTitle;
    private int quantity;

    public BookOrder(String title, int quant)
    {
        bookTitle = title;
        quantity = quant;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }
    public int getQuantity()
    {
        return quantity;
    }

    @Override
    public int compareTo(BookOrder arg0) {
        if(this.quantity > arg0.getQuantity())
            return 1;
        else if(this.quantity < arg0.getQuantity())
            return -1;
        else
            return 0;
    }
}
