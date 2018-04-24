void drawFace(int faceX, int faceY) {
  // draw a face
  fill(#FFFF00);
  ellipse(faceX, faceY, 200, 225);
  
  // left eye
  fill(0);
  ellipse(faceX-40, faceY-50, 40, 50);
  fill(255);
  ellipse(faceX-35, faceY-40, 20, 20);
  
  // right eye
  fill(0);
  ellipse(faceX+40, faceY-50, 40, 50);
  fill(255);
  ellipse(faceX+45, faceY-40, 20, 20);
  
  // mouth
  fill(0);
  ellipse(faceX+10, faceY+50, 50, 60); 
}

void setup() {
  size(400, 400);
  
  background(255);
  
  noStroke();
  fill(200, 0, 0);
  
  for (int x = 50; x < 50+45*7; x += 45) {
    rect(x, 50, 30, 30);
  }
  x = 200;
}

int x;

void draw() {
  background(255);
  drawFace(x, 200);
  x += 1;
}
