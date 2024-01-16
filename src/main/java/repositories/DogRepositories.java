package repositories;

import model.Dog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepositories extends JpaRepository<Dog,Long> {

    @Query("select s "+
            "from Dog s " +
            "where (s.name is null or upper(s.name) like upper(concat('%',:name,'%')) )" +
            "or (s.style is null or upper(s.style) like upper(concat('%',:address,'%')) )"+
            "or (s.color is null or upper(s.color) like upper(concat('%',:classStudent,'%')) )"+
            "or (s.age is null or s.age = :age )"


    )
    List <Dog>getDogList(@Param("name")String name, @Param("style") String style, @Param("color") String color, @Param("age") Integer age, Pageable pageable);


}
