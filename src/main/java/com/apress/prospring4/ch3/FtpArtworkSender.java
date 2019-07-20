package com.apress.prospring4.ch3;

public class FtpArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        System.out.println("FtpArtworkSender.sendArtwork("+artworkPath+", "+recipient+")");
    }

    @Override
    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    @Override
    public String getShortName() {
        return "FTP";
    }
}
