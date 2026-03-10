package p441;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ﹶˆ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5569 {
    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static String m10704(String r2) {
        if (r2.toLowerCase(Locale.US).startsWith("android-keystore://") == false) goto L7;
        return r2.substring(19);
    L7:
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m10705(int r3) {
        if (r3 != 16) goto L5;
        return;
    L5:
        if (r3 != 32) goto L8;
        return;
    L8:
        throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r3 * 8)}));
    }
}
