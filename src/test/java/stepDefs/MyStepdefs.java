package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import todo.MyException;
import todo.TodoList;

import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefs {

    private TodoList todoList;
    private String myMessage;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Given("the user is on the todo list page")
    public void theUserIsOnTheTodoListPage() {
        todoList = new TodoList();
        myMessage = "";
    }

    @When("the user enters {string} as a task")
    public void theUserEntersAsATask(String task) {


        try {
            todoList.addTask(task);
        } catch(MyException e) {
            myMessage = e.getMessage();
        }


    }

    @Then("the task {string} should appear in the todo list")
    public void theTaskShouldAppearInTheTodoList(String task) {
        String actual = todoList.getList();
        String expected = "1. [ ] " +task;

        assertEquals(expected, actual);
    }

    @When("the user marks the task {int} as completed")
    public void theUserMarksTheTaskAsCompleted(int task) {


        todoList.completeTask(task);
    }

    @Then("the task {string} should be shown as completed")
    public void theTaskShouldBeShownAsCompleted(String task) {
        String actual = todoList.getList();

        String expected = "1. [X] " +task;

        assertEquals(expected, actual);
    }

    @Then("I have {int} tasks in my list")
    public void iHaveTasksInMyList(int expected) {

        int actual = todoList.getNbrOfTasks();

        assertEquals(expected, actual);
    }

    @Then("I have {int} completed tasks in my list")
    public void iHaveCompletedTasksInMyList(int expected) {
        int actual = todoList.getFinishedTasks();

        assertEquals(expected, actual);
    }

    @When("the user removes the task {int} from the list")
    public void theUserRemovesTheTaskFromTheList(int index) {
        todoList.removeTask(index);
    }

    @Then("I recieve a warning with message {string}")
    public void iRecieveAWarningWithMessage(String expected) {
        assertEquals(expected, myMessage);
    }
}
