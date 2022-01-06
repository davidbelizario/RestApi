package expertostech.tutorial.rest.api.controller;

import expertostech.tutorial.rest.api.model.UsuarioModel;
import expertostech.tutorial.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

        @Autowired
        private UsuarioRepository repository;

        @GetMapping(path= "/api/usuario")
        public List<UsuarioModel> getAllUsuarios(){

            return (List<UsuarioModel>) repository.findAll();
        }

        @GetMapping(path= "/api/usuario/{codigo}")
        public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
            return repository.findById(codigo)
                    .map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
    }
        @PostMapping(path = "/api/usuario/salvar")
        public UsuarioModel salvar(@RequestBody UsuarioModel usuario){return repository.save(usuario);}

        @DeleteMapping(path = "/api/usuario/deletar/{codigo}")
        public void deletar(@PathVariable("codigo") Integer codigo){

            repository.deleteById(codigo);
        }


}
