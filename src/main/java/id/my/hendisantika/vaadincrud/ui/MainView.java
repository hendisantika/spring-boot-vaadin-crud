package id.my.hendisantika.vaadincrud.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import id.my.hendisantika.vaadincrud.model.Person;
import id.my.hendisantika.vaadincrud.repository.PersonRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vaadin-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/11/24
 * Time: 17.49
 * To change this template use File | Settings | File Templates.
 */
@Route
public class MainView extends VerticalLayout {

    final Grid<Person> grid;
    private final PersonRepository repo;
    private final Button newBtn = new Button("New");
    private final Button deleteBtn = new Button("Delete");
    private final Button saveBtn = new Button("Save");
    private final HorizontalLayout btnLayout = new HorizontalLayout();
    private final HorizontalLayout fieldsLayout = new HorizontalLayout();

    private final TextField name = new TextField("First Name");
    private final TextField lastName = new TextField("Last Name");
    private final IntegerField idField = new IntegerField("ID");

    private final String MAX_WIDTH = "400px";
    private final String BUTTON_WIDTH = "123px";
}
