package pleavitt.math.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add")
    public Result doAdd(@RequestParam float op1, @RequestParam float op2){
        return new Result(op1 + op2);
    }

    @GetMapping("/subtract")
    public Result doSubtract(@RequestParam float op1, @RequestParam float op2){
        return new Result(op1 + op2);
    }

    @GetMapping("/multiply")
    public Result doMultiply(@RequestParam float op1, @RequestParam float op2){
        return new Result(op1 + op2);
    }

    @GetMapping("/divide")
    public Result doDivide(@RequestParam float op1, @RequestParam float op2){
        return new Result(op1 + op2);
    }
}
