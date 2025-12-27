package org.example.app.controller;

import org.example.app.model.User;
import org.example.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService= new UserService();

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
     }
   @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
    //    if(!userDB.containsKey(user.getId())) {
    //       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    //    }
    //    userDB.put(user.getId(),user);
         User updated= userService.updateUser(user);
         if (updated ==null){
             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
    //    if(!userDB.containsKey(id)){
      //      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
     //   }
      //  userDB.remove(id);
        // return ResponseEntity.ok("User Deleted");

       // return "User Deleted";
        boolean isDeleted =userService.deleteUser(id);
        if(!isDeleted){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        return ResponseEntity.noContent().build();

    }

    //@GetMapping({"/users","/user/{id}"})
    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
    // /user/100
    @GetMapping("/{userid}")
    public ResponseEntity<User> getUser(@PathVariable(value="userId",required =false) int id){
     //   if(!userDB.containsKey(id)) {
     //       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
     //   }
        User user= userService.getUserById(id);
        if(user == null) {
                   return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
               }
        return ResponseEntity.ok(user);
    }
//    @GetMapping("/{userId}/orders/{orderId}")
//    public ResponseEntity<User> getUser(@PathVariable("userId") int id ,@PathVariable int orderId){
 //     System.out.println("Order id:" + orderId);
  //      if(!userDB.containsKey(id)) {
  //          return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  //      }
  //      return ResponseEntity.ok(userDB.get(id));
  //  }

    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam(required=false,defaultValue="alice") String name){

        return ResponseEntity.ok(userService.searchUsers(name);
    }

    @GetMapping("/info/{id}")
    public String getInfo(
            @PathVariable int id,
            @RequestParam String name,
            @RequestHeader("User-Agent") String userAgent){
        return "User Agent:" + userAgent
                + ":" + id
                + ":" +name;
    }

}
