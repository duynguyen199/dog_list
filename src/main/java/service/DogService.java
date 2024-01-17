package service;

import input.DogDataInput;
import input.GetListDogDataInput;
import org.springframework.stereotype.Service;
import output.DogDataOutput;

import java.util.List;

@Service
public interface DogService {
      DogDataOutput createDog(DogDataInput dogDataInput);
      List getDogList(GetListDogDataInput listDogDataInput);


}
