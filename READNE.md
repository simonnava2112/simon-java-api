en un servicio backend hay tres capa.
1- service (esta es la capa de negocio, hace tranformaciones y llamada a otros servicios para completar toda la logica de negocio)
2- controller (esto es interaccion con el front-end es la request que recibe )
3- persistencia ( esta es para interaccion con la base de datos )


1- packages

-controller
-entitis 
-modelos (donde estan las clases que se van a manipular)


## Configurar el ambiente
levanatar la BD con docker
```bash
docker run --name postgresql -e POSTGRES_PASSWORD=rootpass -v my_dbdata:/var/lib/postgresql/data -p 5432:5432 -d postgres:13
```


URL:jdbc:postgresql://localhost:5432/
user:postgres
password:rootpass

// el usuari de postgress es "postgres"
