# delivery-microservice

# Token

 POST: http://localhost:9092/oauth/token?grant_type=password&username=admin&password=123456
 
 <p align="center">
  <img src="img-doc/postman-token.png">
</p>
 
 # Order
 
 POST: http://localhost:9093/api/orders
 
 * HEADER
 
 Authorization: Bearer + token (Bearer 357bab22-340c-4c2f-8f90-6c412a51e28d)
 Content-Type: application/json
 
 * BODY
 
 {
  "product": "Apple",
  "price": "1.25"
}

<p align="center">
  <img src="img-doc/post-order-token.png">
</p>

<p align="center">
  <img src="img-doc/post-order-body.png">
</p>




GET: http://localhost:9093/api/orders

 * HEADER
 
 Authorization: Bearer + token (Bearer 357bab22-340c-4c2f-8f90-6c412a51e28d)
 Content-Type: application/json
 
 <p align="center">
  <img src="img-doc/get-order.png">
</p>
 
 # Eureka Server
 
 http://localhost:9091/
 
 <p align="center">
  <img src="img-doc/eureka.png">
</p>
 
 # Config Server
 
 https://github.com/Gabriel-Venancio/delivery-configs
 
 # Swagger
 
 * http://localhost:9092/swagger-ui.html#/auth-controller
  <p align="center">
  <img src="img-doc/auth-controller-swagger.png">
</p>
 * http://localhost:9093/swagger-ui.html#/order-controller
 <p align="center">
  <img src="img-doc/order-controller-swagger.png ">
</p>



