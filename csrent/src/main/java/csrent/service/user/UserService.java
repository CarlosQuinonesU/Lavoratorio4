package csrent.service.user;

import csrent.model.user.User;
import csrent.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public ArrayList<User> getAll(){return repository.getAll();}
    public User add (User user){return repository.add(user);}
    public User update (User user){return repository.update(user);}
    public User edit (User user){return repository.edit(user);}
    public User delete(Integer id){return repository.delete(id);}
    public User search(Integer id){return repository.search(id);}
}
