package androidx.media;

import java.util.Arrays;
import p319.AbstractC4223;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: ʽ */
    public int f1130;

    /* JADX INFO: renamed from: ˈ */
    public int f1131;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f1132;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f1133;

    public AudioAttributesImplBase() {
        this.f1133 = 0;
        this.f1132 = 0;
        this.f1130 = 0;
        this.f1131 = -1;
    }

    public final boolean equals(Object r11) {
        if ((r11 instanceof AudioAttributesImplBase) == true) goto L5;
        return false;
    L5:
        AudioAttributesImplBase r112 = (AudioAttributesImplBase) r11;
        if (this.f1132 != r112.f1132) goto L35;
        int r0 = this.f1130;
        int r2 = r112.f1130;
        int r3 = r112.f1131;
        if (r3 == (-1)) goto L10;
        int r9 = r3;
    L24:
        if (r9 != 6) goto L26;
        r2 = r2 | 4;
    L29:
        if (r0 != (r2 & 273)) goto L35;
        if (this.f1133 != r112.f1133) goto L35;
        if (this.f1131 != r3) goto L35;
        return true;
    L26:
        if (r9 != 7) goto L29;
        r2 = r2 | 1;
        goto L29
    L10:
        int r4 = r112.f1133;
        int r8 = AudioAttributesCompat.f1126;
        if ((r2 & 1) != 1) goto L13;
        r9 = 7;
        goto L24
    L13:
        r9 = 4;
        if ((r2 & 4) != 4) goto L16;
        r9 = 6;
        goto L24
    L16:
        switch(r4) {
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L24;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L21;
            case 8: goto L21;
            case 9: goto L21;
            case 10: goto L21;
            case 11: goto L19;
            case 12: goto L17;
            case 13: goto L18;
            default: goto L17;
        };
    L17:
        r9 = 3;
        goto L24
    L18:
        r9 = 1;
        goto L24
    L19:
        r9 = 10;
        goto L24
    L20:
        r9 = 2;
        goto L24
    L21:
        r9 = 5;
        goto L24
    L22:
        r9 = 8;
        goto L24
    L23:
        r9 = 0;
    L35:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1132), Integer.valueOf(this.f1130), Integer.valueOf(this.f1133), Integer.valueOf(this.f1131)});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1131 == (-1)) goto L5;
        r0.append(" stream=");
        r0.append(this.f1131);
        r0.append(" derived");
    L5:
        r0.append(" usage=");
        int r1 = this.f1133;
        int r2 = AudioAttributesCompat.f1126;
        switch(r1) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L21;
            case 3: goto L20;
            case 4: goto L19;
            case 5: goto L18;
            case 6: goto L17;
            case 7: goto L16;
            case 8: goto L15;
            case 9: goto L14;
            case 10: goto L13;
            case 11: goto L12;
            case 12: goto L11;
            case 13: goto L10;
            case 14: goto L9;
            case 15: goto L7;
            case 16: goto L8;
            default: goto L7;
        };
    L7:
        String r12 = AbstractC4223.m8643(r1, "unknown usage ");
    L24:
        r0.append(r12);
        r0.append(" content=");
        r0.append(this.f1132);
        r0.append(" flags=0x");
        r0.append(Integer.toHexString(this.f1130).toUpperCase());
        return r0.toString();
    L8:
        r12 = "USAGE_ASSISTANT";
        goto L24
    L9:
        r12 = "USAGE_GAME";
        goto L24
    L10:
        r12 = "USAGE_ASSISTANCE_SONIFICATION";
        goto L24
    L11:
        r12 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
        goto L24
    L12:
        r12 = "USAGE_ASSISTANCE_ACCESSIBILITY";
        goto L24
    L13:
        r12 = "USAGE_NOTIFICATION_EVENT";
        goto L24
    L14:
        r12 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
        goto L24
    L15:
        r12 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
        goto L24
    L16:
        r12 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
        goto L24
    L17:
        r12 = "USAGE_NOTIFICATION_RINGTONE";
        goto L24
    L18:
        r12 = "USAGE_NOTIFICATION";
        goto L24
    L19:
        r12 = "USAGE_ALARM";
        goto L24
    L20:
        r12 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
        goto L24
    L21:
        r12 = "USAGE_VOICE_COMMUNICATION";
        goto L24
    L22:
        r12 = "USAGE_MEDIA";
        goto L24
    L23:
        r12 = "USAGE_UNKNOWN";
        goto L24
    }
}
