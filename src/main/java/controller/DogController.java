package controller;

import input.DogDataInput;
import input.GetListDogDataInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DogService;

@RestController
@RequestMapping("/api/dog")
public class DogController {
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    private final DogService dogService;

    @PostMapping("/create")
    public ResponseEntity<?> createDog (DogDataInput dogDataInput){
        return ResponseEntity.ok(dogService.createDog(dogDataInput));
    }

    @GetMapping("/list")
    public ResponseEntity<?> listDog(GetListDogDataInput getListDogDataInput){
        return ResponseEntity.ok(dogService.getDogList(getListDogDataInput));

    }
    
    



}
