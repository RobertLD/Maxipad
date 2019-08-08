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
        pad.appendText("g");
    }
    @FXML protected void handleButtonH(ActionEvent event){
        pad.appendText("h");
    }
    @FXML protected void handleButtonI(ActionEvent event){
        pad.appendText("i");
    }
    @FXML protected void handleButtonJ(ActionEvent event){
        pad.appendText("j");
    }
    @FXML protected void handleButtonK(ActionEvent event){
        pad.appendText("k");
    }
    @FXML protected void handleButtonL(ActionEvent event){
        pad.appendText("l");
    }
    @FXML protected void handleButtonM(ActionEvent event){
        pad.appendText("m");
    }
    @FXML protected void handleButtonN(ActionEvent event){
        pad.appendText("n");
    }
    @FXML protected void handleButtonO(ActionEvent event){
        pad.appendText("o");
    }
    @FXML protected void handleButtonP(ActionEvent event){
        pad.appendText("p");
    }
    @FXML protected void handleButtonQ(ActionEvent event){
        pad.appendText("q");
    }
    @FXML protected void handleButtonR(ActionEvent event){
        pad.appendText("r");
    }
    @FXML protected void handleButtonS(ActionEvent event){
        pad.appendText("s");
    }
    @FXML protected void handleButtonT(ActionEvent event){
        pad.appendText("t");
    }
    @FXML protected void handleButtonU(ActionEvent event){
        pad.appendText("u");
    }
    @FXML protected void handleButtonV(ActionEvent event){
        pad.appendText("v");
    }
    @FXML protected void handleButtonW(ActionEvent event){
        pad.appendText("w");
    }
    @FXML protected void handleButtonX(ActionEvent event){
        pad.appendText("x");
    }
    @FXML protected void handleButtonY(ActionEvent event){
        pad.appendText("y");
    }
    @FXML protected void handleButtonZ(ActionEvent event){
        pad.appendText("z");
    }
    @FXML protected void handleButtonZero(ActionEvent event){
        pad.appendText("0");
    }
    @FXML protected void handleButtonOne(ActionEvent event){
        pad.appendText("1");
    }
    @FXML protected void handleButtonTwo(ActionEvent event){
        pad.appendText("2");
    }
    @FXML protected void handleButtonThree(ActionEvent event){
        pad.appendText("3");
    }
    @FXML protected void handleButtonFour(ActionEvent event){
        pad.appendText("4");
    }
    @FXML protected void handleButtonFive(ActionEvent event){
        pad.appendText("5");
    }
    @FXML protected void handleButtonSix(ActionEvent event){
        pad.appendText("6");
    }
    @FXML protected void handleButtonSeven(ActionEvent event){
        pad.appendText("7");
    }
    @FXML protected void handleButtonEigth(ActionEvent event){
        pad.appendText("8");
    }
    @FXML protected void handleButtonNine(ActionEvent event){
        pad.appendText("9");
    }
    @FXML protected void handleButtonPlus(ActionEvent event){
        pad.appendText("+");
    }
    @FXML protected void handleButtonMinus(ActionEvent event){
        pad.appendText("-");
    }

    @FXML protected void handleButtonSlash(ActionEvent event) {
        pad.appendText("\\");
    }

    @FXML protected void handleButtonBar(ActionEvent event) {
        pad.appendText("|");
    }

    @FXML protected void handleButtonFlatBananaRight(ActionEvent event) {
        pad.appendText("]");
    }

    @FXML protected void handleButtonFlatBananaLeft(ActionEvent event) {
        pad.appendText("[");
    }

    @FXML protected void handleButtonRightBanana(ActionEvent event) {
        pad.appendText(")");
    }

    @FXML protected void handleButtonLeftBanana(ActionEvent event) {
        pad.appendText("(");
    }

    @FXML protected void handleButtonRCurl(ActionEvent event) {
        pad.appendText("}");
    }

    @FXML protected void handleButtonLCurl(ActionEvent event) {
        pad.appendText("{");
    }

    @FXML protected void handleButtonComma(ActionEvent event) {
        pad.appendText(",");
    }

    @FXML protected void handleButtonPeriod(ActionEvent event) {
        pad.appendText(".");
    }

    @FXML protected void handleButtonApo(ActionEvent event) {
        pad.appendText("`");
    }

    @FXML protected void handleButtonTilde(ActionEvent event) {
        pad.appendText("~");
    }

    @FXML protected void handleButtonSColon(ActionEvent event) {
        pad.appendText(";");
    }

    @FXML protected void handleButtonColon(ActionEvent event) {
        pad.appendText(":");
    }

    @FXML protected void handleButtonGreat(ActionEvent event) {
        pad.appendText(">");
    }

    @FXML protected void handleButtonHash(ActionEvent event) {
        pad.appendText("#");
    }

    @FXML protected void handleButtonMod(ActionEvent event) {
        pad.appendText("%");
    }

    @FXML protected void handleButtonQuestion(ActionEvent event) {
        pad.appendText("?");
    }

    @FXML protected void handleButtonUs(ActionEvent event) {
        pad.appendText("_");
    }

    @FXML protected void handleButtonSingleQ(ActionEvent event) {
        pad.appendText("'");
    }

    @FXML protected void handleButtonDoubleQ(ActionEvent event) {
        pad.appendText("\"");
    }

    @FXML protected void handleButtonEqual(ActionEvent event) {
        pad.appendText("=");
    }

    @FXML protected void handleButtonNot(ActionEvent event) {
        pad.appendText("!");
    }

    @FXML protected void handleButtonLess(ActionEvent event) {
        pad.appendText("<");
    }

    @FXML protected void handleButtonRaise(ActionEvent event) {
        pad.appendText("^");
    }

    @FXML protected void handleButtonMultiply(ActionEvent event) {
        pad.appendText("*");
    }

    @FXML protected void handleButtonDivide(ActionEvent event) {
        pad.appendText("/");
    }

    @FXML protected void handleButtonSpace(ActionEvent event) {
        pad.appendText(" ");
    }

    @FXML protected void handleButtonEnter(ActionEvent event) {
        pad.appendText("\n");
    }

    @FXML protected void handleButtonTab(ActionEvent event) {
        pad.appendText("\t");
    }

    @FXML protected void handleButtonShift(ActionEvent event) {
        // TODO: custom modifier to all keys above to match the function of shift
    }
}
