package com.pipe.controller;

import com.pipe.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/users")
public class UserREST {

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String save(){
        System.out.println("User saved");
        return "{'module': 'springmvc REST save'}";
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("User delete: " + id);
        return "{'module': 'springmvc REST delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody UserDao user){
        System.out.println("User update: " + user);
        return "{'module': 'springmvc REST update'}";
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("User getById: " + id);
        return "{'module': 'springmvc REST getById'}";
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String insert(@RequestBody UserDao user){
        System.out.println("User insert: " + user);
        return "{'module': 'springmvc REST insert'}";
    }


}
