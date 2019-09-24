/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gugi_153040064;

/**
 *
 * @author Azhar
 */
public class A {
    protected int n1;
/*
* Konstruktor
*/
public A() {}
public A(int n1) {
    this.n1 = n1;
}
/*
* Fungsional
*/
public int hitung(int n2) {
    return n1+n2;
}
/*
* Setter & Getter
*/
public int getN1() {
    return n1;
}
public void setN1(int n1) {
    this.n1 = n1;
    }
}

