package cart;

public class Apple extends Item {

    private String type;

    /* Calling
    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    */

    // Constructor
    public Apple() {
        // super is calling Item Class (parent)
        super("apple", "Apple");
    }
    
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
        
    }
}
