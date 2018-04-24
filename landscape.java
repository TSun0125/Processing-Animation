PVector[] clouds;      // declare globally

void setup() {
  size (750, 450);

  clouds = new PVector[10];
    for(int i = 0; i < clouds.length; i++){
    float x = random(0, width);
    float y = random(0, 200);
    clouds[i] = new PVector(x, y);
  }
}

void draw() {
  image(original, 0, 0);
  background(#BAE3F5);
  
  // road and the line
  noStroke();
  fill(50, 50, 50);
  triangle(380, 277, 29, 449, 748, 449);
  stroke(180);
  strokeWeight(5);
  line(381, 279, 381, 449);
  
  // mountain
  noStroke();
  fill(#C6A375);
  quad(115, 239, 89, 238, 10, 264, 128, 269);
  quad(104, 247, 99, 267, 165, 269, 148, 244);
  
  // sides
  noStroke();
  fill(#1D1619);
  quad(377, 280, 367, 280, 0, 279, 0, 500);
  quad(0, 500, 27, 449, 340, 301, 319, 299);
  quad(398, 288, 421, 286, 750, 354, 750, 500);
  
  // green land 1
  noStroke();
  fill(#293F07);
  triangle(0, 260, 368, 278, 0, 376);
  // green land 2
  fill(#293F07);
  triangle(429, 286, 748, 273, 748, 356);
  
  // trees
  noStroke();
  fill(#52311E);
  quad(130, 304, 130, 344, 150, 340, 148, 304);
  quad(33, 368, 34, 324, 54, 321, 56, 365);
  quad(615, 305, 612, 327, 630, 332, 628, 307);
  quad(688, 316, 683, 344, 701, 347, 703, 317);
  
  fill(#488E74);
  ellipse(118, 306, 30, 24);
  ellipse(133, 303, 30, 24);
  ellipse(126, 290, 30, 24);
  ellipse(146, 292, 30, 24);
  ellipse(149, 305, 30, 24);
  
  ellipse(25, 325, 30, 24);
  ellipse(31, 306, 30, 24);
  ellipse(53, 303, 30, 24);
  ellipse(44, 318, 30, 24);
  ellipse(58, 323, 30, 24);
  
  ellipse(605, 306 ,30, 24);
  ellipse(611, 294, 30, 24);
  ellipse(626, 294, 30, 24);
  ellipse(636, 306, 30, 24);
  ellipse(623, 305, 30, 24);
  
  ellipse(680, 318, 30, 20);
  ellipse(686, 306, 30, 20);
  ellipse(702, 306, 30, 20);
  ellipse(712, 319, 25, 20);
  ellipse(690, 323, 30, 20);
  
  
  // loop through clouds
  for (int i = 0; i < clouds.length; i++) {
    // move each cloud
    clouds[i].add(1, 0);
    
  // reset if they go too far
  if (clouds[i].x - 75 > width) {
    clouds[i].x = -75;
    clouds[i].y = (int) random(50, 200);
  }
  
  // clouds
   noStroke();
   fill(255);
   ellipse(clouds[i].x, clouds[i].y, 50, 35);
   ellipse(clouds[i].x+15, clouds[i].y+15, 50, 35);
   ellipse(clouds[i].x-15, clouds[i].y+15, 50, 35); 
  }
}

void mousePressed() {
  println(mouseX + ", "+mouseY);
  
}
