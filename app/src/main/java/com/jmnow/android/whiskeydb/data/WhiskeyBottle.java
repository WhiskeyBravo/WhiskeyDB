package com.jmnow.android.whiskeydb.data;

import com.orm.SugarRecord;

import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Represents a single bottle of whiskey
 */

public class WhiskeyBottle extends SugarRecord<WhiskeyBottle> {

    String name;
    String region;
    Distillery distillery;
    int yearBottled;
    int strengthAsProof;
    String blendType;
    Bottler bottler;
    CaskType[] caskTypes;
    long caskNumber;
    long bottleNumber;


    /**
     * Equality overrides
     */
    public boolean equals(WhiskeyBottle another) {
        return (another instanceof WhiskeyBottle)
                && mId.equals(another.mId)
                && mName.equals(another.mName)
                && mDescription.equals(another.mDescription)
                && mOnTimes.equals(another.mOnTimes)
                && mOffTimes.equals(another.mOffTimes)
                && mCreatedAt.equals(another.mCreatedAt)
                && mModifiedAt.equals(another.mModifiedAt)
                && mShortUrl.equals(another.mShortUrl);
    }

    public int hashCode() {
        // you pick a hard-coded, randomly chosen, non-zero, odd number
        // ideally different for each class
        return new HashCodeBuilder(17, 37).
                append(mId).
                append(mName).
                append(mDescription).
                append(mOnTimes).
                append(mOffTimes).
                append(mCreatedAt).
                append(mModifiedAt).
                append(mShortUrl).
                toHashCode();
    }


}
