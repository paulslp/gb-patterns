package gb.builder;


import gb.domain.ServiceGroup;

public class ServiceGroupBuilder {

    private final ServiceGroup serviceGroup;

    public ServiceGroupBuilder() {
        serviceGroup = new ServiceGroup();
    }

    public ServiceGroupBuilder withId(Long id) {
        serviceGroup.setId(id);
        return this;
    }

    public ServiceGroupBuilder withName(String name) {
        serviceGroup.setName(name);
        return this;
    }

    public ServiceGroup build() {
        return serviceGroup;
    }
}
