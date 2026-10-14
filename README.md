# client-microservice

Microservicio de **gestión de clientes** de Wipay.

Permite crear, consultar y modificar clientes, y saber qué merchants pertenecen a cada cliente. Forma parte de un sistema de dos microservicios junto a [merchant-microservice](https://github.com/tareas-practicas-wipay/merchant-microservice).

## Stack

- Java: 21
- Spring Boot: 4.1.1
- Maven: Wrapper incluido (`mvnw`)
- Lombok: Gestionado por Spring Boot
- MapStruct: 1.6.3
- DynamoDB: AWS SDK v2 (Enhanced Client) 2.55.16
- Swagger / OpenAPI: _Pendiente_ (springdoc-openapi)

## Requisitos previos

- JDK 21
- Docker Desktop y la infraestructura local levantada: ver [infraestructure](https://github.com/tareas-practicas-wipay/infraestructure)

## Arranque

El servicio arranca en **http://localhost:8081**.

## Modelo de datos

Todas las entidades extienden de `MainTable` (diseño de tabla única en DynamoDB).

| Entidad | Atributos |
|---|---|
| `MainTable` | `PK`, `SK`, `id`, `status`, `gIndex2Pk`, `createdDate` |
| `Client` | `name`, `surname`, `nif`, `phone`, `email` |

## Estructura del proyecto

```
src/main/java/com/wipay/client
├── controller   → Controladores REST
├── service      → Interfaces e implementaciones de la lógica de negocio
├── model        → Modelos generales, de entrada y de salida
├── repository   → Acceso a DynamoDB
└── mappers      → Mappers de MapStruct
```

## Seguimiento del estado del proyecto

- [x] Creación del microservicio
