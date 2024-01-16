package service.imp;

import input.DogDataInput;
import model.Dog;
import output.DogDataOutput;
import repositories.DogRepositories;
import service.DogService;

import java.util.List;

public class DogServiceImpl implements DogService {
    private final DogRepositories dogRepositories;

    public DogServiceImpl(DogRepositories dogRepositories) {
        this.dogRepositories = dogRepositories;
    }

    @Override
    public DogDataOutput createDog(DogDataInput dogDataInput) {

        return null;
    }

    @Override
    public List getDogList(DogDataInput dogDataInput) {
        return null;
    }
}
