# Taxi Service
![drawing](https://cdn2.civitatis.com/rusia/moscu/guia/taxi.jpg)
## This is a web-app with a huge helpful functionality.
With this app, you can create drivers, cars and its manufacturers, and manage them farther on.

In that app, driver performed as user.
To run the program you will need to register, or log in directly if you already have account(registered driver), using login and password.
> WE HAVE SUCH FUNCTIONAL  :
>- Display All Your Cars
>- Display All Drivers
>- Display All Cars
>- Display All Manufacturers
>- Create new Driver
>- Create new Car
>- Create new Manufacturer
>- Add Driver to Car

## Implementation details and technologies

### Project based on 3-layer architecture:
>- Presentation layer (controllers)
>- Application layer (services)
>- Data access layer (DAO)

### Програма працює на принципах SOLID
>- Implemented injector, which initialize fields using reflection mechanism
>- Also, there are 3 additional annotations: @Dao, @Service, @Injector
### Technologies
>- Apache Tomcat
>- Servlet
>- JDBC
>- MySQL
>- JSTL
>- HTML, CSS
>- JSP
>- Maven
>- Maven Checkstyle Plugin
>- Log4j

### Diagram DB
![drawing](http://dl4.joxi.net/drive/2021/12/15/0052/3292/3415260/60/d0a17800e8.jpg)

## Setup
>1. Configure Apache Tomcat(V - 9.0.55)
>2. Install MySQL(V - 8.0)
>3. Create a schema and all the necessary tables by using the script from resources/init_db.sql in terminal or connect to DB and RUN this file
>4. In the /util/ConnectionUtil.java class change the "user" and "password" properties to the ones you specified when installing MySQL
>5. In the src/main/resources/log4j2.xml at line File name = "File" fileName = "logs\app.log" you need to change "logs\app.log" with absolute path to .log file)
>6. Start the application
