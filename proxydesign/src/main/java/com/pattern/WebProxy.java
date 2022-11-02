package com.pattern;

public class WebProxy implements WebPage {
    private WebPage webPage;

    public WebProxy(){
        this.webPage = new WebPageImpl();
    }
     
    public void renderPage( String pageUrl){
        if(pageUrl.equalsIgnoreCase("www.youtube.com")){
            System.out.println(pageUrl + " site is block!");
        }
        else{
            webPage.renderPage(pageUrl);
        }

    }
    
}
