package pleavitt.math.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @CrossOrigin
    @GetMapping("/add")
    public Result doAdd(@RequestParam float op1, @RequestParam float op2) {
        return new Result(op1 + op2);
    }

    @CrossOrigin
    @GetMapping("/subtract")
    public Result doSubtract(@RequestParam float op1, @RequestParam float op2) {
        return new Result(op1 - op2);
    }

    @CrossOrigin
    @GetMapping("/multiply")
    public Result doMultiply(@RequestParam float op1, @RequestParam float op2) {
        return new Result(op1 * op2);
    }

    @CrossOrigin
    @GetMapping("/divide")
    public Result doDivide(@RequestParam float op1, @RequestParam float op2) {
        return new Result(op1 / op2);
    }

    @CrossOrigin
    @GetMapping("/power")
    public Result doPower(@RequestParam float op1, @RequestParam float op2) {
        return new Result((float) Math.pow(op1, op2));
    }

    @CrossOrigin
    @GetMapping("/square_root")
    public Result doSquareRoot(@RequestParam float op1) {
        return new Result((float) Math.sqrt(op1));
    }

    @CrossOrigin
    @GetMapping("/log10")
    public Result doLog10(@RequestParam float op1) {
        return new Result((float) Math.log10(op1));
    }

    @CrossOrigin
    @GetMapping("/ln")
    public Result doLogNatural(@RequestParam float op1) {
        return new Result((float) Math.log(op1));
    }

    @CrossOrigin
    @GetMapping("/pi")
    public Result doPi() {
        return new Result((float) Math.PI);
    }
}
