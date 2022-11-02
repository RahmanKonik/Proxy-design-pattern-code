package com.pattern;

public class Brower {
    public static void main(String[] args) {
        WebProxy webProxy = new WebProxy();
        webProxy.renderPage("www.youtube.com");
        webProxy.renderPage("www.facebook.com");
    }
    
}
