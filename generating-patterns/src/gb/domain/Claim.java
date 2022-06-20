package gb.domain;


public class Claim {

    Long id;

    Long currentDayNumber;

    Service service;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurrentDayNumber(Long currentDayNumber) {
        this.currentDayNumber = currentDayNumber;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Long getId() {
        return id;
    }

    public Long getCurrentDayNumber() {
        return currentDayNumber;
    }

    public Service getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", currentDayNumber=" + currentDayNumber +
                ", service=" + service +
                '}';
    }
}
