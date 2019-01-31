void setup(){
     size(500,500);
     //1. call the makeIceCreamCone() method below to make an ice cream cone
  makeIceCreamCone();
     //2. use the addScoop method below to add as many scoops of ice cream as you want
addScoop("vanilla");
addScoop("cherry");
addScoop("chocolate");
addSprinkle(1000);


 //3. Use the method to add sprinkles to your ice cream

     //4. Write code to add a cherry to the top of your ice cream. hint: ellipse
     fill(#FF7D5D);
     ellipse(250,40,75,75);
}

int SCOOPSIZE = 150;
int scoops = 0;
int coneY = 320;
void makeIceCreamCone(){
     //noStroke();
     fill(188,126,49);
     triangle(190,320,310,300,255,500);
}
void addScoop(String flavor){
     noStroke();
     if(flavor.equalsIgnoreCase("chocolate")){
         fill(#FFFDE3);
     }
     else if(flavor.equalsIgnoreCase("cherry")){
         fill( #FA005C);
     }
       else if(flavor.equalsIgnoreCase("cottoncandy")){
         fill( #0285F5);
       }
     else if(flavor.equalsIgnoreCase("Vanilla")){
         fill(245, 243, 227);
     } else{
         println("ERROR: We don't have the flavor "+ flavor); 
         return;
     }
     ellipse(width/2,coneY - 50 - (SCOOPSIZE*scoops)/2,SCOOPSIZE,SCOOPSIZE);
     scoops++;
}
void addSprinkle(int numberOfSprinkles){
    for(int i = 0; i<numberOfSprinkles; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2-40;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(2,9);
         int sprinkleHeight = (int)random(2,9);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
     }
}
