# Simulation de Course de Chevaux 2 en Java
## Présentation

Bienvenue dans la simulation de course de chevaux en Java ! Ce programme vous permet de vivre l'excitation d'une course de chevaux en tour par tour, 
où vous pouvez choisir le nombre de participants, le type de course (tiercé, quarté, ou quinté), et regarder les chevaux s'affronter pour atteindre la ligne d'arrivée.

### Fonctionnalités

__Interface Utilisateur :__ Le programme invite l'utilisateur à saisir le nombre de chevaux et à sélectionner le type de course.

__Type de Course :__  
   * *Tiercé :* Affichage des trois premiers chevaux dans le bon ordre d'arrivée.
   * *Quarté :* Affichage des quatre premiers chevaux dans le bon ordre d'arrivée.
   * *Quinté :* Affichage des cinq premiers chevaux dans le bon ordre d'arrivée.
     
__Mécanique de la Course :__ Le programme simule la course tour par tour, affichant le numéro du cheval, sa vitesse et la distance parcourue, ou signalant sa disqualification.
  * À chaque tour, un jet de dé (de 1 à 6) est effectué pour chaque cheval.
  * Selon le résultat du dé, le cheval augmente ou diminue sa vitesse parmi 7 paliers (de 0 à 6).
  * La distance parcourue par chaque cheval est mise à jour en fonction de sa vitesse.
  * Certains chevaux peuvent passer au galop et être disqualifiés.
  * La course se termine lorsque tous les chevaux ont parcouru une distance de 2400m ou ont été disqualifiés.

### Comment Utiliser
1. Installer Git
2. Cloner le depo
3. Importer le projet dans votre IDE
4. Exécutez le programme
   
     * Saisissez le nombre de chevaux (entre 12 et 20)
     * Choisissez le type de course (tiercé, quarté, quinté)
     * Observez la simulation de la course et découvrez les résultats

### Amusez-vous bien ! 🏇
