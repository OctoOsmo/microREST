package jar.ui;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

/**
 * Created by al on 23.07.2016.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/subtract/{name}", method = RequestMethod.GET)
    public String subtractValuesGet(
//            @RequestHeader(required = true)HttpHeaders HeaderRequest,
//            @RequestBody(required = true)Volume volume,
            @RequestParam(value = "id", defaultValue = "1488") int num,
            @PathVariable(value = "name") String name
    ){
        return "Res "
                + name
                + " "
                + num
//                + " result = "
//                + (volume.getFirstValue() - volume.getSecondValue())
//                + " result 2 = "
//                + volume.performSubtraction()
        ;
    }


    @RequestMapping(value = "/subtract/{name}", method = RequestMethod.POST)
    public String subtractValues(
            @RequestHeader(required = true)HttpHeaders HeaderRequest,
            @RequestBody(required = true)Volume volume,
            @RequestParam(value = "id", defaultValue = "1488") int num,
            @PathVariable(value = "name") String name
            ){
        return "Res "
                + name
                + " "
                + num
                + " result = "
                + (volume.getFirstValue() - volume.getSecondValue()
                + " result 2 = "
                + volume.performSubtraction()
        );
    }
}
