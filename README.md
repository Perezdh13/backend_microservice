Este es un proyecto con una estructura de microservicios para un ecommerce que contará con 3 API REST para manejar los productos, los pedidos y un sistema de clientes con un inicio de sesión de usuario autenticado por token. En este proyecto se usará Java con Spring Boot y algunas dependencias como:

  - Spring Cloud Config
  - Spring Cloud Netflix
  - Spring Cloud Gateway

La estructura del proyecto es la siguiente:

- proyecto
  - core
    - api-gateway
      - ...archivos relacionados con el API Gateway...
    - config-server
      - ...archivos relacionados con el Config Server...
    - discovery-services
      - ...archivos relacionados con Eureka Server...
  - apis
    - products-microservices
      - ...archivos relacionados con el microservicio de productos...
    - client-microservices
      - ...archivos relacionados con el microservicio de clientes...


A su vez, en este enlace https://github.com/Perezdh13/service-configuration encontraréis un segundo repositorio encargado de guardar la información utilizada por Config Server.

Este es un proyecto en desarrollo. Tanto este archivo README.md como los archivos que se encuentran en las diferentes carpetas irán sufriendo distintas modificaciones a medida que el proyecto avance.


   <img style="display: flex-wrap" align="center"  height="24" width="auto" alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
<img style="display: flex-wrap" align="center"  height="24" width="auto" alt="Spring" src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>

 
