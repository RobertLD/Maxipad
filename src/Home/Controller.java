package Home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML private TextArea pad;

    @FXML protected void handleButtonA(ActionEvent event){
        pad.appendText("a");
    }
    @FXML protected void handleButtonB(ActionEvent event){
        pad.appendText("b");
    }
    @FXML protected void handleButtonC(ActionEvent event){
        pad.appendText("c");
    }
    @FXML protected void handleButtonD(ActionEvent event){
        pad.appendText("d");
    }
    @FXML protected void handleButtonE(ActionEvent event){
        pad.appendText("e");
    }
    @FXML protected void handleButtonF(ActionEvent event){
        pad.appendText("f");
    }
    @FXML protected void handleButtonG(ActionEvent event){
        pad.appendText("c");
    }
    @FXML protected void handleButtonH(ActionEvent event){
        pad.appendText("d");
    }
}
