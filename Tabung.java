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
public class Tabung extends Lingkaran implements MenghitungRuang{
private double height;

public Tabung(double r, double Height){
super(r);
this.height = Height;
};

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return 2 * phi * super.getR()*(super.getR() + height);
    }

    @Override
    public double volume() {
        return phi * super.getR() * super.getR() * height;
    }

}
