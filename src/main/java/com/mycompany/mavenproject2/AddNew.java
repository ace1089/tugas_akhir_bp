import com.mycompany.mavenproject2.Data.OtherData;
import com.mycompany.mavenproject2.Data.OtherItem;
import com.mycompany.mavenproject2.Data.TodoData;
import com.mycompany.mavenproject2.Data.TodoItem;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;





/**
 *
 * @author Hanif Rasendra Putra
 */
public class AddNew {
     
    @FXML
    private DatePicker Deadlines;

    @FXML
    private TextField Task;

    @FXML
    private TextArea DetailsArea;

    @FXML
    private Button cancel;

    @FXML
    private Button ok;

    @FXML
    private AnchorPane scenePane;

    @FXML
    void cancel(ActionEvent event) {
        Stage stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }
     @FXML
    void ok(ActionEvent event) {
      
    }
