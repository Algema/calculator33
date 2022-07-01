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
    public String plus(@RequestParam (value = "num1",required = false) Integer a,
                       @RequestParam(value = "num2", required = false ) Integer b) {
        return CalculatorService.sum(a,b);
    }

    @GetMapping (path = "/minus")
   public String minus (@RequestParam (value = "num1",required = false) Integer a,
                        @RequestParam(value = "num2", required = false ) Integer b) {
        return CalculatorService.minus(a,b);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam (value = "num1",required = false) Integer a,
                            @RequestParam(value = "num2", required = false ) Integer b) {
        return  CalculatorService.multiply(a,b);
    }

    @GetMapping (path = "/divide")
    public String divide (@RequestParam (value = "num1",required = false) Integer a,
                          @RequestParam(value = "num2", required = false ) Integer b) {
        return CalculatorService.divide(a,b);
    }

}
