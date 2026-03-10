package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.ⁱˊ;
import java.util.ArrayList;
import p401.C5112;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C5112 {
    @Override // p401.C5112
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo0(int r5, Bundle r6) {
        if (r6 == null) goto L5;
        r6.setClassLoader(ⁱˊ.class.getClassLoader());
    L5:
        if (r5 != 0) goto L15;
        if (r6 != null) goto L8;
        throw null;
    L8:
        if (r6.containsKey("search_results") == false) goto L19;
        Parcelable[] r52 = r6.getParcelableArray("search_results");
        if (r52 == null) goto L14;
        ArrayList r62 = new ArrayList();
        int r1 = r52.length;
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L17;
        r62.add((MediaBrowserCompat$MediaItem) r52[r2]);
        r2 = r2 + 1;
        goto L12
    L17:
        throw null;
    L14:
        throw null;
    L19:
        throw null;
    L15:
        throw null;
    }
}
