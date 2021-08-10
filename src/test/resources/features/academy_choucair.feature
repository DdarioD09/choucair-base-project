# Autor: Dario Daza
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given that Brandon wants to learn automation at the academy Choucair
      | strUser   | strPassword |
      | TuUsuario | TuClave     |
    When he search for the course on the Choucair academy platform
      | strCourse               |
      | Metodologia Bancolombia |
    Then he finds the course called
      | strCourse               |
      | Metodologia Bancolombia |