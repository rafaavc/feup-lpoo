abstract class Act {
    private String name, country;
    Act(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    abstract String who();

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;

        if (o.getClass() != this.getClass()) return false;
        Act a = (Act) o;

        return this.country.equals(a.getCountry()) && this.name.equals(a.getName());
    }
}
