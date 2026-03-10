package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f4055;

    public StreamResetException(int r3) {
        switch(r3) {
            case 1: goto L17;
            case 2: goto L16;
            case 3: goto L15;
            case 4: goto L14;
            case 5: goto L13;
            case 6: goto L12;
            case 7: goto L11;
            case 8: goto L10;
            case 9: goto L9;
            case 10: goto L8;
            case 11: goto L7;
            case 12: goto L6;
            case 13: goto L5;
            case 14: goto L4;
            default: goto L3;
        };
    L3:
        String r0 = "null";
    L18:
        super("stream was reset: ".concat(r0));
        this.f4055 = r3;
        return;
    L4:
        r0 = "HTTP_1_1_REQUIRED";
        goto L18
    L5:
        r0 = "INADEQUATE_SECURITY";
        goto L18
    L6:
        r0 = "ENHANCE_YOUR_CALM";
        goto L18
    L7:
        r0 = "CONNECT_ERROR";
        goto L18
    L8:
        r0 = "COMPRESSION_ERROR";
        goto L18
    L9:
        r0 = "CANCEL";
        goto L18
    L10:
        r0 = "REFUSED_STREAM";
        goto L18
    L11:
        r0 = "FRAME_SIZE_ERROR";
        goto L18
    L12:
        r0 = "STREAM_CLOSED";
        goto L18
    L13:
        r0 = "SETTINGS_TIMEOUT";
        goto L18
    L14:
        r0 = "FLOW_CONTROL_ERROR";
        goto L18
    L15:
        r0 = "INTERNAL_ERROR";
        goto L18
    L16:
        r0 = "PROTOCOL_ERROR";
        goto L18
    L17:
        r0 = "NO_ERROR";
        goto L18
    }
}
