package pixel.academy.spring_core_container.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.spring_core_container.common.Chef;

@RestController
public class DemoControler {

    private Chef myChef;

    //constructor

    @Autowired
    public void DemoController( @Qualifier("italianChef") Chef theChef) {
        myChef = theChef;
    }
    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
