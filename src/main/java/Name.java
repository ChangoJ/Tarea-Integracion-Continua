public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberCharacter(){
        int count = name.length();
        return count;
    }

    public String getAttributeBackwards(){
        String nameBackwards = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            nameBackwards += name.charAt(i);
        }
        return nameBackwards;
    }

}
