@smoke
Feature: Librarian can add book
  @addBook
  Scenario: User should be able to add book
    Given the user is on the Library app login page
    When the user logs in using "librarian18@library" and "rKG2sP88"
    Given the user is on Book Management Page
    When the user clicks on Add Book
    Then the user should be able to see Add Book pop-up
