# Projet: Ballade dans un Labyrinthe

## Build automatique

#### Compilation

`ant compile`

Compile les classes présentes dans le dossier `src/`. Crée le dossier `bin/` (non versionné) contenant les binaires.

#### Génération de l'exécutable

`ant jar`

Crée le dossier `dist/` (non versionné) en générant le fichier JAR exécutable.

#### Exécution

`ant run`

## Développement

#### Sprint 1 :
Déplacements (tourner à droite / gauche / Avance / Reculer)
Créer la version texte (avec les coordonnées lors de chaque mouvement)

#### Sprint 2 :
Gérer la version Graphique :
* Heros
* Labyrinthe
  * Lier les Déplacements au personnage
  * Sortie

#### Sprint 3 :
* Gérer les Monstres avec déplacements “aléatoires”
* Gérer les contacts du Héros avec les Monstres :
* Attaques
* Gestion des points de vie

#### Sprint 4 :
* Gerer les Niveaux (passages , pièges magiques .. )
* Quand un personnage est positionné en (Xs,Ys), passage au niveau Suivant
* Objets : bonus
* Gerer l’animation “tresor” (dans le dernier niveau)
* Gérer la victoire défaite

#### Sprint 5 :
* Gérer la difficulté :
  * Facile => chemin vers la sortie qui s’affiche
  * Moyen => Sans chemin qui s’affiche
* Difficile : vision réduite.
  * Introduire un Timer (en fct de la difficulté)
  * Gérer les monstres de façon plus ou moins efficace (en fonction de la difficulté / MCTS)