package Programmeren2.Gui.Student;

import javafx.stage.Stage;
import Programmeren2.Domain.Gender;
import Programmeren2.Gui.Gui;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.PromptData;

public class GCreateStudent {
    public static void showWindow(Stage window) {
        BorderPane mHBox = new BorderPane();
        VBox lVBox = new VBox();
        VBox rVBox = new VBox();
        mHBox.setPadding(new Insets(10, 35, 10, 35));
        lVBox.setSpacing(5);
        rVBox.setSpacing(5);

        Label createStudent = new Label("Create a student");
        createStudent.setStyle("-fx-font-weight: bold; -fx-font-size:17");
        mHBox.setTop(createStudent);
        mHBox.setLeft(lVBox);
        mHBox.setRight(rVBox);
        mHBox.setAlignment(createStudent, Pos.CENTER);

        Label name = new Label("Name:");
        TextField nameTextField = new TextField();

        Label email = new Label("Email:");
        TextField emailTextField = new TextField();

        Label gender = new Label("Gender: ");
        ChoiceBox<Gender> genderChoice = new ChoiceBox<>();
        // Tijdelijk een choicebox wellicht binnenkort checkbox ipv choiceboix?

        Label birthDate = new Label("Birthdate:");
        DatePicker birthDatePicker = new DatePicker();

        Label address = new Label("Address:");
        TextField addressTextField = new TextField();
        addressTextField.setPromptText("Examplestreet 123 ");

        Label city = new Label("City:");
        TextField cityTextField = new TextField();
        cityTextField.setPromptText("New York");

        Label country = new Label("Country:");
        TextField countryTextField = new TextField();
        countryTextField.setPromptText("Netherlands ");

        Button createStudentButton = new Button("Save & Create");
        createStudentButton.setStyle("-fx-background-color: #0495bd; -fx-text-fill: white; -fx-font-size:17; -fx-font-weight: bold");
        rVBox.setMargin(createStudentButton, new Insets(15, 0, 0, 0));

        Button backButton = new Button("< Back");
        backButton.setOnAction(e -> {try {
            Gui.showWindow(window);
        } catch (Exception e1) {
            e1.printStackTrace();
        }});

        mHBox.setBottom(backButton);

        lVBox.getChildren().addAll(name, nameTextField, email, emailTextField, gender, genderChoice, birthDate, birthDatePicker);
        rVBox.getChildren().addAll(address, addressTextField, city, cityTextField, country, countryTextField, createStudentButton);

        Scene scene = new Scene(mHBox, 500, 300);
        window.setScene(scene);
    }
}
