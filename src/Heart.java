public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String saying;
    private double calories;
    private double costPerPound;
   
    private int stock;
    // Add remaining heart properties here...
    private boolean available;
    // CONSTRUCTORS
    public Heart() {
    } // This is the default constructor

    public Heart(String color, int size, String saying, double costPerPound, int stock) {
        this.color = color;
        this.size = size;
        this.saying = saying;
        this.costPerPound = costPerPound;
        this.stock = stock;
    }
    
    // Add overloaded Constructor here...

    // Hello
    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

    public String getSaying() {
        return this.saying;
    }

    public double getCalories() {
        return this.calories;
    }

    public double getCostPerPound() {
        return this.costPerPound;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public int getStock() {
        return this.stock;
    }
    // Add remaining Accessor methods here...

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setCostPerPound(double costPerPound) {
        this.costPerPound = costPerPound;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void adjStock(int stock) {
        if(stock < 0){
            System.out.println("Stock Can't Go Below Zero");
        }
        else{
        this.stock = stock;
        if (stock > 0) {
            this.available = true;
        } else {
            this.available = false;
        }}
        
    }


    // Add remaining Mutator methods here...

    // METHODS
    public String report() {
        return this.color + "\n" + this.size + "\n" + this.saying + "\n" + this.costPerPound + "\n" + this.stock; 
        
    }
    
    
    public void adjPrice(int costPerPound, int givenPercentage){
    this.costPerPound = costPerPound * givenPercentage;
    }
    // Write other methods here (if needed)...
}
