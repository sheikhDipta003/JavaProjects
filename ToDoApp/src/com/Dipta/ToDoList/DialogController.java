package com.Dipta.ToDoList;

import com.Dipta.ToDoList.dataModel.ToDoItems;
import com.Dipta.ToDoList.dataModel.ToDo_Data;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import javafx.scene.control.DatePicker;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public ToDoItems processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        ToDoItems newItem = new ToDoItems(shortDescription, details, deadlineValue);
        ToDo_Data.getInstance().addTodoItem(newItem);

        return newItem;
    }
}
