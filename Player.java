public class Player{
    private int x;
    private int y;
    private String state;
    
    // Player obejct constructor
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.state = "stationary";
    }
    
    public void move(String direction){
        if (direction.equals("left")){
            this.state = "moving left";
            this.x--; // TBD
        }
        else{
            this.state = "moving right";
            this.x++; // TBD
        }
    }
    
    public void jump(){
        this.state = "jumping";
        this.y++; // TBD
    }
    
    public void fall(){
        this.state = "falling";
        this.y--; // TBD
    }
}