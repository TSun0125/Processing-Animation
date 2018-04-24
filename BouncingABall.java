float x;                     // declare globally
float xSpeed; 
float y;
float ySpeed;
float yGravity;

void setup(){
  size(400, 400);
  x = 30;  // initialize in setup
  y = 200;
  xSpeed = 5;
  ySpeed = 5;
  yGravity = 3;
}

void draw(){    
  x += xSpeed;             // update variable 
  y += ySpeed + yGravity;
  
  // x boundary check
  if(x + 25 >= 400)
  xSpeed = -xSpeed; 
  else if(x - 25 <= 0)
  xSpeed = -xSpeed;
  
  // y boundary check
  if(y + 25 >= 400)
  ySpeed = -ySpeed;
  else if(y - 25 <= 0)
  ySpeed = -ySpeed;

  background(#faebd7);
  
  // draw a ball
  noStroke();
  fill(#556b2f);  
  ellipse(x, y, 50, 50);   // use variable to draw
  

}
