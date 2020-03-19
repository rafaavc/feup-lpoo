public class AreaStringOutputter {
    private AreaAggregator aggregator;
    AreaStringOutputter(AreaAggregator aggr) {
        aggregator = aggr;
    }

    public String output() {
        return "Sum of areas: " + aggregator.sum();
    }
}
