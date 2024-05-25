package org.Vinayak.DesignPattern.StructuralDesignPattern.Facade;

import java.util.HashMap;
import java.util.Map;


public class Main {
    private final Map<String, String> urlMap;
    private final Map<String, String> reverseUrlMap;
    private final String domain;
    private int counter;
    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public Main(String domain) {
        this.urlMap = new HashMap<>();
        this.reverseUrlMap = new HashMap<>();
        this.domain = domain.endsWith("/") ? domain : domain + "/";
        this.counter = 1;
    }


    public String shortenURL(String longUrl) {
        if (reverseUrlMap.containsKey(longUrl)) {
            return domain + reverseUrlMap.get(longUrl);
        }
        String shortUrl = encode(counter);
        counter++;
        urlMap.put(shortUrl, longUrl);
        reverseUrlMap.put(longUrl, shortUrl);
        return domain + shortUrl;
    }


    public String getOriginalURL(String shortUrl) {
        String key = shortUrl.replace(domain, "");
        return urlMap.getOrDefault(key, null);
    }


    private String encode(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append(BASE62.charAt(number % 62));
            number /= 62;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Main urlShortener = new Main("http://short.ly/");
        String longUrl = "https://betaapp.hirehunch.com/";
        String shortUrl = urlShortener.shortenURL(longUrl);
        System.out.println("Short URL: " + shortUrl);
        System.out.println("Original URL: " + urlShortener.getOriginalURL(shortUrl));
    }
}