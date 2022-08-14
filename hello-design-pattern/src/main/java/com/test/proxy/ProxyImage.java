package com.test.proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        if(realImage == null){
            this.realImage = new RealImage(this.fileName);
        }
        realImage.display();
    }
}
