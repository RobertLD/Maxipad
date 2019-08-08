package Home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;

import static java.lang.Character.isUpperCase;

@SuppressWarnings("all") // temporary to avoid nasty, stupid, ugly yellow lines from taking up my workspace
public class Controller {

    // hold value of current shift mode
    boolean shiftToggle = false;

    // textarea and shift button variables
    @FXML private TextArea pad;
    @FXML private ToggleButton buttonShift;

    // buttons o'boy
    @FXML private Button buttonA;
    @FXML private Button buttonB;
    @FXML private Button buttonC;
    @FXML private Button buttonD;
    @FXML private Button buttonE;
    @FXML private Button buttonF;
    @FXML private Button buttonG;
    @FXML private Button buttonH;
    @FXML private Button buttonI;
    @FXML private Button buttonJ;
    @FXML private Button buttonK;
    @FXML private Button buttonL;
    @FXML private Button buttonM;
    @FXML private Button buttonN;
    @FXML private Button buttonO;
    @FXML private Button buttonP;
    @FXML private Button buttonQ;
    @FXML private Button buttonR;
    @FXML private Button buttonS;
    @FXML private Button buttonT;
    @FXML private Button buttonU;
    @FXML private Button buttonV;
    @FXML private Button buttonW;
    @FXML private Button buttonX;
    @FXML private Button buttonY;
    @FXML private Button buttonZ;


// collection of letter handling

    /* Yes I understand that the buttons are handled in two different ways. One uses a hardcoded
     * value set within the handle function that matches up with the button and the other just grabs
     * text directly from the button text display. This makes it incredibly easy to toggle shift on the
     * alphabetic characters, and for the others? It's simply not required, so I ain't doin' it!
     */
    @FXML protected void handleButtonA(ActionEvent event){ pad.appendText(buttonA.getText()); }
    @FXML protected void handleButtonB(ActionEvent event){
        pad.appendText(buttonB.getText());
    }
    @FXML protected void handleButtonC(ActionEvent event){
        pad.appendText(buttonC.getText());
    }
    @FXML protected void handleButtonD(ActionEvent event){
        pad.appendText(buttonD.getText());
    }
    @FXML protected void handleButtonE(ActionEvent event){
        pad.appendText(buttonE.getText());
    }
    @FXML protected void handleButtonF(ActionEvent event){
        pad.appendText(buttonF.getText());
    }
    @FXML protected void handleButtonG(ActionEvent event){
        pad.appendText(buttonG.getText());
    }
    @FXML protected void handleButtonH(ActionEvent event){
        pad.appendText(buttonH.getText());
    }
    @FXML protected void handleButtonI(ActionEvent event){
        pad.appendText(buttonI.getText());
    }
    @FXML protected void handleButtonJ(ActionEvent event){
        pad.appendText(buttonJ.getText());
    }
    @FXML protected void handleButtonK(ActionEvent event){
        pad.appendText(buttonK.getText());
    }
    @FXML protected void handleButtonL(ActionEvent event){
        pad.appendText(buttonL.getText());
    }
    @FXML protected void handleButtonM(ActionEvent event){
        pad.appendText(buttonM.getText());
    }
    @FXML protected void handleButtonN(ActionEvent event){
        pad.appendText(buttonN.getText());
    }
    @FXML protected void handleButtonO(ActionEvent event){
        pad.appendText(buttonO.getText());
    }
    @FXML protected void handleButtonP(ActionEvent event){
        pad.appendText(buttonP.getText());
    }
    @FXML protected void handleButtonQ(ActionEvent event){
        pad.appendText(buttonQ.getText());
    }
    @FXML protected void handleButtonR(ActionEvent event){
        pad.appendText(buttonR.getText());
    }
    @FXML protected void handleButtonS(ActionEvent event){
        pad.appendText(buttonS.getText());
    }
    @FXML protected void handleButtonT(ActionEvent event){
        pad.appendText(buttonT.getText());
    }
    @FXML protected void handleButtonU(ActionEvent event){
        pad.appendText(buttonU.getText());
    }
    @FXML protected void handleButtonV(ActionEvent event){
        pad.appendText(buttonV.getText());
    }
    @FXML protected void handleButtonW(ActionEvent event){
        pad.appendText(buttonW.getText());
    }
    @FXML protected void handleButtonX(ActionEvent event){
        pad.appendText(buttonX.getText());
    }
    @FXML protected void handleButtonY(ActionEvent event){
        pad.appendText(buttonY.getText());
    }
    @FXML protected void handleButtonZ(ActionEvent event){
        pad.appendText(buttonZ.getText());
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
    @FXML protected void handleButtonBack(ActionEvent event) {
        if(pad.getLength() > 0) pad.setText(pad.getText(0, pad.getLength()-1));
    }

    // shift key is actually a toCapital key for the alphabetic characters
    // TODO: Add actual shift key mechanics
    @FXML protected void handleButtonShift(ActionEvent event) {
        this.shiftToggle = buttonShift.isSelected();
        // set all letters to upper/lowercase on shift toggle
        Button[] buttons = new Button[]{
                buttonA, buttonB,buttonC,buttonD,buttonE,buttonF,buttonG,buttonH,buttonI,
                buttonJ,buttonK,buttonL,buttonM,buttonN,buttonO,buttonP,buttonQ,buttonR,
                buttonS,buttonT,buttonU,buttonV,buttonW,buttonX,buttonY,buttonZ,
        };
        // iterate through buttons setting all their text capital/lowercase
        for(int i = 0; i < buttons.length; i++){
            char buttonChar = buttons[i].getText().charAt(0);
            if(isUpperCase(buttonChar)){
                buttons[i].setText(buttons[i].getText().toLowerCase());
            } else{
                buttons[i].setText(buttons[i].getText().toUpperCase());
            }
        }

    }
}
