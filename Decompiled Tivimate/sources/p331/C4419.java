package p331;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p047.AbstractC1703;
import p133.AbstractC2509;
import p241.C3608;
import p308.AbstractC4142;
import p351.AbstractC4711;

/* JADX INFO: renamed from: ᴵˈ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4419 extends AbstractC4711 {
    public static final Parcelable.Creator<C4419> CREATOR = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final C4419 f16164 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final PendingIntent f16165;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16166;

    /* JADX INFO: renamed from: ˈٴ */
    public final String f16167;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f16168;

    static {
        f16164 = new C4419(0);
        CREATOR = new ٴﹶ(0);
    }

    public C4419(int r3) {
        this(1, r3, null, null);
    }

    public C4419(int r1, int r2, PendingIntent r3, String r4) {
        this.f16166 = r1;
        this.f16168 = r2;
        this.f16165 = r3;
        this.f16167 = r4;
    }

    public C4419(int r3, PendingIntent r4) {
        this(1, r3, r4, null);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m8825(int r2) {
        if (r2 != 99) goto L5;
        return "UNFINISHED";
    L5:
        if (r2 == 1500) goto L62;
        switch(r2) {
            case -1: goto L60;
            case 0: goto L58;
            case 1: goto L56;
            case 2: goto L54;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L48;
            case 6: goto L46;
            case 7: goto L44;
            case 8: goto L42;
            case 9: goto L40;
            case 10: goto L38;
            case 11: goto L36;
            default: goto L7;
        };
    L7:
        switch(r2) {
            case 13: goto L34;
            case 14: goto L32;
            case 15: goto L30;
            case 16: goto L28;
            case 17: goto L26;
            case 18: goto L24;
            case 19: goto L22;
            case 20: goto L20;
            case 21: goto L18;
            case 22: goto L16;
            case 23: goto L14;
            case 24: goto L12;
            case 25: goto L10;
            default: goto L9;
        };
    L10:
        return "API_INSTALL_REQUIRED";
    L12:
        return "API_DISABLED_FOR_CONNECTION";
    L14:
        return "API_DISABLED";
    L16:
        return "RESOLUTION_ACTIVITY_NOT_FOUND";
    L18:
        return "API_VERSION_UPDATE_REQUIRED";
    L20:
        return "RESTRICTED_PROFILE";
    L22:
        return "SERVICE_MISSING_PERMISSION";
    L24:
        return "SERVICE_UPDATING";
    L26:
        return "SIGN_IN_FAILED";
    L28:
        return "API_UNAVAILABLE";
    L30:
        return "INTERRUPTED";
    L32:
        return "TIMEOUT";
    L34:
        return "CANCELED";
    L9:
        return AbstractC1703.m4484(r2, "UNKNOWN_ERROR_CODE(", ")");
    L36:
        return "LICENSE_CHECK_FAILED";
    L38:
        return "DEVELOPER_ERROR";
    L40:
        return "SERVICE_INVALID";
    L42:
        return "INTERNAL_ERROR";
    L44:
        return "NETWORK_ERROR";
    L46:
        return "RESOLUTION_REQUIRED";
    L48:
        return "INVALID_ACCOUNT";
    L50:
        return "SIGN_IN_REQUIRED";
    L52:
        return "SERVICE_DISABLED";
    L54:
        return "SERVICE_VERSION_UPDATE_REQUIRED";
    L56:
        return "SERVICE_MISSING";
    L58:
        return "SUCCESS";
    L60:
        return "UNKNOWN";
    L62:
        return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4419) == true) goto L8;
        return false;
    L8:
        C4419 r52 = (C4419) r5;
        if (this.f16168 == r52.f16168) goto L11;
    L15:
        return false;
    L11:
        if (AbstractC4142.m8390(this.f16165, r52.f16165) == false) goto L15;
        if (AbstractC4142.m8390(this.f16167, r52.f16167) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16168), this.f16165, this.f16167});
    }

    public final String toString() {
        C3608 r0 = new C3608(this);
        r0.m7558(m8825(this.f16168), "statusCode");
        r0.m7558(this.f16165, "resolution");
        r0.m7558(this.f16167, "message");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = AbstractC2509.m5769(r5, 20293);
        AbstractC2509.m5756(r5, 1, 4);
        r5.writeInt(this.f16166);
        AbstractC2509.m5756(r5, 2, 4);
        r5.writeInt(this.f16168);
        AbstractC2509.m5761(r5, 3, this.f16165, r6);
        AbstractC2509.m5765(r5, 4, this.f16167);
        AbstractC2509.m5758(r5, r0);
    }
}
