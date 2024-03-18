package com.example.bottomnavlatihan;
public class ItemPepeleg {

    String name, absen, image;

    public ItemPepeleg(String name, String absen, String image) {
        this.name = name;
        this.absen = "Absen: " + absen;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
