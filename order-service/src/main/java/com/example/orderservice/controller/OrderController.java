package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import com.example.orderservice.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/orders", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "Add order")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Order> save(@RequestBody  Order order){
        return ResponseEntity.ok(orderService.save(order));
    }

    @ApiOperation(value = "Get specific order")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(orderService.findById(id));
    }

    @ApiOperation(value = "Get all order")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Order>> findAll(){
        return ResponseEntity.ok().body(orderService.findAll());
    }

    @ApiOperation(value = "Delete order")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        orderService.delete(id);
        return ResponseEntity.ok().build();
    }
}
