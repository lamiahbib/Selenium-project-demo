@authentication
Feature: je me connecte à l'application orangeHRM
  En tant que utilisateur je souhaite m'authentifier à l'application orangeHRM


Background:
    Given Je me connecte a  l'application orangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    
  @connexion_ok
  Scenario: Authentification à l'application orangeHRM
  
    Then Je me redirige vers la page home "Welcome"

  @deconnexion
  Scenario: Verifier la deconnexion
   
   
    When Je clique sur l icone logout
    And Je clique sur le bouton logout
