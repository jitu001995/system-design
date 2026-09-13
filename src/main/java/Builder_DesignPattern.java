
 class Order {
    private final String customerName;
    private final String productName;
    private final int quantity;
    private final String address;
    private final String couponCode;
    private final String paymentMethod;
    private final String deliveryType;

    private Order(OrderBuilder builder){
        this.customerName = builder.customerName;
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.address = builder.address;
        this.couponCode = builder.couponCode;
        this.paymentMethod = builder.paymentMethod;
        this.deliveryType = builder.deliveryType;
    }


    public static class  OrderBuilder{
        private  String customerName;
        private  String productName;
        private  int quantity;
        private  String address;
        private  String couponCode;
        private  String paymentMethod;
        private  String deliveryType;

        public OrderBuilder customerName(String customerName){
            this.customerName = customerName;
            return this;
        }
        public OrderBuilder productName(String productName){
            this.productName = productName;
            return this;
        }
        public OrderBuilder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }
        public OrderBuilder address(String address){
            this.address = address;
            return this;
        }

        public OrderBuilder couponCode(String couponCode){
            this.couponCode = couponCode;
            return this;
        }

        public OrderBuilder paymentMethod(String paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;
        }

        public OrderBuilder deliveryType(String delieveryType){
            this.deliveryType = delieveryType;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }
    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", address='" + address + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                '}';
    }
}

public class Builder_DesignPattern {

    public static void main(String[] args) {

        Order order = new Order.OrderBuilder()
                .customerName("Jitendra")
                .productName("Laptop")
                .quantity(1)
                .address("Bangalore")
                .couponCode("SAVE10")
                .paymentMethod("UPI")
                .deliveryType("Express")
                .build();

        System.out.println(order);
    }
}