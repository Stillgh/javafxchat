import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInController {


    @FXML
    private Parent root ;

    @FXML
    private TextField userNameInput;

    @FXML
    private Button signInButton;

    public static final Stage stage  = new Stage();

    @FXML
    void signIn(ActionEvent event) {
        String userName = userNameInput.getText();

        stage.close();
        initializeMainWindow();
    }


    public void initialize() {
        stage.setTitle("Chat");

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void initializeMainWindow(){
        stage.setTitle("Chat");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("mainchat.fxml"));

//        Parent root = null;
//        try {
//            root = FXMLLoader.load(getClass().getResource("mainchat.fxml"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }

        MainController mainController = loader.getController();
        Client client = initializeClient(userNameInput.getText());
        mainController.setClient(client);


        Parent parent = loader.getRoot();

        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();
        client.execute();


        mainController.displayAllMessages();
        mainController.sendMessage();
    }

    public Client initializeClient(String username){
        return new Client(username);
    }

}