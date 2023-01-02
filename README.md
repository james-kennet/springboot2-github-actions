## springboot2-github-actions service
SpringBoot 2.7 api service with Github Actions

### Prerequisite on running this service:
- At least Java 11
- Install Docker Desktop.

### Tech stack and services.
- H2
- Docker

### Steps in running redis-caching in local.
- Go to the main repo directory.
```bash
cd /springboot2-github-actions
```
- Install/package springboot2-github-actions.
```bash
mvn clean install
```
- Build the image of the service
```bash
docker build -t app .
```
- Run the service
```bash
docker run -p 8080:8080 app
```


### Verifications.
```bash
curl --location --request GET 'http://localhost:8080/app/persons' \
--header 'Content-Type: application/json'
Response:
[
    {
        "id": 1,
        "name": "Mike",
        "gender": "Male",
        "age": 50
    },
    {
        "id": 2,
        "name": "Rachel",
        "gender": "Female",
        "age": 98
    },
    {
        "id": 3,
        "name": "Tristan",
        "gender": "Male",
        "age": 5
    },
    {
        "id": 4,
        "name": "Sheryll",
        "gender": "Female",
        "age": 35
    },
    {
        "id": 5,
        "name": "Timon",
        "gender": "Male",
        "age": 51
    }
]
```