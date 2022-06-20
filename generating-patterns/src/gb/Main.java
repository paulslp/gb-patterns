package gb;

import gb.builder.ClaimBuilder;
import gb.builder.ServiceBuilder;
import gb.builder.ServiceGroupBuilder;
import gb.decorator.ClaimFinderFilterServiceImpl;
import gb.decorator.ClaimFinderServiceImpl;
import gb.domain.Claim;
import gb.domain.Service;
import gb.domain.ServiceGroup;

public class Main {

    public static void main(String[] args) {

        ServiceGroup serviceGroup = new ServiceGroupBuilder()
                .withId(1L)
                .withName("Прием деларации 3-НДФЛ")
                .build();
        Service service = new ServiceBuilder()
                .withServiceGroup(serviceGroup)
                .withId(1L)
                .withName("Прием деларации 3-НДФЛ  физических лиц")
                .build();

        Claim claim = new ClaimBuilder()
                .withId(1L)
                .withService(service)
                .withCurrentDayNumber(1L)
                .build();

        System.out.println(claim.toString());

        new ClaimFinderFilterServiceImpl(new ClaimFinderServiceImpl()).findWithFilter(2L)
                .forEach(it -> System.out.println(it.toString()));
    }
}
