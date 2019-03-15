package atm;

import java.util.ArrayList;

public class history {
	ArrayList<Double> myList= new  ArrayList<Double>(5);
	   int index=0;
	   String type;
	   double amount;
	   
	   withdraw with;
	   deposit dep;
	   mainTransactions objectTrans;	   
	   trans transaction;
	   
	   public history(String type,double amount) {
		   this.type=type;
		   this.amount=amount;
	   }
	   public void history1(){
		   for(index=0;index<5;index++) {
		     	myList.set(index,with.Y);
		     	
			}
	   }
	   
}
