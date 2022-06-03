public abstract class Platform extends Item{
    private int width;
    private int length;
    
    // Platform constructor, cannot instantiate object
    public Platform(int x, int y, int length, int width){
        super(x, y);
        this.length = length;
        this.width = width;
    }
}