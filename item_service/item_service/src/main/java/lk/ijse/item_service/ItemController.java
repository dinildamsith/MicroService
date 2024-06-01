package lk.ijse.item_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String massage(){
//        return restTemplate.getForObject("http://localhost:8080/api/v1/user", String.class);
        return "Item Worked";
    }


    @PostMapping("/saveItem")
    public Item saveItem(@RequestBody Item item){
        item.setId(item.getId());
        item.setName(item.getName());

        return item;
    }
}
