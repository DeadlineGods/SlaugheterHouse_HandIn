package via.sdj3.animalregistrationsystem_sdj3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.model.Part;
import via.sdj3.animalregistrationsystem_sdj3.service.part.PartService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PartController {
    private PartService partService;
    private Logger logger = LoggerFactory.getLogger(PartController.class);

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping("/parts")
    public ResponseEntity<Object> addPart(@RequestBody Part newPart) {
        try
        {
            Part createdPart = partService.create(newPart);
            return new ResponseEntity<>(createdPart, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/parts")
    public ResponseEntity<Object> getAllParts()
    {
        try {
            Iterable<Part> parts = partService.findAll();
            return new ResponseEntity<>(parts, HttpStatus.OK);
        } catch (Exception ex) {
            System.out.println(ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/parts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPartById(@PathVariable("id") int id)
    {
        try
        {
            Optional<Part> part = partService.findById(id);
            if(part.isPresent())
            {
                return new ResponseEntity<>(part.get(), HttpStatus.OK);
            }
            else
            {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

}
