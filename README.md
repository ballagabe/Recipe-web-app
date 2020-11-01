Food diary web app
Fejlesztők:
-Wei Zsófia
-Fejér Norbert Sándor
-Balla Gábor
-Kovács Kristóf Balázs

Az alkalmazás specifikációja:  
-A weboldal egy recept gyűjtő lenne, ahol a felhasználók megtudják osztani a saját receptjeiket és ezeket a recepteket mások tudják     véleményezni és elmenteni maguknak a saját gyűjteményükbe, a weboldal használatához nem kötelező a regisztráció.

A weboldal ezeket a funkciókat valósítja meg: 
-Login képernyő: felhasználónak az webalkalmazás használatához be kell jelentkeznie, felhasználó név, jelszó szükséges 

-Regisztrációs képernyő: felhasználónak az webalkalmazás használatához regisztrálnia kell, email, név, születési dátum, jelszó szükséges 

-Kezdőképernyő (bejelentkezés után): Egy véletlenszerű recept (ezt gomb segítségével újra lehet generálni)  Alatta pedig pár népszerű (felhasználók által értékelt) receptek listája található 

-Saját recept létrehozása képernyő: Létrehozhatunk egy saját receptet ahol megtudjuk adni a recept nevét, hozzávalók listáját, elkészítés leírását hozzá tudjuk adni, képet tudunk hozzácsatolni, étel típusának megadása 

-Saját receptjeim képernyő: Kilistázza a felhasználó saját receptjeit, tudja módosítani, törölni őket 

-Mentett recept képernyő: Kilistázza a felhasználó által elmentett recepteket, eltudja távolítani őket 

-Profil képernyő: A felhasználó tudja módosítani az adatait 

Az alkalmazás frontend terve:
https://weizsofi.wixsite.com/mysite

Entities:
    User:
        -id
        -email
        -name
        -birthday
        -password
    Recipe:
        -id
        -userId
        -name
        -ingredients
        -subscription
        -img
        -type (enum)
    SavedRecipes:
        -userId 1
        -recipeId 123


Alkalmazás fő osztályai:
    App osztály:
        metódusai:
            -App(RecipeSerivce, View)

    RecipeService osztály:
        metódusai:
            -makeRecipe(Recipe newRecipe)
            -deleteRecipe(id)
            -findOneRecipe()
            -findOneRecipe(userId)
            -findAllRecipe()
            -findAllRecipe(userId)
            -modifyRecipe(recipeId)
    
    View osztály:
        metódusai:
            -printAllRecipes(count)
            -printAllRecipes(userId)
            -printAllRecipes(type)
            -printOneRecipe(recipeId)
