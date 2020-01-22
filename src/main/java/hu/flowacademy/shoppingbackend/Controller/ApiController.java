package hu.flowacademy.shoppingbackend.Controller;

import hu.flowacademy.shoppingbackend.Model.Item;
import hu.flowacademy.shoppingbackend.Model.User;
import hu.flowacademy.shoppingbackend.UserRepository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Calendar;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    ItemRepository itemRepository;



    @RequestMapping(method= RequestMethod.POST,value="/insertItem",produces="application/json")
    public Object addItem(Principal principal, @RequestParam("item") String item) {
        itemRepository.save(new Item(item,principal.getName()));

        return "{\"Message\":\"Success\"}";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getItems",produces = "application/json")
    public List<Item> getItems(Principal principal) {
    return itemRepository.getItemsByHolderName(principal.getName());
    }



}
