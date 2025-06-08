package csrent.service.user;

import csrent.model.user.User;
import csrent.repository.user.UserJpaRepository;
import csrent.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    //UserRepository repository;
    UserJpaRepository repository;

    public List<User> getAll(){return repository.findAll();}
    public User add (User user){return repository.save(user);}
    public User update (User user){
        Optional<User> existingUser= repository.findById(user.getId());
        if (existingUser.isPresent()){
            User userDB= existingUser.get();
            userDB.setName(user.getName());
            userDB.setType(user.getType());
            userDB.setAddress(user.getAddress());
            return repository.save(userDB);
        }
        return new User();
    }
    public User edit (User user){
        Optional<User> existingUser= repository.findById(user.getId());
        if (existingUser.isPresent()){
            User userDB= existingUser.get();
            if (user.getName()!=null){
                userDB.setName(user.getName());
            }
            if (user.getAddress()!=null){
                userDB.setAddress(user.getAddress());
            }
            if (user.getType()!=null){
                userDB.setType(user.getType());
            }
            return repository.save(userDB);
        }
        return new User();
    }
    public User delete(Integer id){
        Optional<User> existingUser= repository.findById(id);
        if (existingUser.isPresent()){
            User userDB =existingUser.get();
            repository.delete(userDB);
            return userDB;
        }

        return new User();
    }
    public Optional<User> search(Integer id){return repository.findById(id);}
}
