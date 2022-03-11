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
public class PersegiPanjang implements MenghitungBidang{
    private double width,length;
    
    public PersegiPanjang(double Length, double Width){
        length = Length;
        width = Width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double wide() {
        return length * width;
    }

    @Override
    public double around() {
        return 2 * (length + width);
    }
    
    }
