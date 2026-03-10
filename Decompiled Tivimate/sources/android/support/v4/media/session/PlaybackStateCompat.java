package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final long f23;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f24;

    /* JADX INFO: renamed from: ˈٴ */
    public final float f25;

    /* JADX INFO: renamed from: ˉٴ */
    public final long f26;

    /* JADX INFO: renamed from: ˊʻ */
    public final int f27;

    /* JADX INFO: renamed from: ٴʼ */
    public final long f28;

    /* JADX INFO: renamed from: ٴᵢ */
    public final CharSequence f29;

    /* JADX INFO: renamed from: ᴵˊ */
    public final long f30;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final long f31;

    /* JADX INFO: renamed from: ᵎˊ */
    public final Bundle f32;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final ArrayList f33;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = null;

        /* JADX INFO: renamed from: ʽʽ */
        public final int f34;

        /* JADX INFO: renamed from: ʾˋ */
        public final String f35;

        /* JADX INFO: renamed from: ˈٴ */
        public final Bundle f36;

        /* JADX INFO: renamed from: ᴵˊ */
        public final CharSequence f37;

        static {
            CREATOR = new C0001();
        }

        public CustomAction(Parcel r2) {
            this.f35 = r2.readString();
            this.f37 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r2);
            this.f34 = r2.readInt();
            this.f36 = r2.readBundle(ⁱˊ.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f37 + ", mIcon=" + this.f34 + ", mExtras=" + this.f36;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            r2.writeString(this.f35);
            TextUtils.writeToParcel(this.f37, r2, r3);
            r2.writeInt(this.f34);
            r2.writeBundle(this.f36);
        }
    }

    static {
        CREATOR = new android.support.v4.media.ﹳٴ(8);
    }

    public PlaybackStateCompat(Parcel r3) {
        this.f24 = r3.readInt();
        this.f30 = r3.readLong();
        this.f25 = r3.readFloat();
        this.f26 = r3.readLong();
        this.f23 = r3.readLong();
        this.f31 = r3.readLong();
        this.f29 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r3);
        this.f33 = r3.createTypedArrayList(CustomAction.CREATOR);
        this.f28 = r3.readLong();
        this.f32 = r3.readBundle(ⁱˊ.class.getClassLoader());
        this.f27 = r3.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("PlaybackState {state=");
        r0.append(this.f24);
        r0.append(", position=");
        r0.append(this.f30);
        r0.append(", buffered position=");
        r0.append(this.f23);
        r0.append(", speed=");
        r0.append(this.f25);
        r0.append(", updated=");
        r0.append(this.f26);
        r0.append(", actions=");
        r0.append(this.f31);
        r0.append(", error code=");
        r0.append(this.f27);
        r0.append(", error message=");
        r0.append(this.f29);
        r0.append(", custom actions=");
        r0.append(this.f33);
        r0.append(", active item id=");
        return AbstractC0002.m8(r0, this.f28, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.f24);
        r3.writeLong(this.f30);
        r3.writeFloat(this.f25);
        r3.writeLong(this.f26);
        r3.writeLong(this.f23);
        r3.writeLong(this.f31);
        TextUtils.writeToParcel(this.f29, r3, r4);
        r3.writeTypedList(this.f33);
        r3.writeLong(this.f28);
        r3.writeBundle(this.f32);
        r3.writeInt(this.f27);
    }
}
