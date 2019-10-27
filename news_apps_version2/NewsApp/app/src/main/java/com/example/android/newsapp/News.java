package com.example.android.newsapp;

public class News {

    /** Title of the news*/
    private String mTitle;

    /** News section name */
    private String mSection;

    /** Author of the news */
    private String mAuthor;

    /** Website URL of the news*/
    private String mUrl;

    /* News published date*/
    private String mDate;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title is the title of the news
     * @param section is the section from which news is
     * @param date is the date the news was published
     * @param url is the website URL to find more details about the news
     */
    public News(String title, String section, String date, String author,String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mAuthor = author;
        mUrl = url;
    }

    /**
     * Returns the title of the news
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the news
     */
    public String getSection() {
        return mSection;
    }

    /**
     * *Returns the author of the news
     * @return
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**Returns the date the news was published
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }


}

