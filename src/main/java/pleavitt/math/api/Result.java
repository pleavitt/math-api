package pleavitt.math.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Result {
    private float result;

    public Result(float result){
        this.result = result;
    }
}
