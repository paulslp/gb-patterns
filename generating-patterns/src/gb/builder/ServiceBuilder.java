package gb.builder;

import gb.domain.Service;
import gb.domain.ServiceGroup;

public class ServiceBuilder {

    private final Service service;

    public ServiceBuilder() {
        service = new Service();
    }

    public ServiceBuilder withId(Long id) {
        service.setId(id);
        return this;
    }

    public ServiceBuilder withName(String name) {
        service.setName(name);
        return this;
    }

    public ServiceBuilder withServiceGroup(ServiceGroup serviceGroup) {
        service.setGroup(serviceGroup);
        return this;
    }

    public Service build() {
        return service;
    }
}
