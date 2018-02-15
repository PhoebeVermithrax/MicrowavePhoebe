/*
 * Created by: Phoebe Vermithrax
 * Created on: 12-Feb-2018
 * Created for: ICS5U
 * Daily Assignment – Day #6
 * This program calculates the amount of time it'll take for the food to be cooked in the microwave.
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Microwave {

	//Set a global variable, food type, and number of servings.
	int foodType, numOfServings;
	
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Microwave window = new Microwave();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Microwave Time Calculator");
		
		Label lblSelectTheType = new Label(shell, SWT.NONE);
		lblSelectTheType.setBounds(23, 38, 202, 15);
		lblSelectTheType.setText("Select the type of food:");
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(281, 217, 129, 15);
		lblAnswer.setText("New Label");
		//Set the label to invisible.
		lblAnswer.setVisible(false);
		
		Button btnSub = new Button(shell, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the food type as 1.
				foodType = 1;
			}
		});
		btnSub.setBounds(23, 59, 75, 25);
		btnSub.setText("Sub");
		
		Button btnPizza = new Button(shell, SWT.NONE);
		btnPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the food type to 2.
				foodType = 2;
			}
		});
		btnPizza.setBounds(104, 59, 75, 25);
		btnPizza.setText("Pizza");
		
		Button btnSoup = new Button(shell, SWT.NONE);
		btnSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the food type to 3.
				foodType = 3;
			}
		});
		btnSoup.setBounds(185, 59, 75, 25);
		btnSoup.setText("Soup");
		
		Label lblNumberOfServings = new Label(shell, SWT.NONE);
		lblNumberOfServings.setBounds(23, 106, 202, 15);
		lblNumberOfServings.setText("Number Of Servings?:");
		
		Button btnNumOne = new Button(shell, SWT.NONE);
		btnNumOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the number of servings to 1.
				numOfServings = 1;
			}
		});
		btnNumOne.setBounds(23, 127, 75, 25);
		btnNumOne.setText("1");
		
		Button btnNumTwo = new Button(shell, SWT.NONE);
		btnNumTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the number of Servings to 2.
				numOfServings = 2;
			}
		});
		btnNumTwo.setBounds(104, 127, 75, 25);
		btnNumTwo.setText("2");
		
		Button btnNumThree = new Button(shell, SWT.NONE);
		btnNumThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the number of servings to 3.
				numOfServings = 3;
			}
		});
		btnNumThree.setBounds(185, 127, 75, 25);
		btnNumThree.setText("3");
		
		Button btnOrder = new Button(shell, SWT.NONE);
		btnOrder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set variables for the food time in minutes.
				double subTime = 1;
				double pizzaTime = 0.75;
				double soupTime = 1.75;
				double oneItemTime = 1;
				double twoItemTime = 1.5;
				double threeItemTime = 2;
				
				//Check to see which buttons the user clicked on and calculate.
				if (foodType == 1)
				{
					if (numOfServings == 1)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the sub.
						answer = (subTime * oneItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 2)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the sub.
						answer = (subTime * twoItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 3)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the sub.
						answer = (subTime * threeItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
				}
				else if (foodType == 2)
				{
					if (numOfServings == 1)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the pizza.
						answer = (pizzaTime * oneItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 2)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the pizza.
						answer = (pizzaTime * twoItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 3)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the pizza.
						answer = (pizzaTime * threeItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
				}
				else if (foodType == 3)
				{
					if (numOfServings == 1)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the soup.
						answer = (soupTime * oneItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 2)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the soup.
						answer = (soupTime * twoItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
					else if (numOfServings == 3)
					{
						//Set the variable for answer.
						double answer;
						
						//Calculate for the soup.
						answer = (soupTime * threeItemTime) * 60;
						
						//Make the label visible.
						lblAnswer.setVisible(true);
						
						//Out put the answer to the answer label.
						lblAnswer.setText(" " + answer + " seconds");
					}
				}
			}
		});
		btnOrder.setBounds(23, 174, 237, 25);
		btnOrder.setText("Order");
		
		Label lblNewTimeIntro = new Label(shell, SWT.NONE);
		lblNewTimeIntro.setBounds(23, 217, 237, 15);
		lblNewTimeIntro.setText("The total time in the microwave is: ");
		

	}
}
