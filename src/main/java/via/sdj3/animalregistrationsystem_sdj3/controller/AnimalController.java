package via.sdj3.animalregistrationsystem_sdj3.controller;


import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationsystem_sdj3.model.Animal;
import via.sdj3.animalregistrationsystem_sdj3.service.animal.AnimalService;
import via.sdj3.animalregistrationsystem_sdj3.service.animal.AnimalServiceImpl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class AnimalController {

    private Logger logger = LoggerFactory.getLogger(AnimalController.class);
    private AnimalService animalService;

    public AnimalController(AnimalService animalService)
    {
        this.animalService = animalService;
    }

    @ExceptionHandler({ Exception.class})
    @PostMapping("/animals")
    public ResponseEntity<Object> createAnimal(@RequestBody Animal animal)
    {
        try
        {
            Animal createdAnimal = animalService.create(animal);
            return new ResponseEntity<>(createdAnimal, HttpStatus.OK);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage(),e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/animals")
    public ResponseEntity<Object> getAllAnimals()
    {
        try {
            Iterable<Animal> animals = animalService.findAllItr();
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/animals/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAnimalById(@PathVariable("id") Long id)
    {
        try{
            Optional<Animal> animal = animalService.findByID(id);
            if(animal.isPresent()){
                return new ResponseEntity<>(animal.get(),HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception ex) {
            logger.error(ex.getMessage(),ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals/search/{dateOfArriving}")
    public ResponseEntity<Object> getAnimalsArrivedOn(@PathVariable("dateOfArriving") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateOfArriving)
    {
        try
        {
            List<Animal> animals = animalService.findByDate(dateOfArriving);
            return new ResponseEntity<>(animals, HttpStatus.OK);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
