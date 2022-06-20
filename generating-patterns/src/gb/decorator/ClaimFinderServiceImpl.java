package gb.decorator;

import gb.builder.ClaimBuilder;
import gb.builder.ServiceBuilder;
import gb.builder.ServiceGroupBuilder;
import gb.domain.Claim;
import gb.domain.Service;
import gb.domain.ServiceGroup;

import java.util.ArrayList;
import java.util.List;

public class ClaimFinderServiceImpl implements ClaimFinderService {

    public List<Claim> find() {

        ServiceGroup serviceGroup1 = new ServiceGroupBuilder()
                .withId(1L)
                .withName("Прием деларации 3-НДФЛ")
                .build();
        Service service1 = new ServiceBuilder()
                .withServiceGroup(serviceGroup1)
                .withId(1L)
                .withName("Прием деларации 3-НДФЛ  физических лиц")
                .build();
        Claim claim1 = new ClaimBuilder()
                .withId(1L)
                .withService(service1)
                .withCurrentDayNumber(1L)
                .build();

        ServiceGroup serviceGroup2 = new ServiceGroupBuilder()
                .withId(2L)
                .withName("Прием деларации 4-НДФЛ")
                .build();
        Service service2 = new ServiceBuilder()
                .withServiceGroup(serviceGroup2)
                .withId(2L)
                .withName("Прием деларации 4-НДФЛ")
                .build();
        Claim claim2 = new ClaimBuilder()
                .withId(2L)
                .withService(service2)
                .withCurrentDayNumber(2L)
                .build();
        List<Claim> claims = new ArrayList<>();
        claims.add(claim1);
        claims.add(claim2);
        System.out.println("call find()");
        return claims;
    }

}
