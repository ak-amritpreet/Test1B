package com.example.csd214test01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Timer;
import java.util.TimerTask;

public class HelloController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    private int attemptNo;

    private boolean isAttemptingLogin = false;
    private final int DELAY_BETWEEN_ATTEMPTS_SECONDS = 5;
    private final String CORRECT_USERNAME = "amrit";
    private final String CORRECT_PASSWORD = "0606";

    @FXML
    protected void loginButtonClicked() {
//        if (isAttemptingLogin) {
//            messageLabel.setText("Please wait before attempting again.");
//            return;
//        }

        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please provide username and password.");
        } else if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            messageLabel.setText("Success!!!");
        } else {
            attemptNo++;
                if (attemptNo>=5){
                    messageLabel.setText("Sorry, Your Account is Locked!!!");
                }
                else {
                    messageLabel.setText("Sorry, invalid username or password.");
                    isAttemptingLogin = true;
                }


        }
    }}
