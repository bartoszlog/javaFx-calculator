package calc.controller;


import calc.model.CalculatorMode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainPaneController {
	
    @FXML
    private Label resultLabel;

    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private CalculatorMode calca = new CalculatorMode();
    
    @FXML
    public void getNumber(ActionEvent event){
    	if (start){
    		resultLabel.setText("");
    		start = false;
    	}
    	String num = ((Button) event.getSource()).getText();
    	resultLabel.setText(resultLabel.getText()+num);  	
    }
  
    @FXML
    public void processOperators(ActionEvent event){
    	String val = ((Button) event.getSource()).getText();
    	if (!val.equals("=")){
    		if(!operator.isEmpty()) 
    			return;
    		operator = val;
    		System.out.println(val);
    		number1 = Long.parseLong(resultLabel.getText());
    		resultLabel.setText("");  		
    		
    	} else {
    		if(operator.isEmpty()) 
    			return;
    		System.out.println(val);
    		long number2 = Long.parseLong(resultLabel.getText());
    		double lastResult = calca.calculate(number1, number2, operator);		
    		resultLabel.setText(String.valueOf(lastResult));  		
    		operator = ""; 		
    		start = true;
    	}
    }		
}
