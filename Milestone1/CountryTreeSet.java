import java.util.TreeSet;

public class CountryTreeSet {
    private TreeSet<String> treeSet;

    public CountryTreeSet() {
        this.treeSet = new TreeSet<>();
    }

    public TreeSet<String> saveCountryNames(String CountryName) {
        treeSet.add(CountryName);
        return treeSet;
    }

    public String getCountry(String CountryName) {
        return treeSet.contains(CountryName) ? CountryName : null;
    }

    public static void main(String[] args) {
        CountryTreeSet country = new CountryTreeSet();
        country.saveCountryNames("India");
        country.saveCountryNames("USA");
        System.out.println(country.getCountry("India"));  // Output: India
        System.out.println(country.getCountry("UK"));     // Output: null
    }
}