package praktikum5.soal1;

/**
 *
 * @author acer
 */
public class Cylinder extends Shape{
        private double radius; //radius in feet
        private double height; 
//----------------------------------
// Constructor: Sets up the Cylinder.
//----------------------------------
public Cylinder(double r, double h)
{
super("Cylinder");
radius = r;
height = h;
}
public double getRadius(){
    return radius;
}

public void setRadius(double r){
    this.radius = r;
}

public double getHeight(){
    return height;
}

public void setHeight(double h){
    this.height=h;
}

//-----------------------------------------
// Returns the surface area of the sphere.
//-----------------------------------------

public double area()
{
return Math.PI*radius*radius*height;
}

//-----------------------------------
// Returns the sphere as a String.
//-----------------------------------

public String toString()
{
return super.toString() + " of radius " + radius + " and height "+ height;
}
}
