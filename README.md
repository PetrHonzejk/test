[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/9Mh5R4P2)
# Zadání testu 
### Mobilní aplikace pro zobrazení příspěvků a notifikací
Vytvořte mobilní aplikaci, která umožní zobrazování příspěvků z API, práci s notifikacemi a výběr obrázků. K repositáři připojte [.apk soubor exportované aplikace](https://youtu.be/3FujlwQoKuk?si=dDcDr72iD8bOUdkU&t=25)

![Snímek obrazovky](screen.gif)

Poskytnutý výchozí kód obsahuje navigační systém mezi obrazovkami pro API 34. 

### Specifikace jednotlivých obrazovek
#### 1. Loading Screen (Domovská obrazovka)
Implementujte loading screen, který bude obsahovat animovaný text a kolečko načítání

**Bodování:**
-   **1 bod:** Správně implementovaná animace měnící barvu textu.
-   **1 bod:** Správně implementovaný animovaný kruhový indikátor.

#### 2. Posts Screen (Příspěvky z webu)
Pomocí knihovny Retrofit načtěte příspěvky z [webového API JSONPlaceholder](https://jsonplaceholder.typicode.com/) a zobrazte je ve formě karet. K implementaci této obrazovky je třeba přidat do manifestu příslušné oprávnění. 

**API adresa:**

    https://jsonplaceholder.typicode.com/posts
**Struktura dat:**

    {
        "userId": 1,
        "id": 1,
        "title": "sunt aut facere repellat provident",
        "body": "quia et suscipit nsuscipit recusandae consequuntur expedita"
    }


**Bodování:**
-   **1 bod:** Retrofit instance a API rozhraní.
-   **1 bod:** Správná definice datové třídy a oprávnění.
-   **1 bod:** Implementace ViewModelu a správné načítání dat, včetně ošetření situace, kdy zařízení není připojeno k internetu.
-   **1 bod:** Vykreslení příspěvků pomocí karet.

#### 3. Notification Screen (Upozornění)
Implementujte obrazovku, na které se po stisku tlačítka zobrazí po 5 sekundách notifikace. Dejte si pozor na správné ošetření oprávnění pro Android 13+

**Bodování:**
-   **1  bod:** Zobrazení notifikace na telefonu
-   **1  bod:** Funkční naplánování notifikace se správným zpožděním.

#### 4. Image Picker Screen (Výběr obrázku)
Implementujte obrazovku, kde uživatel po stisku tlačítka vybere obrázek z interní paměti telefonu a následně se vybraný obrázek zobrazí na obrazovce.

**Bodování:**

-   **1 bod:** Správná implementace výběru obrázku 
-  **1 bod:**  Zobrazení obrázku na obrazovce.

#### 5. Export aplikace 
Exportujte hotový projekt jako .apk soubor

**Bodování:**
-   **1 bod:** Aplikace je exportována jako .apk.
