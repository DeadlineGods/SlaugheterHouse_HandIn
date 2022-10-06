package via.sdj3.animalregistrationsystem_sdj3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.service.part.PartService;

import java.util.List;

@RestController
@RequestMapping("/")
public class PartController {
    private PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping("/parts")
    public Part addPart(@RequestBody Part newPart) {
        return partService.create(newPart);
    }

    @GetMapping("/parts")
    public ResponseEntity<Object> getAllParts()
    {
        try {
            Iterable<Part> parts = partService.readAll();
            return new ResponseEntity<>(parts, HttpStatus.OK);
        } catch (Exception ex) {
            System.out.println(ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
