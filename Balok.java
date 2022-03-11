/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author OWNER
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double height;

    public Balok(double Length, double Width, double Height){
        super(Width,Length);
        height = Height;
    };
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(int Height){
        height = Height;
    }

    @Override
    public double area() {
        return 2 * (super.wide() + (super.getLength()*height) + (super.getWidth()*height));
    }

    @Override
    public double volume() {
        return super.wide() * height;
    }
}
