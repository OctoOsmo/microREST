package jar.ui;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by al on 23.07.2016.
 */

@Document(collection = "Volumes")
public class Volume {
    Integer firstValue = 0;
    Integer secondValue = 0;

    public Volume() {
    }

    public Volume(Integer firstValue, Integer secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Integer getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Integer firstValue) {
        this.firstValue = firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }

    Integer performSubtraction(){
        return firstValue - secondValue;
    }
}
