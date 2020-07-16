# Restful web service

## Description
Create Restful web service in Json. The endpoints includs "add item" and "get all items". Using design pattern Factory, DAO, Singleton and DTO.

## How to run  
- Import project as maven project. 
- Install tomcat.
- Right click project, Run as -> "Run on server".
- Open browser, go to http://localhost:8080/JAXRSJsonExample/ see "Hello World!"
 
## End points
- get all item:  http://localhost:8080/JAXRSJsonExample/rest/items
- add an item:  http://localhost:8080/JAXRSJsonExample/rest/items/addItems?name=cup&price=5.3
