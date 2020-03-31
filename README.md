# config-server-example
Steps to test this application:
Hit http://localhost:8080/student 
Response:
 
Now update your student-service-dev.properties
student-service-dev.properties
student.records=100

Commit your file and push it to repository.
Now before hitting the service again we must refresh it.
Hit below url with postman
http://localhost:8080/actuator/refresh
Method: POST
It will refresh your properties in application.
 
As above response states that “student.records” is updated.
Again hit http://localhost:8080/student
Updated response without restarting student-service.
 


