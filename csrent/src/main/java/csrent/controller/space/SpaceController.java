package csrent.controller.space;

import java.util.ArrayList;
import csrent.model.space.Space;
import csrent.repository.genericCRUD.CRUDMemory;
import csrent.service.space.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/space")
public class SpaceController {

    @Autowired
    SpaceService service;
    CRUDMemory memory;
    //private ArrayList<Space> spaces;


    //public SpaceController(){
        //spaces.add(new Space(1, "Grabación IN",122,"Cabina de grabación"));
        //spaces.add(new Space(2, "TV Group",100,"Estudio de televisión"));
        //spaces.add(new Space(3, "Ballet Vero",50,"Salón de ballet"));
        //spaces.add(new Space(4, "Música Quiñones",50,"Estudio de música"));
   //}



    @GetMapping
    public ArrayList<Space> getAll(){
        return service.getAll();
    }

    //Metodo para agregar un elemento al array
    @PostMapping
    public Space postSpace(@RequestBody Space space){
        return service.add(space);
    }

    // Actualizar un elemento de un arraylist
    @PutMapping
    public Space putSpace(@RequestBody Space space){
        return service.update(space);
    }

    //Metodo que reciba un objeto y verifique cuales atributos traen información
    // solo modifica los atributos que corrresponden
    @PatchMapping
    public Space patchSpace(@RequestBody Space space){
        return service.edit(space);
    }

    //Metodo para eliminar un espacio por id
    @DeleteMapping("/{id}")
    public Space deleteSpace(@PathVariable int  id){
        return service.delete(id);
    }

    // Metodo para retornar una objeto por id
    @GetMapping ("{id}")
    public Space getSpace(@PathVariable int id){
        return service.search(id);
    }












}
