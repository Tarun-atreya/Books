public class BookOrder {
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
}
