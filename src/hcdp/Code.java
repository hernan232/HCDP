/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcdp;

/**
 *
 * @author Admin
 */
public class Code {

    private int bitNumber;
    private char[] data;

    public int getNumeroBits() {
        return bitNumber;
    }

    public void setNumeroBits(int numeroBits) {
        this.bitNumber = numeroBits;
    }

    public char[] getData() {
        return data;
    }

    public void setDatos(char[] data) {
        this.data = data;
    }

    public Code(int bitNumber) {
        this.bitNumber = bitNumber;
        double doubleLength = (double) bitNumber / 8;
        if (doubleLength - (int) doubleLength > 0) {
            doubleLength += 1;
        }
        int lengthArray = (int) doubleLength;
        data = new char[lengthArray];
    }

}
