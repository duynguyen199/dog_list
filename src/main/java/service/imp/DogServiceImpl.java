package service.imp;

import input.DogDataInput;
import input.GetListDogDataInput;
import mappers.DogMapper;
import model.Dog;
import org.springframework.data.domain.PageRequest;
import output.DogDataOutput;
import repositories.DogRepositories;
import service.DogService;

import java.util.ArrayList;
import java.util.List;

public class DogServiceImpl implements DogService {
    private final DogRepositories dogRepositories;

    private final DogMapper dogMapper;

    public DogServiceImpl(DogRepositories dogRepositories, DogMapper dogMapper) {
        this.dogRepositories = dogRepositories;
        this.dogMapper = dogMapper;
    }


    @Override
    public DogDataOutput createDog(DogDataInput dogDataInput) {
        Dog dog= dogMapper.toDog(dogDataInput,null);
        dogRepositories.save(dog);
        return dogMapper.toDogDataOutput(dog);
    }



    @Override
    public List getDogList(GetListDogDataInput listDogDataInput) {
        List<DogDataOutput> dogDataOutputs= new ArrayList<>();
        List<Dog> dogs=dogRepositories.getDogList(listDogDataInput.getName(), listDogDataInput.getStyle(), listDogDataInput.getColor(), listDogDataInput.getAge(), PageRequest.of(listDogDataInput.getPage(),listDogDataInput.getSize()));
        dogDataOutputs.stream().map(dogDataOutput -> new DogDataOutput(dogDataOutput.getName(),dogDataOutput.getStyle(),dogDataOutput.getColor(),dogDataOutput.getAge())).toList();

        return dogDataOutputs;
    }
}
