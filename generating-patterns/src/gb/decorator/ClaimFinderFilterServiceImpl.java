package gb.decorator;

import gb.domain.Claim;

import java.util.List;
import java.util.stream.Collectors;

public class ClaimFinderFilterServiceImpl extends ClaimFinderDecorator {


    public ClaimFinderFilterServiceImpl(ClaimFinderService claimFinderService) {
        super(claimFinderService);
    }

    public List<Claim> find() {
        return super.getClaimFinderService().find();
    }

    public List<Claim> findWithFilter(long serviceGroupId) {
        return find().stream().filter(it -> it.getService().getGroup().getId() == serviceGroupId)
                .collect(Collectors.toList());
    }
}
