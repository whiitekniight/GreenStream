package androidx.media;

import p279.AbstractC3948;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
    }

    public static AudioAttributesImplBase read(AbstractC3948 r3) {
        AudioAttributesImplBase r0 = new AudioAttributesImplBase();
        r0.f1133 = r3.m8093(r0.f1133, 1);
        r0.f1132 = r3.m8093(r0.f1132, 2);
        r0.f1130 = r3.m8093(r0.f1130, 3);
        r0.f1131 = r3.m8093(r0.f1131, 4);
        return r0;
    }

    public static void write(AudioAttributesImplBase r2, AbstractC3948 r3) {
        r3.getClass();
        r3.m8087(r2.f1133, 1);
        r3.m8087(r2.f1132, 2);
        r3.m8087(r2.f1130, 3);
        r3.m8087(r2.f1131, 4);
    }
}
