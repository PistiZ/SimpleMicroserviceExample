package hu.pistiz.example.microservice.creatorui.client;

import hu.pistiz.example.microservice.chassisinterface.Chassis;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("chassis-service")
public interface ChassisRestClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Chassis> getChassisList();

}
