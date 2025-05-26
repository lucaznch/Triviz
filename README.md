<h1 align="center">Triviz</h1>

<p align="center">
  <a href="#about">About</a> •
  <a href="#technologies">Technologies</a> •
  <a href="#getting-started">Getting Started</a>
</p>

# About

Triviz is an experimental trivia quiz web application built with Spring Boot and Angular. The primary goal of this project is to help me learn and practice full-stack development using these technologies. The project is in its early stages and is still under development.

# Technologies

* [Docker](https://www.docker.com/)
* [Java 21](https://openjdk.org/projects/jdk/21/)
* [Maven](https://maven.apache.org/download.cgi)
* [Postgres 16](https://www.postgresql.org/)
* [Node 21.6](https://nodejs.org/en/) ([Node Version Manager](https://github.com/nvm-sh/nvm) recommended)
* [Angular CLI](https://angular.dev/tools/cli)
* [Spring-boot](https://spring.io/)

# Getting Started

* **Build all services**
```bash
docker compose build
```
* **Start backend and database containers**
```bash
docker compose up -d backend
```
* **Run the frontend Angular development server**
```bash
ng serve
```
* Access the application:
  * Backend: `http://localhost:8080`
  * Frontend: `http://localhost:4200`
