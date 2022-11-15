package cat.itacademy.barcelonactiva.S04T02H2AlbertMartin.model.repository;

import cat.itacademy.barcelonactiva.S04T02H2AlbertMartin.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository <Fruit, Long> {

}
