public class Card {
    private String value; // string because values are 1, 2, ... 10, J, Q, K, A
    private String type;
    
    public Card(String value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return value + "-" + type;
    }

    public int getValue() {
        String specialValues = "JQKA";
        if(specialValues.contains(value)) {
            if(value.equals("A")) {
                return 11; // default for Ace will change later to 1
            }

            return 10;
        }
        return Integer.parseInt(value); // all other values from 2 to 10
    }

    public String getType() {
        return type;
    }

    public boolean isAce() {
        return value.equals("A");
    }

    
}
