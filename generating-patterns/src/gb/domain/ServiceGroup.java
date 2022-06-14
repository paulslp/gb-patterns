package gb.domain;

public class ServiceGroup {

    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ServiceGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
