package gb.builder;


import gb.domain.Claim;
import gb.domain.Service;

public class ClaimBuilder {

    private final Claim claim;

    public ClaimBuilder() {
        claim = new Claim();
    }

    public ClaimBuilder withId(Long id) {
        claim.setId(id);
        return this;
    }

    public ClaimBuilder withCurrentDayNumber(Long currentDayNumber) {
        claim.setCurrentDayNumber(currentDayNumber);
        return this;
    }

    public ClaimBuilder withService(Service service) {
        claim.setService(service);
        return this;
    }

    public Claim build() {
        return claim;
    }
}
