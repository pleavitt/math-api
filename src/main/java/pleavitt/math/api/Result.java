package pleavitt.math.api;

import lombok.Data;

@Data
public class Result {
    private float result;

    public Result(float result) {
        this.result = result;
    }
}
