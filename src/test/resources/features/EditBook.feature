@smoke
@edit
@ELW-55
Feature: Edit Book
  
  Scenario: Edit book as Librarian
    Given the user is on the Library app login page
    When the user logs in using "librarian16@library" and "8BzUhhaU"
    Then the user should be able to login on Library app dashbord
    When the user navigates to "Books" page
    And the user selects the first book in the list
    And the user fills in the fields as Book Name: "Book Name",  ISBN:"12345678", Year: "1900"
    And the user clicks on Save Changes button
    Then the field should be updated to Book Name: "Book Name",  ISBN:"12345678", Year: "1900"







