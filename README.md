# Amazing Translator
this local API allows you to know the translation of an integer between 1 and 30 in English,
French and German.


## How to use
This API currently supports the English, French and German languages.
It uses the ISO code (case-insensitive):
- ``/{language}``

This endpoint takes as parameter the number whose translation we want to know.

### sample requests
- we want to know the translation of 8 in French :  
  ``http://localhost:8080/FR?number=8``
- we want to know the translation of 5 in German :  
  ``http://localhost:8080/De?number=5``
- we want to know the translation of 14 in English :  
  ``http://localhost:8080/en?number=14``