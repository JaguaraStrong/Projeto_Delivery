package senac.senacfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class AboutController {
    @FXML
private TextArea okText = new TextArea();

boolean[] onOff = {false, false, false, false, false};
   public void onSelectedBox1(){
       if (onOff[0] == false){
           onOff[0] = true;
       } else {
           onOff[0] = false;
       }
   }

    public void onSelectedBox2(){
        if (onOff[1] == false){
            onOff[1] = true;
        } else {
            onOff[1] = false;
        }
    }

    public void onSelectedBox3(){
        if (onOff[2] == false){
            onOff[2] = true;
        } else {
            onOff[2] = false;
        }
    }

    public void onSelectedBox4(){
        if (onOff[3] == false){
            onOff[3] = true;
        } else {
            onOff[3] = false;
        }
    }

    public void onSelectedBox5(){
        if (onOff[4] == false){
            onOff[4] = true;
        } else {
            onOff[4] = false;
        }
    }

    public void onOkayClick(){
       boolean pasteSelected = false;
       for (int x = 0;x < onOff.length;x++){
           if(onOff[x] == true){
               pasteSelected = true;
           }
       }
       if (pasteSelected == true){
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

//    public void onVisibleTextArea(){
//       okText.setVisible(false);
 //   }
}
