package space.am8.dicodingsubmission;

import android.os.Parcel;
import android.os.Parcelable;

public class Android implements Parcelable {
    private String name, remarks, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
    }

    public Android() {
    }
    protected Android(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
    }
    public static final Parcelable.Creator<Android> CREATOR = new Parcelable.Creator<Android>() {
        @Override
        public Android createFromParcel(Parcel source) {
            return new Android(source);
        }
        @Override
        public Android[] newArray(int size) {
            return new Android[size];
        }
    };
}
