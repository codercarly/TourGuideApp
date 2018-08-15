package com.example.carly.tourguideapp;

public class Location {

    // Location name
    private String mLocationMain;  // m in front of the variable shows that it's Private.

    // Location info
    private String mLocationInfo;

    // Resource ID for the image associated with the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for the word
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor - Create a new location object
     * @param locationMain is the main location in the category.
     * @param locationInfo is the contact information or address of the location.
     */
    public Location(String locationMain, String locationInfo) {
        mLocationMain = locationMain;
        mLocationInfo = locationInfo;
    }

    /**
     * Constructor - Create a new location object with an image
     * @param locationMain is the main location in the category.
     * @param locationInfo is the contact information or address of the location.
     * @param imageResourceId is the drawable resource ID associated with the word.
     */
    public Location(String locationMain, String locationInfo, int imageResourceId) {
        mLocationMain = locationMain;
        mLocationInfo = locationInfo;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the Main Location name
     */
    public String getLocationMain() {
        return mLocationMain;
    }

    /**
     * Get the Main Location info
     */
    public String getLocationInfo() {
        return mLocationInfo;
    }

    /**
     * Get the Image Resource ID for the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for the word
     */
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED;}

}
