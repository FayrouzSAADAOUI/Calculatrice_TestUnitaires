# Projet Compteur de Clics en Java

---

## Auteur

Fayrouz Saadaoui

---

## Prérequis

- Java JDK 8 ou supérieur  
- JUnit 5 (téléchargeable sur [https://junit.org/junit5/](https://junit.org/junit5/))  
- Les fichiers JAR de JUnit doivent être placés dans un dossier `lib/` à la racine du projet.

---

## Tests unitaires avec JUnit

Le projet contient un fichier de test `CompteurTest.java` qui teste la classe `Compteur` avec JUnit (framework standard en Java).  

Les tests vérifient :  
- `testInitialValue` : que le compteur commence à 0  
- `testIncrement` : que l’incrémentation fonctionne  
- `testReset` : que le reset remet bien le compteur à 0  

### Compiler les classes et tests
Pour compiler : 
javac -cp ".;lib/*" Compteur.java CompteurTest.java
Pour tester : 
java -jar lib\junit-platform-console-standalone-1.10.0.jar --class-path . --scan-class-path
