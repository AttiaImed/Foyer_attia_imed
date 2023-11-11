package tn.esprit.sprint.foyer_attia_imed.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sprint.foyer_attia_imed.Entites.Etudiant;
import tn.esprit.sprint.foyer_attia_imed.Services.EtudiantService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/get")
    public ResponseEntity<List<Etudiant>> getAllEtudiant(){
        List<Etudiant> e = etudiantService.getAllEtudiants();
        return new  ResponseEntity<List<Etudiant>>(e,HttpStatus.OK);
    }

    @PostMapping(path = "/post",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Etudiant> ajouterEtudiant(@RequestBody Etudiant e){
        Etudiant etudiantAjouter = etudiantService.addEtudiant(e);
        return new ResponseEntity<Etudiant>(etudiantAjouter,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEtudiant(@PathVariable long id){
        etudiantService.removeEtudiant(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/put/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Etudiant> modiferEudiant(@RequestBody Etudiant e,@PathVariable long id){
        Etudiant etudiant = etudiantService.modifyEtudiant(e,id);
        return new ResponseEntity<Etudiant>(etudiant,HttpStatus.ACCEPTED);
    }
}
