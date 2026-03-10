package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: ⁱˊ */
    public int f1128;

    /* JADX INFO: renamed from: ﹳٴ */
    public AudioAttributes f1129;

    public AudioAttributesImplApi21() {
        this.f1128 = -1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof AudioAttributesImplApi21) == true) goto L7;
        return false;
    L7:
        return this.f1129.equals(((AudioAttributesImplApi21) r2).f1129);
    }

    public final int hashCode() {
        return this.f1129.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1129;
    }
}
