import java.util.Objects;

class CustomKey {
    private String keyName;

    public CustomKey(String keyName) {
        this.keyName = keyName;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) // Student s1== Student s2
        {
            return true;
        }
        if (!(obj instanceof CustomKey)) {
            return false;
        }

        CustomKey custKey = (CustomKey) obj;

        // return keyName==custKey.keyName;
        return Objects.equals(keyName, custKey.keyName);

    }
}