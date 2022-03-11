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
public class Lingkaran implements MenghitungBidang{
    private double r;
    
    public Lingkaran(double R){
        this.r = R;
    };

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    @Override
    public double wide() {
        return phi * (r * r);
    }

    @Override
    public double around() {
        return 2 * phi * r;
    }
}
