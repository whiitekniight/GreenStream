package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p044.C1648;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f1241;

    public MediaCodecDecoderException(IllegalStateException r3, C1648 r4) {
        StringBuilder r0 = new StringBuilder("Decoder failed: ");
        if (r4 != null) goto L5;
        String r42 = null;
    L6:
        r0.append(r42);
        super(r0.toString(), r3);
        boolean r43 = r3 instanceof MediaCodec.CodecException;
        if (r43 == false) goto L9;
        ((MediaCodec.CodecException) r3).getDiagnosticInfo();
    L9:
        if (r43 == false) goto L11;
        int r32 = ((MediaCodec.CodecException) r3).getErrorCode();
    L12:
        this.f1241 = r32;
        return;
    L11:
        r32 = 0;
        goto L12
    L5:
        r42 = r4.f5404;
        goto L6
    }
}
