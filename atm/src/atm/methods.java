package atm;

import java.util.EventObject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView.EditEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class methods {
	   Scene scene;
	   Login Gui;
	   trans transaction;
	   Stage stage;
	   mainTransactions objectTrans=new mainTransactions();
	   int X;
	   String Y;
	   public void showScreen(){
		   Label amount= new Label("Enter the amount you want:");
		   TextField amountField= new TextField();
		   Button zero=new Button("0");
		   Button one=new Button("1");
		   Button two=new Button("2");
		   Button three=new Button("3");
		   Button four=new Button("4");
		   Button five=new Button("5");
		   Button six=new Button("6");
		   Button seven=new Button("7");
		   Button eight=new Button("8");
		   Button nine=new Button("9");
		   Button ok=new Button("ok");
		   GridPane grid = new GridPane();
		   grid.add(amount, 1,0 );
		   grid.add(amountField, 1, 1);
		   grid.add(zero, 1, 5);
		   grid.add(one, 0, 2);
		   grid.add(two, 1, 2);
		   grid.add(three, 2, 2);
		   grid.add(four, 0, 3);
		   grid.add(five, 1, 3);
		   grid.add(six, 2, 3);
		   grid.add(seven, 0, 4);
		   grid.add(eight, 1, 4);
		   grid.add(nine, 2, 4);
		   grid.add(ok, 1, 6);
		   
		   zero.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				amountField.appendText("0");
			}
		});
		   one.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("1");
				}
			});
		   two.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("2");
				}
			});
		   three.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("3");
				}
			});
		   four.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("4");
				}
			});
		   five.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("5");
				}
			});
		   six.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("6");
				}
			});
		   seven.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("7");
				}
			});
		   eight.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("8");
				}
			});
		   nine.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					amountField.appendText("9");
				}
			});
		   ok.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
			stage.setScene(transaction.getScene());
			Y=amountField.getText();
			
			}
			});
		   
		   
		   scene = new Scene(grid,600,400);
	   }
	   
	   public methods (Stage stage) {
			this.stage=stage;
		}
	
	
	public Scene getScene() {
		return scene;
	}
	
	public void setTransaction(trans transaction) {
		this.transaction = transaction;
	}
	 
	   
}
