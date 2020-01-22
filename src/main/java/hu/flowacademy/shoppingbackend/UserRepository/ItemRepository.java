package hu.flowacademy.shoppingbackend.UserRepository;

import hu.flowacademy.shoppingbackend.Model.Item;
import hu.flowacademy.shoppingbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> { // először entity, aztán id

    public List<Item> getItemsByHolderName(String holderName);

}
