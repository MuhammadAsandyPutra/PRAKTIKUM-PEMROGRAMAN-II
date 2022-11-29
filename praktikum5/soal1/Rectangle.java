/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

/**
 *
 * @author acer
 */
public class Rectangle extends Shape{
        private double length;
        private double width;
//----------------------------------
// Constructor: Sets up the Rectangle.
//----------------------------------
public Rectangle(double l, double w)
{
super("Rectangle");
this.length  = l;
this.width = w;
}


public double getwidth(){
 return width;   
}

public void setWidth(double w){
    this.width=w;
    
}

public double getLength(){
    return length;
}

public void setLength(double l){
    this.length=l;
    
}
//-----------------------------------------
// Returns the surface area of the sphere.
//-----------------------------------------

public double area()
{
return length*width;
}

//-----------------------------------
// Returns the sphere as a String.
//-----------------------------------

public String toString()
{
return super.toString() + " of length " + length + " and width "+ width;
}
}
