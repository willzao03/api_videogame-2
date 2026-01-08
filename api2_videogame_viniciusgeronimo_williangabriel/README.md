Videogame API
---

### Project Description

This is a Spring Boot API for a videogame list.

- It loads a list of videogames from a `videogames.json` file.
- It stores the list in memory.
- It provides API endpoints to get the list or a single item.

---

### API Endpoints

- **GET /api/v1/games/all**
  - Returns a JSON list of all videogames.

- **GET /api/v1/games/id/{id}**
  - Returns a single videogame based on its ID.

---

### How to Run

1.  Make sure you have JDK 21 and Apache Maven installed.
2.  Open a terminal in the project's main folder (where `pom.xml` is).
3.  Run this command:
    ```bash
    mvn spring-boot:run
    ```
4.  The server will run on `http://localhost:8080`.

---

### How to Test

- **To get all games:**
  ```bash
  curl http://localhost:8080/api/v1/games/all

  or open http://localhost:8080/api/v1/games/all in the browser

- **To get a single game:**
  ```bash
  curl http://localhost:8080/api/v1/games/id/[id]

