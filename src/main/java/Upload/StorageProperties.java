package Upload;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "C:\\Users\\mwin.cs-lap1-PC\\claimAcademy\\CarSalesWorkspace\\RegisterAndLogin\\src\\main\\java\\Upload";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
