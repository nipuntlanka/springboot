package lk.cloudcomputingcw.coursework.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/starlink/")
public class MainClass {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "getOrbitName", method = RequestMethod.POST)
    public OutputRequest getOrbitNameById(@Validated @RequestBody InpurRequest inpurRequest){
        OutputRequest outputRequest = new OutputRequest();
        outputRequest.setOrbitName(mainService.getOrbitName(inpurRequest.getId()));
        return outputRequest;
    }

    @RequestMapping(value = "getOrbitInfo", method = RequestMethod.POST)
    public OutputRequest getOrbitInfo(@Validated @RequestBody InpurRequest inpurRequest){
        OutputRequest outputRequest = new OutputRequest();
        outputRequest.setRet(mainService.getOrbitInfo(inpurRequest));
        return outputRequest;
    }

    @RequestMapping(value = "getSatteliteInfo", method = RequestMethod.POST)
    public OutputRequest getSatteliteInfo(@Validated @RequestBody InpurRequest inpurRequest){
        OutputRequest outputRequest = new OutputRequest();
        outputRequest.setRet(mainService.getSatteliteInfo(inpurRequest));
        return outputRequest;
    }

    @RequestMapping(value = "getConstellationInfo", method = RequestMethod.POST)
    public OutputRequest getConstellationInfo(@Validated @RequestBody InpurRequest inpurRequest){
        OutputRequest outputRequest = new OutputRequest();
        outputRequest.setRet(mainService.getConstellationInfo(inpurRequest));
        return outputRequest;
    }

    @RequestMapping(value = "testget", method = RequestMethod.GET)
    public String testget(){
        return "Hello Nipun";
    }
}
