package androidx.media3.common.audio;

import p088.C2144;

/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(String r2, C2144 r3) {
        super(r2 + " " + r3);
    }

    public AudioProcessor$UnhandledAudioFormatException(C2144 r2) {
        this("Unhandled input format:", r2);
    }
}
