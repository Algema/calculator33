package pro.sky.java.course2.calculator33;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class FirstController {


    @GetMapping
    public String sayWelcome (){
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping (path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2 ) {
        return CalculatorService.sum(num1,num2);
    }

    @GetMapping (path = "/minus")
    public String minus (@RequestParam int num1,@RequestParam int num2) {
        return CalculatorService.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1,@RequestParam int num2) {
        return  CalculatorService.multiply(num1,num2);
    }

    @GetMapping (path = "/divide")
    public String divide (@RequestParam int num1,@RequestParam int num2) {
        return CalculatorService.divide(num1,num2);
    }

}
