Sample jackson date serializer
==============================

This examples shows how to use a custom serializer/deserializer with Jackson. 

The context is to parse and display credit card expiration dates (MM/yyyy). 

Example request: 

```
{
  "expirationDate": "07/2016"
}
```

Example response: 

```
{
  "authorizedOn": 1442404473294
  "authorizedExpirationDate": "07/2016"
}
```

Note that `authorizedOn` does not have the serializer, so it displays as a timestamp.

**Running the example**

This is an eclipse project. Open it and run the Main.java. Or use maven : `mvn exec:java`.

Server will run on port 8080 by default and you need to send a POST request similar to the above on url *http://localhost:8080/*