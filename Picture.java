/**
 * Creating a picture using a number of squares, triangles, circles 
 * and persons.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Collie Clarke
 * @version 2024.01.22
 */
public class Picture
{
    private Square road;
    private Square bottom;
    private Square bottomA;
    private Square bottomB;
    private Square bottom1;
    private Square bottom2;
    private Square bottom3;
    private Square sky;
    private Square ground;
    private Triangle top;
    private Triangle top1;
    private Circle moon;
    private Circle star;
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Circle star8;
    private Circle star9;
    private Person boy;
    private Person girl;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        star = new Circle();
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        star9 = new Circle();
        bottom = new Square();
        bottomA = new Square();
        bottomB = new Square();
        bottom1 = new Square();
        bottom2 = new Square();
        bottom3 = new Square();
        road = new Square();
        sky = new Square();
        ground = new Square();
        top = new Triangle();  
        top1 = new Triangle();
        moon = new Circle();
        boy = new Person();
        girl = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("black");
            sky.moveHorizontal(-310);
            sky.moveVertical(-120);
            sky.changeSize(1000);
            sky.makeVisible();
            
            ground.changeColor("green");
            ground.moveHorizontal(-310);
            ground.moveVertical(99);
            ground.changeSize(1000);
            ground.makeVisible();
            
            bottom.changeColor("brown");
            bottom.moveHorizontal(-257);
            bottom.moveVertical(40);
            bottom.changeSize(35);
            bottom.makeVisible();
            
            bottomA.changeColor("brown");
            bottomA.moveHorizontal(-257);
            bottomA.moveVertical(65);
            bottomA.changeSize(35);
            bottomA.makeVisible();
            
            bottomB.changeColor("brown");
            bottomB.moveHorizontal(-257);
            bottomB.moveVertical(10);
            bottomB.changeSize(35);
            bottomB.makeVisible();
            
            bottom1.changeColor("brown");
            bottom1.moveHorizontal(93);
            bottom1.moveVertical(40);
            bottom1.changeSize(35);
            bottom1.makeVisible();
            
            bottom2.changeColor("brown");
            bottom2.moveHorizontal(93);
            bottom2.moveVertical(65);
            bottom2.changeSize(35);
            bottom2.makeVisible();
            
            bottom3.changeColor("brown");
            bottom3.moveHorizontal(93);
            bottom3.moveVertical(10);
            bottom3.changeSize(35);
            bottom3.makeVisible();
            
            road.changeColor("gray");
            road.moveHorizontal(-100);
            road.moveVertical(99);
            road.changeSize(80);
            road.makeVisible();
    
            top.changeSize(60, 100);
            top.moveHorizontal(-140);
            top.moveVertical(-60);
            top.makeVisible();
            
            top1.changeSize(60, 100);
            top1.moveHorizontal(210);
            top1.moveVertical(-60);
            top1.makeVisible();
    
            moon.changeColor("yellow");
            moon.moveHorizontal(180);
            moon.moveVertical(-75);
            moon.changeSize(70);
            moon.makeVisible();
            
            star.changeColor("yellow");
            star.moveHorizontal(-120);
            star.moveVertical(-80);
            star.changeSize(7);
            star.makeVisible();
            
            star1.changeColor("yellow");
            star1.moveHorizontal(-80);
            star1.moveVertical(-50);
            star1.changeSize(7);
            star1.makeVisible();
            
            star2.changeColor("yellow");
            star2.moveHorizontal(140);
            star2.moveVertical(-65);
            star2.changeSize(7);
            star2.makeVisible();
            
            star3.changeColor("yellow");
            star3.moveHorizontal(90);
            star3.moveVertical(-70);
            star3.changeSize(7);
            star3.makeVisible();
            
            star4.changeColor("yellow");
            star4.moveHorizontal(-160);
            star4.moveVertical(-75);
            star4.changeSize(7);
            star4.makeVisible();
            
            star5.changeColor("yellow");
            star5.moveHorizontal(60);
            star5.moveVertical(-55);
            star5.changeSize(7);
            star5.makeVisible();
            
            star6.changeColor("yellow");
            star6.moveHorizontal(-20);
            star6.moveVertical(-77);
            star6.changeSize(7);
            star6.makeVisible();
            
            star7.changeColor("yellow");
            star7.moveHorizontal(5);
            star7.moveVertical(-35);
            star7.changeSize(7);
            star7.makeVisible();
            
            star8.changeColor("yellow");
            star8.moveHorizontal(105);
            star8.moveVertical(-27);
            star8.changeSize(7);
            star8.makeVisible();
            
            star9.changeColor("yellow");
            star9.moveHorizontal(-135);
            star9.moveVertical(-25);
            star9.changeSize(7);
            star9.makeVisible();
            
            girl.changeColor("magenta");
            girl.moveHorizontal(-40);
            girl.moveVertical(01);
            girl.changeSize(40,25);
            girl.makeVisible();
            
            boy.changeColor("blue");
            boy.moveHorizontal(-19);
            boy.moveVertical(01);
            boy.changeSize(40,25);
            boy.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        bottom.changeColor("black");
        road.changeColor("white");
        top.changeColor("black");
        moon.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        bottom.changeColor("green");
        bottom1.changeColor("green");
        road.changeColor("black");
        top.changeColor("green");
        moon.changeColor("yellow");
    }
}
