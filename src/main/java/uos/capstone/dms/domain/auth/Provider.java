package uos.capstone.dms.domain.auth;

public enum Provider {
    GOOGLE("google");

    private final String provider;

    Provider(String provider) {
        this.provider = provider;
    }

    public static Provider of(String provider) {
        switch (provider) {
            case "google" :
                return Provider.GOOGLE;
            default:
                return null;
        }
    }

    public String getProvider() {
        return provider;
    }
}
