package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("UI Practice");

        //Create Label "Name"
        Text nameLabel = new Text("Name:");
        //TextField for "name"
        TextField nameField = new TextField();

        //Label for Date of birth
        Text dobLabel = new Text("Date of Birth:");
        //DatePicker for dobLabel
        DatePicker datePicker = new DatePicker();

        //Label for Gender
        Text genderText = new Text("Gender:");
        //RadioButtons named "Male" and "Female" under ToggleGroup
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(toggleGroup);
        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(toggleGroup);

        //Label for Reservation
        Text reserve = new Text("Reservation");
        //ToggleButtons "Yes" and "No" under a ToggleGroup
        ToggleGroup toggleGroup2 = new ToggleGroup();
        ToggleButton yes = new ToggleButton("Yes");
        yes.setToggleGroup(toggleGroup2);
        ToggleButton no = new ToggleButton("No");
        no.setToggleGroup(toggleGroup2);

        //Label for technologies known
        Text technologiesLabel = new Text("Technologies Known");

        //check boxes for education
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        javaCheckBox.setIndeterminate(false);

        //Label For Educational qualification
        Text eduLabel = new Text("Educational Qualification:");
        ObservableList<String> names = FXCollections.observableArrayList(
                "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        ListView<String> educationListView = new ListView<String>(names);

        //Label for location
        Text locationLabel = new Text("location");

        //Choice box for location
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll
                ("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");

        //Label for register
        Button buttonRegister = new Button("Register");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(500, 500);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderText, 0, 2);
        gridPane.add(male, 1, 2);
        gridPane.add(female, 2, 2);
        gridPane.add(reserve, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);

        gridPane.add(eduLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);

        //Styling nodes
        buttonRegister.setStyle(
                "-fx-background-color: darkslateblue; -fx-textfill: white;");

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderText.setStyle("-fx-font: normal bold 15px 'serif' ");
        reserve.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        eduLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting the back ground color
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Registration Form");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}