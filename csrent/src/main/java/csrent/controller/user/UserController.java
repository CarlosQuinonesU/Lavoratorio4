package csrent.controller.user;


import csrent.model.user.User;
import csrent.repository.genericCRUD.CRUDMemory;
import csrent.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    UserService service;
    CRUDMemory memory;

    @GetMapping
    public List<User> getAll(){
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
    public User deleteUser (@PathVariable Integer id){
        return service.delete(id);
    }

    @GetMapping ("{id}")
    public Optional<User> getUser (@PathVariable Integer id){
        return service.search(id);
    }



}
