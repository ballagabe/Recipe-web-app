![picture](https://www.creativefabrica.com/wp-content/uploads/2018/10/Chef-Food-logo-by-DEEMKA-STUDIO-580x406.jpg)

### Food diary
Fejlesztők:
  - Wei Zsófia
  - Balla Gábor

### Az alkalmazás specifikációja:  
  - A weboldal egy recept gyűjtő lenne, ahol a felhasználók megtudják osztani a saját receptjeiket és ezeket a recepteket mások tudják véleményezni és elmenteni maguknak a saját gyűjteményükbe.

  - A weboldal ezeket a funkciókat valósítja meg: 
     - Login képernyő: felhasználónak az webalkalmazás használatához be kell jelentkeznie, felhasználó név, jelszó szükséges 
     - Regisztrációs képernyő: felhasználónak az webalkalmazás használatához regisztrálnia kell, email, név, születési dátum, jelszó szükséges 
     - Kezdőképernyő (bejelentkezés után): Egy véletlenszerű recept (ezt gomb segítségével újra lehet generálni)  Alatta pedig pár recept található különböző kategóriákból
    - Saját recept létrehozása képernyő: Létrehozhatunk egy saját receptet ahol megtudjuk adni a recept nevét, hozzávalók listáját, elkészítés leírását hozzá tudjuk adni, étel típusának megadása 
    - Saját receptjeim képernyő: Kilistázza a felhasználó saját receptjeit, tudja módosítani, törölni őket 
    - Mentett recept képernyő: Kilistázza a felhasználó által elmentett recepteket, eltudja távolítani őket 
    - Profil képernyő: A felhasználó tudja módosítani az adatait 

### Az alkalmazás frontend terve:
https://weizsofi.wixsite.com/mysite

### Entities:
    User:
        - id
        - email
        - name
        - birthday
        - password
    Recipe:
        - id
        - userId
        - name
        - ingredients
        - subscription
        - type (enum)
    SavedRecipe:
        - id
        - userId
        - recipeId
    Ingredient:
        - id
        - userId
        - name

### Alkalmazás fő osztályai:
    RecipeApplication osztály:
        metódusai:
            - generateTestData()

    application.service package osztályai:
        - CreateIngredient
        - CreateRecipe
        - CreateUser
        - GetRecipes
        - SaveRecipe
