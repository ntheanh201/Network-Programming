/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author macbook
 */
public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        
        CalculatorModel model = new CalculatorModel();
        
        CalculatorController controller = new CalculatorController(view,model);
        view.setVisible(true);
    }
}
