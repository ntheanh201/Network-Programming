/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class CalculatorModel implements Serializable {
    
    private int value;

    public void addValue(int num1, int num2){
        value = num1+num2;
    }
    
    public void subValue(int num1, int num2){
        value = num1-num2;
    }
    
    public void mulValue(int num1, int num2){
        value = num1*num2;
    }
    
    public void diveValue(int num1, int num2){
        value = num1/num2;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
