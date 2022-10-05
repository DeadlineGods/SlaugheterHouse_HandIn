package via.sdj3.animalregistrationsystem_sdj3.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/parts",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Part addPart(@RequestBody Part newPart) {
        return partService.create(newPart);
    }

    @RequestMapping(value = "/part/{partNo}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public Part part(@PathVariable int partNo) {
        return partService.read(partNo);
    }

    @RequestMapping(value = "/parts}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ResponseBody
    public List<Part> part() {
        return partService.readAll();
    }
}
