package hu.pistiz.example.microservice.creatorui.client;

import hu.pistiz.example.microservice.engineinterface.Engine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("engine-service")
public interface EngineRestClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Engine> getEngines();

}
