package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public javafx.scene.control.TextArea TextArea;
    @FXML
    public javafx.scene.control.TextField TextField;


    public void sendMsg(ActionEvent actionEvent) {
        TextArea.appendText(TextField.getText()+"\n");
        TextField.clear();
        TextField.requestFocus();
    }
}
