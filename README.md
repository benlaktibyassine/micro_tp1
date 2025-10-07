## TP1 – Injection de dépendances (Java)

Projet simple montrant deux façons d’injecter une dépendance `IDao` dans une couche métier `IMetier`:
- Injection par setter: `MetierImpl.setDao(IDao)` (démontrée via réflexion dans `presentation.Presentation2`).
- Injection par constructeur: `new MetierImpl(IDao)` (démontrée dans `presentation.Presentation3`).

### Structure
- `dao` : `IDao`, `DaoImpl`
- `ext` : `DaoImplExt`
- `metier` : `IMetier`, `MetierImpl`
- `presentation` : `Presentation2` (réflexion), `Presentation3` (constructeur)

### Exécuter la démo par réflexion (Presentation2)
1) Éditez `config.txt` avec 2 lignes:
   - Ligne 1: classe DAO (ex: `dao.DaoImpl` ou `ext.DaoImplExt`)
   - Ligne 2: classe métier (ex: `metier.MetierImpl`)
2) Compiler et exécuter:
```bash
javac -d out/production/tp1 -cp src src/presentation/Presentation2.java src/metier/*.java src/dao/*.java src/ext/*.java
java -cp out/production/tp1 presentation.Presentation2
```

### Exécuter la démo par constructeur (Presentation3)
```bash
javac -d out/production/tp1 -cp src src/presentation/Presentation3.java src/metier/*.java src/dao/*.java src/ext/*.java
java -cp out/production/tp1 presentation.Presentation3
```


