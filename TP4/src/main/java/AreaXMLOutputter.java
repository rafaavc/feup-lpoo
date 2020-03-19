public class AreaXMLOutputter {
    SumProvider aggregator;
    AreaXMLOutputter(SumProvider aggr) {
        aggregator = aggr;
    }

    public String output() {
        return "<area>" + aggregator.sum() + "</area>";
    }
}
