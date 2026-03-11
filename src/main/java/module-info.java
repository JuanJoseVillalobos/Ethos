module ethos.com.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens ethos.com.app to javafx.fxml;
    exports ethos.com.app;
}