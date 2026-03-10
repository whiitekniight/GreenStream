package p437;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import p067.C1954;
import p317.AbstractC4195;

/* JADX INFO: renamed from: ﹶ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C5531 implements InterfaceC5519 {
    /* JADX INFO: renamed from: ﹳٴ */
    public final AudioTrack m10668(C5508 r6, C1954 r7, int r8, Context r9) {
        int r0 = Build.VERSION.SDK_INT;
        int r1 = r6.f19733;
        int r2 = r6.f19730;
        int r3 = r6.f19734;
        String r4 = AbstractC4195.f15423;
        AudioFormat r12 = new AudioFormat.Builder().setSampleRate(r1).setChannelMask(r2).setEncoding(r3).build();
        if (r6.f19731 == false) goto L5;
        AudioAttributes r72 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    L6:
        AudioTrack.Builder r73 = new AudioTrack.Builder().setAudioAttributes(r72).setAudioFormat(r12).setTransferMode(1).setBufferSizeInBytes(r6.f19735).setSessionId(r8);
        if (r0 < 29) goto L10;
        r73.setOffloadedPlayback(r6.f19732);
    L10:
        if (r0 < 34) goto L14;
        if (r9 == null) goto L14;
        r73.setContext(r9);
    L14:
        return r73.build();
    L5:
        r72 = (AudioAttributes) r7.m4988().ʾˋ;
        goto L6
    }
}
