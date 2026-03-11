module ethos.com.ethos {
    requires javafx.controls;
    requires javafx.fxml;


    opens ethos.com.ethos to javafx.fxml;
    exports ethos.com.ethos;
}