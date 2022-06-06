public class Block extends Item{
    private int height;
    private int width;
    
    // Block constructor
    public Block(int height, int width, int x, int y){
        super(x, y);
        this.height = height;
        this.width = width;
    }
    
    public void move(String direction){
        if (direction.equals("left"))
            this.x--; // TBD
        else
            this.x++; // TBD
    }
}