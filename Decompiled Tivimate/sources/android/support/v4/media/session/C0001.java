package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: android.support.v4.media.session.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0001 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        return new PlaybackStateCompat.CustomAction(r2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new PlaybackStateCompat.CustomAction[r1];
    }
}
