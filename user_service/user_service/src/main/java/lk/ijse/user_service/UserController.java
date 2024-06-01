package lk.ijse.user_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String massage(){
        return restTemplate.getForObject("http://item-service/api/v1/item", String.class);
    }

    @PostMapping("/saveItem")
    public Item saveItem(@RequestBody Item item){
        return restTemplate.postForObject("http://item-service/api/v1/item/saveItem",item, Item.class);
    }
}
