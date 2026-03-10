package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.ⁱˊ;
import p401.C5112;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C5112 {
    @Override // p401.C5112
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo0(int r3, Bundle r4) {
        if (r4 == null) goto L5;
        r4.setClassLoader(ⁱˊ.class.getClassLoader());
    L5:
        if (r3 != 0) goto L17;
        if (r4 != null) goto L8;
        throw null;
    L8:
        if (r4.containsKey("media_item") == false) goto L19;
        Parcelable r32 = r4.getParcelable("media_item");
        if (r32 != null) goto L12;
    L15:
        MediaBrowserCompat$MediaItem r33 = (MediaBrowserCompat$MediaItem) r32;
        throw null;
    L12:
        if ((r32 instanceof MediaBrowserCompat$MediaItem) == true) goto L15;
        throw null;
    L19:
        throw null;
    L17:
        throw null;
    }
}
