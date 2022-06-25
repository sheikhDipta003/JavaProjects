package com.Dipta.ToDoList.dataModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class ToDo_Data {
    private static ToDo_Data instance = new ToDo_Data();
    private static String filename = "Todolistitems.txt";

    private ObservableList<ToDoItems> toDoItems;
    private DateTimeFormatter formatter;

    public static ToDo_Data getInstance(){
        return instance;
    }

    private ToDo_Data(){
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public ObservableList<ToDoItems> getToDoItems(){
        return toDoItems;
    }

    public void addTodoItem(ToDoItems item){
        toDoItems.add(item);
    }

    //Now we will write a method that will read toDoItems from the file
    public void loadToDoItems() throws IOException{
        toDoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader reader = Files.newBufferedReader(path);
        String input;

        try{
            while((input = reader.readLine()) != null){
                String[] itemPieces = input.split("\t");

                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

//                System.out.println("\ndetails : \n" + details);

                LocalDate date = LocalDate.parse(dateString, formatter);
                ToDoItems tempItem = new ToDoItems(shortDescription, details, date);
                toDoItems.add(tempItem);
            }
        } finally {
            if(reader != null){
                reader.close();
            }
        }
    }

    public void storeToDoItems() throws IOException{
        Path path = Paths.get(filename);
        BufferedWriter writer = Files.newBufferedWriter(path);

        try{
            Iterator<ToDoItems> i = toDoItems.iterator();

            while(i.hasNext()){
                ToDoItems item = i.next();
                writer.write(String.format("%s\t%s\t%s", item.getShortDescription(), item.getDetails(), item.getDeadline().format(formatter)));
                writer.newLine();
            }
        }
        finally {
            if(writer != null){
                writer.close();
            }
        }

    }

    public void deleteToDoItem(ToDoItems item){
        toDoItems.remove(item);
    }
}
