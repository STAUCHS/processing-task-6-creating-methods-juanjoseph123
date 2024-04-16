import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(1000, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
    //background(0, 0, 0);
    strokeWeight(1);
  }

  
  public void draw() {
    float spacing = width / 7; // Calculate spacing for 6 stick figures
    
    // Define colors 
    int[] colors = {color(255, 0, 0), color(255, 127, 0), color(255, 255, 0), 
    color(0, 255, 0), color(0, 0, 255), color(75, 0, 130)}; 
    
    // Draw 6 stick figures
    for (int i = 0; i < 6; i++) {
      float xPosition = (i + 1) * spacing; // Calculate x-position for each stick figure
      drawStickFigure(xPosition, height / 2, colors[i]); // Draw stick figure with rainbow color
      drawFlower(xPosition, height / 4); // Draw flower above stick figures
    }
   
  }

  /**
   * Description: Draws 6 stick figure drawings side by side each in a different color of the rainbow and then draws 6 quad-petal flowers above each
   * 
   * @paramdrawstickfigure :Draws 6 stick figures side by side each in a different color
   * @return
   * @author J.Joseph
   */

   private void drawStickFigure(float x, float y, int c) {
    // Set color
    stroke(c);
    
    ellipse(x, y - 50, 25, 25);
    
    line(x, y - 37.5f, x, y + 25);
    
    line(x, y - 25, x - 25, y);
    line(x, y - 25, x + 25, y);
    
    line(x, y + 25, x - 12.5f, y + 50);
    line(x, y + 25, x + 12.5f, y + 50);
  }
  /** 
   * @paramdrawflower : Draws 6 flowers above each stick figure
   * @return
   * @author J.Joseph
   */
 
   private void drawFlower(float x, float y) {
    // Draw center ellipse
    fill(255, 200, 0); // Yellow
    ellipse(x, y, 20, 20);
    
    // Draw petals
    fill(255, 0, 255); // Magenta
    float petalSize = 40;
    float petalDistance = petalSize / 2;
    ellipse(x - petalDistance, y - petalDistance, petalSize, petalSize);
    ellipse(x + petalDistance, y - petalDistance, petalSize, petalSize);
    ellipse(x - petalDistance, y + petalDistance, petalSize, petalSize);
    ellipse(x + petalDistance, y + petalDistance, petalSize, petalSize);
  }

}
