public class Button extends Item{
    private boolean isPressed;
    
    // Button constructor   
    public Button(int x, int y){
        super(x, y);
        this.isPressed = false;
    }
    
    public void press(){
        this.isPressed = true;
    }
    
    public void release(){
        this.isPressed = false;
    }
}