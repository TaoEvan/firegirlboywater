public class OneWayPlatform extends Platform{
    private String openingDirection;
    
    // OneWayPlatform constructor
    public OneWayPlatform(int x, int y, int length, int width, String openingDirection){
        super(x, y, length, width);
        this.openingDirection = openingDirection;
    }
}