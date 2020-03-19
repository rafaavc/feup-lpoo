public class AreaStringOutputter {
    private SumProvider aggregator;
    AreaStringOutputter(SumProvider aggr) {
        aggregator = aggr;
    }

    public String output() {
        return "Sum of areas: " + aggregator.sum();
    }
}
