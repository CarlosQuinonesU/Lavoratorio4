package csrent.service.space;

import csrent.model.space.Space;
import csrent.repository.space.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SpaceService {
    @Autowired
    SpaceRepository repository;

    public ArrayList<Space> getAll(){return repository.getAll();}
    public Space add (Space space){return repository.add(space);}
    public Space update (Space space){return repository.update(space);}
    public Space edit (Space space){return repository.edit(space);}
    public Space delete (Integer id){return repository.delete(id);}
    public Space search (Integer id){return repository.search(id);}

}
