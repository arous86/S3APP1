# S3APP1 : MenuFact02

# Fonctions principales
- Maintenir à jour les plats
- Confection des factures
- Transactions à la caisse


# Étapes à suivre
- Préparer le nouveau Diagramme de Classes avec Modèles de Conception.
Note: Suivre les contraintes de l'Annexe A du guide.

- Préparer l'ensemble des Tests Unitaires.

- Développer la nouvelle itération (MenuFact02).

- Préparer le rapport
Note: Questions à répondre à la page 5 du guide.


# Modèles de Conception à intégrés
- Singleton
- Factory
- Observer
- State
- MVC
- Flyweight
- 2 autres au choix

# Catalogue des Modèles de Conception
https://refactoring.guru/design-patterns/catalog
https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm

# Description des différents Modèles de Conception
Singleton:
Il est adéquat d'utiliser le Singleton lorsqu'on souhaite n'avoir
qu'une seule instance d'une classe. Par exemple, si on souhaite
intégrer une base de données à notre programme, il devrait être
interdit de créer plusieurs instances différentes. Le Singleton
règle ce problème en limitant la classe à une seule instance.

Factory:
Ce Modèle est utile pour plusieurs cas de conception. Il peut être
utilisé lorsqu'on ne connait pas davance le type d'objet avec
lequel on va travailler. Il permet de créer une librairie ou cadre
d'objet facilement extensible. Enfin, il permet de réutiliser du
code déjà existant.

Observer:
Ce Modèle est utile lorsqu'un changement d'état d'un objet doit
changer celui d'un autre objet, ou les notifier du changement.
Par exemple, si le programme possède une classe Magazine et une
classe Lecteur, la classe Magazine peut détenir une liste
d'abonnées, afin d'envoyer ses revues aux bons clients.

State:
Il est intéressant d'utiliser ce Modèle dans plusieurs cas.
D'abord, lorsqu'un objet peut avoir beaucoup d'états possibles.
Ensuite, lorsqu'une classe possède une grande quantité de
conditionnels qui rendent le code difficile à maintenir.

MVC:
Le Modèle de Conception MVC (Modèle-Vue-Contrôleur) permet de
séparer le programme en trois parties afin de séparer la logique
de l'interface. Plus précisément, pour une structure MVC, la
classe Modèle possède les données, la classe Vue affiche
l'interface selon les données contenues dans le Modèle et la
classe Contrôleur met à jour la classe Vue, lorsqu'il y a un
changement dans la classe Modèle.

Flyweight:

