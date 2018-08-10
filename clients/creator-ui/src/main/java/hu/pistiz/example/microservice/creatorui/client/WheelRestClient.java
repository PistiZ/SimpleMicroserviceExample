package hu.pistiz.example.microservice.creatorui.client;

import hu.pistiz.example.microservice.wheelinterface.Wheel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("wheel-service")
public interface WheelRestClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Wheel> getWheels();

}
