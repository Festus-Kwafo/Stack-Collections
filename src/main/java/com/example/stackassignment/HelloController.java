package com.example.stackassignment;

import java.util.Stack;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController  {

    @FXML
    private TextField textStack;


    @FXML
    private TextArea stackShow;


    Stack <String> text = new  Stack<String>();
    @FXML
    protected void onPushButtonClick() throws Exception {
        try{
            String item = textStack.getText();
            stackShow.setText("");
            textStack.setText("");
            text.push(item);

            for (int i = text.size()-1; i>=0; i-- ){
                stackShow.appendText(text.get(i)+ "\n");
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown : " + e);

        }


    }

    @FXML
    protected void onPopButtonClick() {
        if(!text.empty()){
            stackShow.setText("");
            textStack.setText("");
            text.pop();
            for (int i = text.size()-1; i>=0; i-- ){
                stackShow.appendText(text.get(i)+ "\n");
            }
        }
        else {
            stackShow.setText("Stack is empty");
        }
    }

}