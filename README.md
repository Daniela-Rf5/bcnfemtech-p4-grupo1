#Legacy games
 
###Arrancando el proyecto

antes de poder lanzar el servidor necesitamos arrancar la base de datos:
``` 
docker run --name games-container -e POSTGRES_PASSWORD=mysecretpassword -p 5460:5460 -e POSTGRES_USER=default -d postgres
```