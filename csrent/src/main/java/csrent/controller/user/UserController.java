package csrent.controller.user;


import csrent.model.user.User;
import csrent.repository.genericCRUD.CRUDMemory;
import csrent.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    UserService service;
    CRUDMemory memory;

    @GetMapping
    public ArrayList<User> getAll(){
        return service.getAll();
    }

    @PostMapping
    public User postUser(@RequestBody User user){
        return service.add(user);
    }

    @PutMapping
    public User putUser(@RequestBody User user){
        return service.update(user);
    }

    @PatchMapping
    public User patchUser(@RequestBody User user){
        return service.edit(user);
    }

    @DeleteMapping ("{id}")
    public User deleteUser (@PathVariable int id){
        return service.delete(id);
    }

    @GetMapping ("{id}")
    public User getUser (@PathVariable int id){
        return service.search(id);
    }



}
