public class MyTurtle extends BaseTurtle {

	public void draw() {
        // triangle
        pen.setStrokeWidth(3);
        this.setDelay(30); 
       for(int i = 0; i < 30; i++){
        this.triangles();
        this.turn(8);
  }
}
    private void triangles(){
        pen.setRandomColor();
        this.turn(60);
        this.forward(6);
        this.turn(60);
        this.back(12);
        this.turn(60);
        this.forward(12);
        this.turn(60);
        this.back(6);
    
        pen.setRandomColor();
        this.turn(120);
        this.forward(6);
        this.turn(60);
        this.back(6);
        this.turn(60);
        this.forward(6);
     }
}
