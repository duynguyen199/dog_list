package mappers;


import input.DogDataInput;
import model.Dog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import output.DogDataOutput;

@Mapper(componentModel = "spring")
public interface DogMapper {
    @Mapping({
            @Mapping(target = "name",source = "dogDataInput.name"),
            @Mapping(target = "style",source = "dogDataInput.style"),
            @Mapping(target = "color",source = "dogDataInput.color"),
            @Mapping(target = "age",source = "dogDataInput.age"),
            @Mapping(target = "id",source = "id")


    })
    Dog toDog(DogDataInput dogDataInput,Long id);

    @Mapping({
            @Mapping(target = "name",source = "name"),
            @Mapping(target = "style",source = "style"),
            @Mapping(target = "color",source = "color"),
            @Mapping(target = "age",source = "age"),

    })
    DogDataOutput toDogDataOutput(Dog dog);
}
