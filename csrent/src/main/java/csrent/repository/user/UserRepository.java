package csrent.repository.user;

import csrent.model.user.User;
import csrent.repository.genericCRUD.CRUDMemory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends CRUDMemory<User> {

     public UserRepository(){
         data.add(new User( 1,"Carlos Quiñones","",""));
         data.add(new User( 2,"Roberto Ugalde","",""));
         data.add(new User( 3,"Carlos Quiñones","",""));
         data.add(new User( 4,"Carlos Quiñones","",""));
     }

    @Override
    public User edit(User user) {
         for (User element :data){
             if (element.getId().intValue()==user.getId().intValue()) {
                 if (user.getName() != null) {
                     element.setName(user.getName());
                 }
                 if (user.getAddress()!=null){
                     element.setAddress(user.getAddress());
                 }
                 if (user.getType()!=null){
                     element.setType(user.getType());
                 }
                 return element;
             }
         }
        return new User();
    }
}// Fin de clase
