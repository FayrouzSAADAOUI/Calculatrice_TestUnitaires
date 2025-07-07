# Compteur de Clics Java

Ce projet est une application Java simple avec une interface graphique (Swing) qui permet d'incrémenter un compteur à chaque clic sur un bouton, et de le remettre à zéro avec un bouton "Reset". Il inclut aussi des tests unitaires pour la logique du compteur.

## Fichiers principaux
- `Compteur.java` : la classe qui gère le compteur (logique métier)
- `Main.java` : l'interface graphique qui utilise la classe `Compteur`
- `CompteurTest.java` : tests unitaires JUnit pour la classe `Compteur`

## Prérequis
- Java JDK 8 ou supérieur
- JUnit 5 (pour les tests unitaires)

## Compilation et exécution de l'application graphique
1. Compile les fichiers :
   ```sh
   javac Compteur.java Main.java
   ```
2. Lance l'application :
   ```sh
   java Main
   ```

## Exécution des tests unitaires avec JUnit 5

### 1. Télécharger JUnit 5
- Va sur https://junit.org/junit5/
- Télécharge le JAR "JUnit Platform Console Standalone" (ou les JARs nécessaires listés ci-dessous) :
  - `junit-jupiter-api-5.x.x.jar`
  - `junit-jupiter-engine-5.x.x.jar`
  - `apiguardian-api-1.x.x.jar`
  - `opentest4j-1.x.x.jar`
  - `junit-platform-commons-1.x.x.jar`
- Place-les dans un dossier `lib/` à la racine du projet.

### 2. Compiler avec les dépendances JUnit
Sous Windows :
```sh
javac -cp .;lib\* Compteur.java CompteurTest.java
```
Sous Linux/Mac :
```sh
javac -cp .:lib/* Compteur.java CompteurTest.java
```

### 3. Exécuter les tests
Sous Windows :
```sh
java -jar lib\junit-platform-console-standalone-1.x.x.jar --class-path . --scan-class-path
```
Sous Linux/Mac :
```sh
java -jar lib/junit-platform-console-standalone-1.x.x.jar --class-path . --scan-class-path
```

### 4. Avec un IDE
- Ouvre le projet dans Eclipse, IntelliJ ou VSCode.
- Clique droit sur `CompteurTest.java` > "Run as JUnit Test".

---

## Exemple de tests unitaires (CompteurTest.java)
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteurTest {
    @Test
    void testInitialValue() {
        Compteur compteur = new Compteur();
        assertEquals(0, compteur.getCount());
    }
    @Test
    void testIncrement() {
        Compteur compteur = new Compteur();
        compteur.increment();
        assertEquals(1, compteur.getCount());
    }
    @Test
    void testReset() {
        Compteur compteur = new Compteur();
        compteur.increment();
        compteur.reset();
        assertEquals(0, compteur.getCount());
    }
}
```

---

## Auteur
Projet réalisé pour l'apprentissage des tests unitaires et de la programmation Java avec interface graphique.
