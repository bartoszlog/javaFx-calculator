package calc.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class CalcModel extends Application {
	
	public static void main(String[] args) throws Exception {
	    launch(args);
	  }

	@Override
	public void start(Stage stg) throws Exception {
	
		Parent root = FXMLLoader.load(getClass().getResource("/calc/view/MainPane.fxml"));
		Scene sce = new Scene(root,600,400);	
		stg.setScene(sce);
		stg.setResizable(false);
		stg.show();
	}
	
}