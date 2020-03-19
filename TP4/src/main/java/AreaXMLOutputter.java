public class AreaXMLOutputter {
    AreaAggregator aggregator;
    AreaXMLOutputter(AreaAggregator aggr) {
        aggregator = aggr;
    }

    public String output() {
        return "<area>" + aggregator.sum() + "</area>";
    }
}
