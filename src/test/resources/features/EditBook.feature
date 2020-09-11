@smoke
@edit
Feature: Edit Book
  
  Scenario: Edit book as Librarian
    Given the user is on the Library app login page
    When the user logs in using "librarian16@library" and "8BzUhhaU"
    Then the user should be able to login on Library app bookpage
    When the user navigates to "Books" page






