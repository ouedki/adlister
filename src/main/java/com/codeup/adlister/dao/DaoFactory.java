package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users userDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }

    public static Users getUserDao() {
        if (userDao == null) {
            userDao = new MySQLUsersDao();
        }
        return userDao;
    }
}
