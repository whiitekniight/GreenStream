package androidx.media3.exoplayer.source;

import java.io.IOException;
import p317.AbstractC4214;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public ClippingMediaSource$IllegalClippingException(int r7) {
        this(r7, -9223372036854775807L, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(int r5, long r6, long r8) {
        StringBuilder r0 = new StringBuilder("Illegal clipping: ");
        if (r5 == 0) goto L17;
        boolean r1 = true;
        if (r5 != 1) goto L7;
        String r52 = "not seekable to start";
    L18:
        r0.append(r52);
        super(r0.toString());
        return;
    L7:
        if (r5 == 2) goto L10;
        r52 = "unknown";
        goto L18
    L10:
        if (r6 != (-9223372036854775807L)) goto L12;
    L14:
        r1 = false;
    L15:
        AbstractC4214.m8568(r1);
        r52 = "start exceeds end. Start time: " + r6 + ", End time: " + r8;
        goto L18
    L12:
        if (r8 == (-9223372036854775807L)) goto L14;
    L17:
        r52 = "invalid period count";
        goto L18
    }
}
