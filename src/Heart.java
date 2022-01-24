public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String saying;
    private int calories;
    private int costPerPound;
    private boolean available;
    private int stock;
    // Add remaining heart properties here...

    // CONSTRUCTORS
    public Heart() {
    } // This is the default constructor

    public Heart(String color, int size, String saying, int calories, int costPerPound, boolean available, int stock) {
        this.color = color;
        this.size = size;
        this.saying = saying;
        this.calories = calories;
        this.costPerPound = costPerPound;
        this.available = available;
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

    public int getCalories() {
        return this.calories;
    }

    public int getCostPerPound() {
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

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCostPerPound(int costPerPound) {
        this.costPerPound = costPerPound;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void inStock(boolean available, int stock) {
        if (stock > 0) {
            this.available = true;
        } else {
            this.available = false;
        }
    }
    // Add remaining Mutator methods here...

    // METHODS
    public String report() {
        return this.color + "\n"; // Add other properties here as you add them to the class
    }
    // Write other methods here (if needed)...
}
