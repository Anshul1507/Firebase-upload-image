package kietianshub.project.com.firebaseuploadexample;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload() {

    }

    public Upload(String name, String imageUrl) {
        if(name.trim().equals("")){
            name = "No name";
        }
        this.mName = name;
        this.mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public void setImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

}
