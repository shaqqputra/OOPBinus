module com.example.session07postexam {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.session07postexam to javafx.fxml;
    exports com.example.session07postexam;
}