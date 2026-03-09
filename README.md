# Reto_LiterAlura
Reto LiterAlura
# Literalura - Biblioteca de Libros

Aplicación de consola desarrollada con Java, Spring Boot y PostgreSQL que permite consultar libros desde una API externa, almacenarlos en una base de datos y realizar consultas sobre los libros y autores registrados.

Este proyecto fue desarrollado como parte del Challenge de Alura Latam / Oracle Next Education.

---

## Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Maven
* PostgreSQL
* API Gutendex
* Hibernate

---

## Funcionalidades

La aplicación funciona mediante un menú interactivo en consola.

### Menú principal

```
1 - Buscar libro por título
2 - Listar libros registrados
3 - Listar autores registrados
4 - Listar autores vivos en un determinado año
5 - Listar libros por idioma
0 - Salir
```

---

## 1 Buscar libro por título

Consulta un libro en la API Gutendex utilizando el título proporcionado por el usuario.

La información obtenida incluye:

* Título
* Autor
* Número de descargas
* Año de nacimiento del autor
* Año de fallecimiento del autor
* Idioma

El libro consultado se guarda automáticamente en la base de datos.

Si el libro o el autor ya existen en la base de datos, no se vuelven a registrar.

---

## 2 Listar libros registrados

Muestra todos los libros almacenados en la base de datos con la siguiente información:

* Título
* Autor
* Idioma
* Número de descargas

---

## 3 Listar autores registrados

Muestra todos los autores guardados en la base de datos junto con:

* Nombre
* Año de nacimiento
* Año de fallecimiento
* Libros asociados

---

## 4 Listar autores vivos en un determinado año

Permite ingresar un año y muestra los autores que estaban vivos durante ese año.

Ejemplo:

```
Ingrese el año:
1800
```

Resultado:

```
Autor: Jane Austen
Nacimiento: 1775
Fallecimiento: 1817
```

---

## 5 Listar libros por idioma

Permite filtrar los libros registrados según su idioma.

Idiomas comunes disponibles en la API:

```
en -> Inglés
es -> Español
fr -> Francés
pt -> Portugués
```

Ejemplo:

```
Ingrese el idioma:
es
```

---

## Base de datos

El proyecto utiliza PostgreSQL.

### Crear la base de datos

```
CREATE DATABASE literalura;
```

---

## Configuración

Editar el archivo:

```
src/main/resources/application.properties
```

Configurar las credenciales de PostgreSQL:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=postgres
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```

---

## Ejecutar el proyecto

Desde la terminal en la carpeta del proyecto:

```
mvn spring-boot:run
```

O ejecutar desde IntelliJ la clase principal:

```
LiteraluraApplication.java
```

---

## Estructura del proyecto

```
literalura
│
├── model
│   ├── Autor.java
│   └── Libro.java
│
├── repository
│   ├── AutorRepository.java
│   └── LibroRepository.java
│
├── service
│   └── ConsumoAPI.java
│
├── principal
│   └── Principal.java
│
└── LiteraluraApplication.java
```

---

## API utilizada

API pública de libros:

https://gutendex.com

Ejemplo de consulta:

```
https://gutendex.com/books/?search=don+quijote
```

---

## Autor

Proyecto desarrollado como parte del programa Oracle Next Education y Alura Latam.

---

## Licencia

Este proyecto se puede utilizar con fines educativos.
