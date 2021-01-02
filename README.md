# microServicios

# ¿Qué encontraras aquí?
Ejemplo de Microservicios basados en Spring Boot y Spring Cloud Netflix Eureka

donde he creado una Aplicación compuesta de microservicios:
-  para validar la comunicación en API Rest
- disponible para varias instancias

# Instalación
# Construcción basada en la metodología Open Source
1. JDK (Java SE Development Kit)
- opción 1. Oracle JDK LTS (solo usuarios con permisos administración)

URL = https://www.oracle.com/java/technologies/javase-downloads.html
- opción 2. Open JDK (disponible para todos los usuarios)

URL = https://openjdk.java.net/    = recomiendo utilizar versión 11 en adelante 
- Comprobaciones:

configurar JAVA_HOME y Path

terminal ==> java -version

terminal ==> javac -version


2. Spring Tool IDE (Eclipse) 
- opción 1. STS4 - Spring Tool Suite 4.9.0 

URL = https://spring.io/tools
- opción 2. VSC - Visual Studio Code
aniadir Spring Boot Extension Pack

url = https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack
- Comprobaciones:

menu Windows >> preferences >> Java >> Installed JREs
tener definido el JDK

menu Windows >> preferences >> Maven >> Installatiosn
tener seleccionado EMBEDDED

3. Base de Datos
    - H2: utilizada para microservicio springboot-servicio-producto

		base de datos en memoria
    - MySQL
    - PostgradeSQL

4. Comprobaciones APIs
- Postman
- Newman
