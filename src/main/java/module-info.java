module ru.soft.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ru.soft.app to javafx.fxml;
    exports ru.soft.app;
}