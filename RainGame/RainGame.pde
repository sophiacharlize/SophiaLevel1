int  Ypos = 0;
int Xpos = 200;
int randomNumber = (int) random(width);
int score = 0;

void setup() {
  size(500,500);
  
}

void draw() {
  background(183,240,245);
  fill(103,217,227);
  ellipse(Xpos, Ypos, 10,20);
  Ypos = Ypos +3;
  fill(244,247,67);
  rect(mouseX, 470, 55,30); 
  if (Ypos > 500) {
    Xpos = (int) random(width);
    Ypos = 0;
  checkCatch(Xpos);
   
  }
}
  
  void checkCatch (int x) {
    int score = 0;
    if (x > mouseX && x< mouseX + 100) {
    score++;
    }
    else if (score > 0) {
    score--;
    }
    println("Your score is now: " + score);
    fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

     }
  
  
  