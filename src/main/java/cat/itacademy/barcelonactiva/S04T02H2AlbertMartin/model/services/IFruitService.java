package cat.itacademy.barcelonactiva.S04T02H2AlbertMartin.model.services;

import java.util.List;
import java.util.Optional;
import cat.itacademy.barcelonactiva.S04T02H2AlbertMartin.model.domain.Fruit;

public interface IFruitService {
	
    Fruit addFruit(Fruit fruit);

    Fruit updateFruitById(Long id, Fruit fruitToUpdate);

    Boolean deleteFruit(Long id);

    Optional<Fruit> getFruit(Long id);

    List<Fruit> getAllFruits();

}
