package gb.decorator;

public abstract class ClaimFinderDecorator implements ClaimFinderService {

    private final ClaimFinderService claimFinderService;

    public ClaimFinderDecorator(ClaimFinderService claimFinderService) {
        this.claimFinderService = claimFinderService;
    }

    public ClaimFinderService getClaimFinderService() {
        return claimFinderService;
    }
}
