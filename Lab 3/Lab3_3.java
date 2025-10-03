interface Sellable {
    void displayItemDetails();
    double getPrice();
}

abstract class Product  {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    abstract double calculateDiscount();
}

class ElectronicItem extends Product implements Sellable{
    double price;

    ElectronicItem(String name, String category, double price) {
        super(name, category);
        this.price = price;
    }


    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + (int)price);
        System.out.println("Discounted Price: " + (int)(price - calculateDiscount()));
    }


    public double getPrice() {
        return price;
    }


    double calculateDiscount() {
 
        return price * 0.10;
    }
}

class ClothingItem extends Product implements Sellable {
    double price;

    ClothingItem(String name, String category, double price) {
        super(name, category);
        this.price = price;
    }


    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + (int)price);
        System.out.println("Discounted Price: " + (int)(price - calculateDiscount()));
    }

    public double getPrice() {
        return price;
    }


    double calculateDiscount() {
        return price * 0.20;
    }
}

public class Lab3_3 {
    public static void main(String[] args) {
        Sellable laptop = new ElectronicItem("Laptop", "Electronics", 50000);
        laptop.displayItemDetails();

        System.out.println();

        Sellable shirt = new ClothingItem("Shirt", "Clothing", 2000);
        shirt.displayItemDetails();
    }
}
