module com.example.csd214test01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.csd214test01 to javafx.fxml;
    exports com.example.csd214test01;
}