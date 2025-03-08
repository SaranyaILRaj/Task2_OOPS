package Task2;
//1.2 create a class product (pid,price,quantity) with parameterized constructor. create a main function in different class(say ProductMain) and perfrom following task
//a)Accept five product information from user and store it in array
//b) Find pid of the product with highest price
//c) create method (with array of product object as argument ) in productMain class to calculate and return the total amount spent on all products.(amount spent on single product=price of product * quantity of the product)

public class Product {

    private int pid;
    private double price;
    private int quantity;

    //parameterized constructor for product object
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public int getPid() {
        return pid;
    }
    public int getQuantity() {
        return quantity;
    }
}
class ProductMain
{
    public static void main(String[] args)
    {
        double highestPrice=Double.MIN_VALUE;
        int productId=0;
        //creating a array to store product details
        Product[] prdArray=new Product[5];
        prdArray[0]=new Product(101,14000.00,4);
        prdArray[1]=new Product(102,12500.00,6);
        prdArray[2]=new Product(103,1000.50,19);
        prdArray[3]=new Product(104,190000.50,3);
        prdArray[4]=new Product(105,1050.00,25);

        //iteration to find out the highest product
        for(int i=0;i<=prdArray.length-1;i++)
        {
            if(highestPrice <= prdArray[i].getPrice())
            {
                highestPrice=prdArray[i].getPrice();
                productId=prdArray[i].getPid();
            }
        }
        System.out.println("Highest Pirce product id is : "+productId);
        //calling function to calculate total amount spent on all produts
        calculateTotalAmount(prdArray);
    }

    // method to find out total amount
    public static void calculateTotalAmount(Product[] prdArray)
    {
        double eachPrdPrice=0.00;
        double sumOfAllPrdPrice=0.00;
        for(int i=0;i<=prdArray.length-1;i++)
        {
            eachPrdPrice=prdArray[i].getPrice()*prdArray[i].getQuantity();
            sumOfAllPrdPrice=sumOfAllPrdPrice+eachPrdPrice;
        }
        System.out.println("sum of all product price is: "+sumOfAllPrdPrice);
    }
}
