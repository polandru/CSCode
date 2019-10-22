public class Order {
    private int number;
    private String customer;
    private String dishes;
    private double total;

    public Order(int num){
        number = num;
        customer = "";
        dishes="";
    }

    public Order(int num,String cust){
        number = num;
        customer  = cust;
    }

    public void setOrderNumber(int num){
        number = num;
    }

    public void setCustomer(String cust){
        customer = cust;
    }

    public int getOrderNumber(){
        return number;
    }

    public String getCustomer(){
        return customer;
    }

    public void addDish(String dish, double cost){
        dishes += ","+dish;
        total += cost;
    }


    public void addTax(){
        total *= 1.0825;
    }

    public double getTotal(){
        return total;
    }

    public String getString(){
        String str ="Order number:"+number+"\n"+"Customer:"+customer+"\n"+"Dishes:"+dishes+"\n"+"Total:"+total;
        return str;
    }
}