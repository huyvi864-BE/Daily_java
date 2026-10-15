class order {
    private static int counter = 0;
    private final String orderId;

    public order() {
        counter++;
        this.orderId = String.format("%04d", counter);
    }
    static int getCounter() {
        return counter;
    }
}
void main() {
    new order(); new order();
    System.out.println(order.getCounter());
}