package org.example.xmlconf;

public class PropertiesInjector {
    private final String appName;
    private final String appVersion;

    public PropertiesInjector(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "PropertiesInjector{" +
                "appName='" + appName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}
