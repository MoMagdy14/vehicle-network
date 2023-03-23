# vehicle-network
### To perform POST request

```
POST http://\<IP\>:8080/vehicle/network  
Content-Type: application/json  

{  
  "plateNumber": "SOME_PLATENUMBER",   
  "ssid": "SOME_SSID",  
  "password": "SOME_PASSWORD"  
}
```
### To perform GET request
```
GET http://<IP>:8080/vehicle/\<plateNumber\>/network  
```
Replace \<plateNumber\> with a registered plate number.  
Replace \<IP\> with a server IP.
