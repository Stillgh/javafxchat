import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionListener;

public class MainWindow extends Application {

    TextArea textArea1;




    @Override
    public void start(Stage primaryStage) throws Exception {

//        primaryStage.setTitle("Chat");
//
//        Parent root = FXMLLoader.load(getClass().getResource("signinwindow.fxml"));
//        Scene scene = new Scene(root);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
        FXMLLoader.load(getClass().getResource("signinwindow.fxml"));
        }


    public static void main(String[] args) {
        launch(args);
        }
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Chat");
//
//
//
//
//
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(25, 25, 25, 25));
//
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
//
//
//
//        Text scenetitle = new Text("Welcome");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        grid.add(scenetitle, 0, 0, 2, 1);
//
//        Label userName = new Label("User Name:");
//        grid.add(userName, 0, 1);
//
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 1);
//
//
//
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//
//
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//
//
//        Stage stage1 = new Stage();
//
//        textArea1 = new TextArea();
//        TextField userTextField1 = new TextField();
//        VBox vbox = new VBox(30, textArea1, userTextField1);
//
//        stage1.setTitle("Chat");
//        stage1.setScene(new Scene(vbox, 450, 450));
//        userTextField1.setOnKeyPressed( event -> {
//            if (event.getCode().equals(KeyCode.ENTER)) {
//                String str = userTextField1.getText();
//                textArea1.setText(textArea1.getText() + "\n" + str);
//                userTextField.clear();
//            }
//
//    });
//        btn.setOnAction(e -> {
//            primaryStage.close();
//
//            stage1.show();
//
//        });
//                primaryStage.show();
//    }

