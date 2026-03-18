Feature: My todo list

  Background: Creating Todolist
    Given the user is on the todo list page

  Scenario: Add the task "Buy milk" in the todo list
    When the user enters "Buy milk" as a task
    Then the task "Buy milk" should appear in the todo list

  Scenario: Add the task "Pay bills" in the todo list
    When the user enters "Pay bills" as a task
    Then the task "Pay bills" should appear in the todo list

  Scenario: Add the task "Clean the house" in the todo list
    When the user enters "Clean the house" as a task
    Then the task "Clean the house" should appear in the todo list

  Scenario: Mark the task "Buy milk" as completed
    Given the user enters "Buy milk" as a task
    When the user marks the task 0 as completed
    Then the task "Buy milk" should be shown as completed

  Scenario: Add three tasks
    Given the user enters "Take a shower" as a task
    Given the user enters "Do the dishes" as a task
    When the user enters "Fix my code" as a task
    Then I have 3 tasks in my list

  Scenario: Add two tasks
    Given the user enters "Take a shower" as a task
    When the user enters "Fix my code" as a task
    Then I have 2 tasks in my list

  Scenario: Add zero tasks
    Then I have 0 tasks in my list

  Scenario: Complete two tasks
    Given the user enters "Take a shower" as a task
    Given the user enters "Do the dishes" as a task
    Given the user enters "Fix my code" as a task
    Given the user marks the task 1 as completed
    When the user marks the task 2 as completed
    Then I have 2 completed tasks in my list

  Scenario: Complete two tasks
    Given the user enters "Take a shower" as a task
    Given the user enters "Do the dishes" as a task
    Given the user enters "Fix my code" as a task
    Given the user marks the task 1 as completed
    When the user marks the task 1 as completed
    Then I have 1 completed tasks in my list

  Scenario: Remove task
    Given the user enters "Take a shower" as a task
    Given the user enters "Do the dishes" as a task
    Given the user enters "Fix my code" as a task
    When the user removes the task 1 from the list
    Then I have 2 tasks in my list

  Scenario: Long task name is not added
    Given the user enters "Take a shoTake a shoTake a show" as a task
    Given the user enters "Do the dishes" as a task
    When the user enters "Fix my code" as a task
    Then I have 2 tasks in my list

  Scenario: Pretty long task name is added
    Given the user enters "Take a shoTake a shoTake a sho" as a task
    Given the user enters "Do the dishes" as a task
    When the user enters "Fix my code" as a task
    Then I have 3 tasks in my list

  Scenario: Long task name gives warning
    When the user enters "Take a shoTake a shoTake a show" as a task
    Then I recieve a warning with message "Too long description"

