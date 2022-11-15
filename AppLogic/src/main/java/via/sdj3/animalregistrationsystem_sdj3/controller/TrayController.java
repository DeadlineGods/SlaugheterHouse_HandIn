package via.sdj3.animalregistrationsystem_sdj3.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationsystem_sdj3.model.Tray;
import via.sdj3.animalregistrationsystem_sdj3.service.tray.TrayService;
import via.sdj3.animalregistrationsystem_sdj3.service.tray.TrayServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class TrayController {

    private Logger logger = LoggerFactory.getLogger(TrayController.class);
    private TrayService trayService;
    public TrayController(TrayService trayService) {
        this.trayService = trayService;
    }
    @PostMapping("/trays")
    public ResponseEntity<Object> createTray(@RequestBody Tray tray){
        try {
            Tray createdTray = trayService.create(tray);
            return new ResponseEntity<Object>(createdTray, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/trays")
    public ResponseEntity<Object> getAllOrders(){
        try {
            Iterable<Tray> trays = trayService.findAllItr();
            return new ResponseEntity<Object>(trays, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    //@GetMapping("/orders/{id}")  // can include MediaType as well
    @GetMapping(value="/trays/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getOrderById(@PathVariable("id") Long id){
        try {
            Optional<Tray> tray = trayService.findById(id);
            if (tray.isPresent()) {
                return new ResponseEntity<Object>(tray.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/trays/{id}")
    public ResponseEntity<Object> updateOrder(@PathVariable Long id, @RequestBody Tray tray){
        try {
            tray.setTrayId(id);
            Tray savedTray = trayService.update(tray);
            return new ResponseEntity<Object>(savedTray, HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/trays/{id}")
    public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("id") Long id){
        try {
            trayService.deleteById(id);
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
        }
    }
}