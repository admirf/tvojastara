package com.fusion.matrix;

/**
 * Created by admir on 11/20/2015.
 * Moze se dosta funkcionalnosti dodat da bude korisno za nedaj boze debugiranja
 */
public class MatrixException extends Exception {
    int xDiff, yDiff;
    public MatrixException() {xDiff = -1; yDiff = -1;}
    public MatrixException(Matrix a, Matrix b) {
        xDiff = Math.abs(a.getCols() - b.getCols());
        yDiff = Math.abs(a.getRows() - b.getRows());
    }
    public int getRowDifference() {return yDiff;}
    public int getColDifference() {return xDiff;}
}
