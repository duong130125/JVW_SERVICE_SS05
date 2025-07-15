package ra.session_05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.session_05.entity.Fruit;
import ra.session_05.repository.FruitRepository;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fruit not found with id: " + id));
    }

    public Fruit createFruit(Fruit fruit) {
        fruit.setCreatedAt(java.time.LocalDate.now());
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Long id, Fruit fruitDetails) {
        Fruit fruit = getFruitById(id);
        fruit.setName(fruitDetails.getName());
        fruit.setPrice(fruitDetails.getPrice());
        fruit.setStock(fruitDetails.getStock());
        fruit.setStatus(fruitDetails.getStatus());
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(Long id) {
        if (!fruitRepository.existsById(id)) {
            throw new RuntimeException("Fruit not found with id: " + id);
        }
        fruitRepository.deleteById(id);
    }
}