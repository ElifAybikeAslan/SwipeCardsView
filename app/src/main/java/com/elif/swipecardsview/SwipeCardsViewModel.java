package com.elif.swipecardsview;

/**
 * Created by elfay on 12/10/2017.
 */

public class SwipeCardsViewModel {
    public String ipucuozet,ipucuaciklama;

    public SwipeCardsViewModel(String ipucuozet, String ipucuaciklama) {
        this.ipucuozet = ipucuozet;
        this.ipucuaciklama = ipucuaciklama;
    }

    public String getIpucuozet() {
        return ipucuozet;
    }

    public void setIpucuozet(String ipucuozet) {
        this.ipucuozet = ipucuozet;
    }

    public String getIpucuaciklama() {
        return ipucuaciklama;
    }

    public void setIpucuaciklama(String ipucuaciklama) {
        this.ipucuaciklama = ipucuaciklama;
    }
}
