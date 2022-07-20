@authentication
Feature: je me connecte à l'application orangeHRM
En tant que utilisateur je souhaite m'authentifier à l'application orangeHRM
 

  @connexion_ok
  Scenario: Authentification à l'application orangeHRM
   Given Je me connecte a  l'application orangeHRM
   When Je saisie le username "Admin"
   And  Je saisie le mot de passe "admin123"
   And Je clique sur le bouton login
   Then Je me redirige vers la page home " Welcome"
