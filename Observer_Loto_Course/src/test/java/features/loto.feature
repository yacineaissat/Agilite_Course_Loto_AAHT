@tag
Feature: Calcul de gain

  @tag1
  Scenario: Calculer un gain
    Given joueur
    When Je choisis un jeu de 6 boules
    Then Je veux avoir mon gain
    And 0 sinon