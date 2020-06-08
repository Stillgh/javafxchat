
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;


public class MainController {

    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    boolean clicked = false;


    @FXML
    private TextArea mainWindow;

    @FXML
    private TextField myMessage;

    @FXML
    String messageToSend1;



    @FXML
    void pressEnter(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER && !myMessage.getText().isEmpty()){
//            String messageToSend = myMessage.getText();
//            System.out.println(messageToSend + " qqqqqq");
//            System.out.println(myMessage.getText() + " wwwwwwwwwwwww");
//            messageToSend1=messageToSend;
//            System.out.println(messageToSend1 + " 1111111");
//            System.out.println(clicked + " before");
           // System.out.println(messageToSend + " qqqqqqqqqqq");
            clicked = true;
            //System.out.println(clicked + " after");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myMessage.clear();

        }

    }

    public TextArea getMainWindow() {
        return mainWindow;
    }
    public void displayAllMessages(){

        Thread inThread = new Thread(() -> {
            while (true) {
                String input;
                try {
                    if ((input = client.in.readLine()) != null){
                        //System.out.println("INPPPUT " + input);
                        mainWindow.appendText(input + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        inThread.start();
   }

    public void sendMessage(){
        Thread outThread = new Thread(() -> {
            while (true){
                    String myMesToSend;
                    //myMesToSend = messageToSend;
                    //System.out.println(myMesToSend + " ыыыыыыыыыыыы");
//                    if ((myMesToSend=messageToSend1) != null && !(myMesToSend=messageToSend1).isEmpty()) {
//                        //System.out.println(myMesToSend + " OUUUUTTT");
//                        client.out.println("[" + client.getUserName() + "]: " + myMesToSend);
//                    }
//                    messageToSend1 = null;
                if (!myMessage.getText().isEmpty() && clicked) {
                    client.out.println("[" + client.getUserName() + "]: " + myMessage.getText());
                    clicked = false;
                }


            }
        });
        outThread.start();
    }



}
