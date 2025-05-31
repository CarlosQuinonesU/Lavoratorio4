package csrent.repository;

import csrent.model.Space;
import org.springframework.stereotype.Repository;

@Repository
public class SpaceRepository extends CRUDMemory<Space>{

    public SpaceRepository(){
        data.add(new Space(1, "Grabación IN",122,"Cabina de grabación"));
        data.add(new Space(2, "TV Group",100,"Estudio de televisión"));
        data.add(new Space(3, "Ballet Vero",50,"Salón de ballet"));
        data.add(new Space(4, "Música Quiñones",50,"Estudio de música"));
    }


    @Override
    public Space edit(Space space) {

        for (Space element: data){
            if (element.getId().intValue()==space.getId().intValue()){
                if (space.getName()!=null){
                    element.setName(space.getName());
                }
                if (space.getCapacity()!=0) {
                    element.setCapacity(space.getCapacity());
                }
                if (space.getType()!=null){
                    element.setType(space.getType());
                }
                return element;
            }
        }
        return new Space();
    }
}
