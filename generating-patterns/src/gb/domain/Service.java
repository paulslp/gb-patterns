package gb.domain;

public class Service {

    private Long id;

    private String name;

    private ServiceGroup group;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(ServiceGroup group) {
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ServiceGroup getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
