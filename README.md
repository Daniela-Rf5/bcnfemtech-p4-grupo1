#Legacy games
 
###Arrancando el proyecto

antes de poder lanzar el servidor necesitamos arrancar la base de datos:
``` 
docker run --name postgres-container -e POSTGRES_PASSWORD=password -p 5433:5432 -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres -d postgres 
```
