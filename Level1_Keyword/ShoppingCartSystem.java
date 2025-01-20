

public class ShoppingCartSystem {
    public static void main(String[] args) {
    Product acc1 = new Product("Princi biscuit", 7.5f,"dsc5338",45);

    

    acc1.display();

    // checking Instance 

    if (acc1 instanceof Product){
        System.out.println("Yes this is instance of parent class");
    }
    else{
        System.out.println("No, this is not instance of parent class");
    }

    }
    }

