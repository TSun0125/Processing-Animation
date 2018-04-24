int x;                        // declare globally

void setup(){
  size(400,400);
  x = 30;                   // initialize in setup
}

void draw(){
    x += 1;                    // update variable 

  background(255);
  
  // draw a ball
  noStroke();
  fill(255, 165, 0);  
  ellipse(x, 200, 50, 50);   // use variable to draw
  
}
