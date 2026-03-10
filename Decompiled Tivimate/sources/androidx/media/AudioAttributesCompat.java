package androidx.media;

import android.util.SparseIntArray;
import p279.InterfaceC3946;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC3946 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final /* synthetic */ int f1126 = 0;

    /* JADX INFO: renamed from: ﹳٴ */
    public AudioAttributesImpl f1127;

    static {
        SparseIntArray r0 = new SparseIntArray();
        r0.put(5, 1);
        r0.put(6, 2);
        r0.put(7, 2);
        r0.put(8, 1);
        r0.put(9, 1);
        r0.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof AudioAttributesCompat) == true) goto L5;
        return false;
    L5:
        AudioAttributesCompat r32 = (AudioAttributesCompat) r3;
        AudioAttributesImpl r0 = this.f1127;
        if (r0 != null) goto L13;
        if (r32.f1127 != null) goto L11;
        return true;
    L11:
        return false;
    L13:
        return r0.equals(r32.f1127);
    }

    public final int hashCode() {
        return this.f1127.hashCode();
    }

    public final String toString() {
        return this.f1127.toString();
    }
}
