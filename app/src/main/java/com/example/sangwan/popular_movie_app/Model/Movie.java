package com.example.sangwan.popular_movie_app.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Amit Sangwan on 28-04-2016.
 */
public class Movie implements Parcelable {


    private long mId;
    private String mTitle;
    private String mPoster;
    private String mOverview;
    private String mUserRating;
    private String mReleaseDate;
    private String mBackdrop;

    public Movie(long mId, String mTitle, String mPoster, String mOverview, String mUserRating, String mReleaseDate, String mBackdrop) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mPoster = mPoster;
        this.mOverview = mOverview;
        this.mUserRating = mUserRating;
        this.mReleaseDate = mReleaseDate;
        this.mBackdrop = mBackdrop;
    }
    private Movie(){

    }
    protected Movie(Parcel in) {
        mId = in.readLong();
        mTitle = in.readString();
        mPoster = in.readString();
        mOverview = in.readString();
        mUserRating = in.readString();
        mReleaseDate = in.readString();
        mBackdrop = in.readString();
    }

    public long getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getPoster() {
        return mPoster;
    }

    public String getOverview() {
        return mOverview;
    }

    public String getUserRating() {
        return mUserRating;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public String getBackdrop() {
        return mBackdrop;
    }



    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            Movie mv = new Movie();
            mv.mId = in.readLong();
            mv.mBackdrop = in.readString();
            mv.mOverview = in.readString();
            mv.mPoster = in.readString();
            mv.mUserRating = in.readString();
            mv.mReleaseDate = in.readString();
            mv.mTitle = in.readString();
            return mv;
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mId);
        dest.writeString(mTitle);
        dest.writeString(mPoster);
        dest.writeString(mOverview);
        dest.writeString(mUserRating);
        dest.writeString(mReleaseDate);
        dest.writeString(mBackdrop);
    }
}
