import java.util.*;

public class CountryCapitalMap {
    private Map<String, String> M1;

    public CountryCapitalMap() {
        M1 = new HashMap<>();
    }

    public void saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capital)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Map<String, String> getReversedMap() {
        Map<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public List<String> getCountryNames() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapitalMap ccm = new CountryCapitalMap();
        ccm.saveCountryCapital("India", "Delhi");
        ccm.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital of India: " + ccm.getCapital("India"));
        System.out.println("Country for capital Delhi: " + ccm.getCountry("Delhi"));
        System.out.println("Reversed Map: " + ccm.getReversedMap());
        System.out.println("Country Names: " + ccm.getCountryNames());
    }
}