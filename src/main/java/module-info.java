module com.konstantinponomarev.bookonlineshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.konstantinponomarev.bookonlineshop to javafx.fxml;
    exports com.konstantinponomarev.bookonlineshop;
}