package com.example.demo5;

import javafx.fxml.FXML;
import javafx.scene.SnapshotResult;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField genreTextField;

    @FXML
    private TextField imdbTextField;

    // Diğer 7 kutucuk için TextField bileşenlerini ekleyebilirsiniz

    @FXML
    private Label resultLabel;

    @FXML
    private void makePrediction() {
        String genre = genreTextField.getText();
        String imdb = imdbTextField.getText();

        // Diğer 7 kutucuktan da verileri alabilirsiniz

        // Tahmin işlemlerini burada gerçekleştirin

        // Örneğin:
        if (genre.equalsIgnoreCase("Drama") && imdb.equals("9.3")) {
            resultLabel.setText("Tahmin doğru!"); }

        else {
            resultLabel.setText("Tahmin yanlış!");
        }
    }}


